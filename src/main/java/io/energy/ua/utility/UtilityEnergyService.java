package io.energy.ua.utility;

import io.energy.ua.model.InitialDataModel;

import java.util.List;
import java.util.Map;

public class UtilityEnergyService {
    public static final Map<InitialDataModel.Fields, List<Integer>> ranges = Map.ofEntries(
            Map.entry(InitialDataModel.Fields.electricityConsumption, List.of(100, 190)),
            Map.entry(InitialDataModel.Fields.electricityCost, List.of(8_000, 20_000)),
            Map.entry(InitialDataModel.Fields.electricityProduction, List.of(150, 250)),
            Map.entry(InitialDataModel.Fields.electricityProductionCost, List.of(10_000, 25_000)),
            Map.entry(InitialDataModel.Fields.heatProductionForSale, List.of(500, 1000)),
            Map.entry(InitialDataModel.Fields.heatSales, List.of(400, 900)),
            Map.entry(InitialDataModel.Fields.heatConsumption, List.of(300, 700)),
            Map.entry(InitialDataModel.Fields.heatOwnUseCost, List.of(150, 400)),
            Map.entry(InitialDataModel.Fields.gasConsumption, List.of(1_000, 3_000)),
            Map.entry(InitialDataModel.Fields.gasCost, List.of(7_000, 20_000)),
            Map.entry(InitialDataModel.Fields.waterConsumption, List.of(5_000, 15_000)),
            Map.entry(InitialDataModel.Fields.waterCost, List.of(1_500, 5_000)),
            Map.entry(InitialDataModel.Fields.coalConsumption, List.of(50, 150)),
            Map.entry(InitialDataModel.Fields.coalCost, List.of(10_000, 30_000)),
            Map.entry(InitialDataModel.Fields.fuelOilConsumption, List.of(10, 30)),
            Map.entry(InitialDataModel.Fields.fuelOilCost, List.of(5_000, 15_000)),
            Map.entry(InitialDataModel.Fields.dieselFuelConsumption, List.of(5, 20)),
            Map.entry(InitialDataModel.Fields.dieselFuelCost, List.of(4_000, 12_000)),
            Map.entry(InitialDataModel.Fields.gasolineConsumption, List.of(2, 10)),
            Map.entry(InitialDataModel.Fields.gasolineCost, List.of(2_000, 8_000)),
            Map.entry(InitialDataModel.Fields.lubricatingMaterialsConsumption, List.of(1, 5)),
            Map.entry(InitialDataModel.Fields.lubricatingMaterialsCost, List.of(1_000, 5_000)),
            Map.entry(InitialDataModel.Fields.wastewaterDisposal, List.of(1_000, 5_000)),
            Map.entry(InitialDataModel.Fields.wastewaterDisposalCost, List.of(1_999, 10_000)),
            Map.entry(InitialDataModel.Fields.solidWasteVolume, List.of(100, 500)),
            Map.entry(InitialDataModel.Fields.solidWasteDisposalCost, List.of(5_000, 20_000)),
            Map.entry(InitialDataModel.Fields.environmentalTemperature, List.of(-20, 30)),
            Map.entry(InitialDataModel.Fields.productionAndServices, List.of(500_000, 1_999_999))
    );

}

