package io.energy.ua.service;

import io.energy.ua.model.InitialDataModel;
import io.energy.ua.utility.UtilityEnergyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ManagerService {
    private final Map<Integer, InitialDataModel> data = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() throws NoSuchFieldException, IllegalAccessException {
        for (int year = 2008; year < 2018; year++) {
            InitialDataModel initialDataModel = new InitialDataModel();
            for (Month month : Month.values()) {
                for (InitialDataModel.Fields field : InitialDataModel.Fields.values()) {
                    List<Integer> value = UtilityEnergyService.ranges.get(field);

                    Random random = new Random();

                    Field fieldMap = initialDataModel.getClass().getDeclaredField(field.name());
                    fieldMap.setAccessible(true);

                    @SuppressWarnings("unchecked")
                    Map<Month, Double> map = (Map<Month, Double>) fieldMap.get(initialDataModel);
                    map.put(month, random.nextDouble(value.get(0), value.get(1) + 1));
                }
            }
            data.put(year, initialDataModel);
        }
    }

    public Map<Integer, InitialDataModel> getData(List<Integer> years) {
        if (years != null && !years.isEmpty()) {
            return data.entrySet().stream()
                    .filter(entry -> years.contains(entry.getKey()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }

        return data;
    }

    public Map<String, String> getMeasurement() {
        Map<String, String> measurement = new HashMap<>();

        measurement.put("electricityConsumption", "1000 * MW * H");
        measurement.put("electricityCost", "UAH");
        measurement.put("electricityProduction", "kW * H");
        measurement.put("electricityProductionCost", "UAH");
        measurement.put("heatProductionForSale", "GKal");
        measurement.put("heatSales", "MW");
        measurement.put("heatConsumption", "GKal");
        measurement.put("heatOwnUseCost", "UAH");
        measurement.put("gasConsumption", "m^3");
        measurement.put("gasCost", "USD");
        measurement.put("waterConsumption", "m^3");
        measurement.put("waterCost", "USD");
        measurement.put("coalConsumption", "tonnes");
        measurement.put("coalCost", "USD");
        measurement.put("fuelOilConsumption", "liters");
        measurement.put("fuelOilCost", "USD");
        measurement.put("dieselFuelConsumption", "liters");
        measurement.put("dieselFuelCost", "USD");
        measurement.put("gasolineConsumption", "liters");
        measurement.put("gasolineCost", "USD");
        measurement.put("lubricatingMaterialsConsumption", "kg");
        measurement.put("lubricatingMaterialsCost", "USD");
        measurement.put("wastewaterDisposal", "m^3");
        measurement.put("wastewaterDisposalCost", "USD");
        measurement.put("solidWasteVolume", "m^3");
        measurement.put("solidWasteDisposalCost", "USD");
        measurement.put("environmentalTemperature", "°C");
        measurement.put("productionAndServices", "units");

        return measurement;
    }
}
