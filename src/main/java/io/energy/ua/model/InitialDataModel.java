package io.energy.ua.model;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

import java.time.Month;
import java.util.HashMap;
import java.util.Map;

@Data
@FieldNameConstants(asEnum = true)
public class InitialDataModel {
    private Map<Month, Double> electricityConsumption;
    private Map<Month, Double> electricityCost;
    private Map<Month, Double> electricityProduction;
    private Map<Month, Double> electricityProductionCost;
    private Map<Month, Double> heatProductionForSale;
    private Map<Month, Double> heatSales;
    private Map<Month, Double> heatConsumption;
    private Map<Month, Double> heatOwnUseCost;
    private Map<Month, Double> gasConsumption;
    private Map<Month, Double> gasCost;
    private Map<Month, Double> waterConsumption;
    private Map<Month, Double> waterCost;
    private Map<Month, Double> coalConsumption;
    private Map<Month, Double> coalCost;
    private Map<Month, Double> fuelOilConsumption;
    private Map<Month, Double> fuelOilCost;
    private Map<Month, Double> dieselFuelConsumption;
    private Map<Month, Double> dieselFuelCost;
    private Map<Month, Double> gasolineConsumption;
    private Map<Month, Double> gasolineCost;
    private Map<Month, Double> lubricatingMaterialsConsumption;
    private Map<Month, Double> lubricatingMaterialsCost;
    private Map<Month, Double> wastewaterDisposal;
    private Map<Month, Double> wastewaterDisposalCost;
    private Map<Month, Double> solidWasteVolume;
    private Map<Month, Double> solidWasteDisposalCost;
    private Map<Month, Double> environmentalTemperature;
    private Map<Month, Double> productionAndServices;
    public InitialDataModel() {
        this.electricityConsumption = new HashMap<>();
        this.electricityCost = new HashMap<>();
        this.electricityProduction = new HashMap<>();
        this.electricityProductionCost = new HashMap<>();
        this.heatProductionForSale = new HashMap<>();
        this.heatSales = new HashMap<>();
        this.heatConsumption = new HashMap<>();
        this.heatOwnUseCost = new HashMap<>();
        this.gasConsumption = new HashMap<>();
        this.gasCost = new HashMap<>();
        this.waterConsumption = new HashMap<>();
        this.waterCost = new HashMap<>();
        this.coalConsumption = new HashMap<>();
        this.coalCost = new HashMap<>();
        this.fuelOilConsumption = new HashMap<>();
        this.fuelOilCost = new HashMap<>();
        this.dieselFuelConsumption = new HashMap<>();
        this.dieselFuelCost = new HashMap<>();
        this.gasolineConsumption = new HashMap<>();
        this.gasolineCost = new HashMap<>();
        this.lubricatingMaterialsConsumption = new HashMap<>();
        this.lubricatingMaterialsCost = new HashMap<>();
        this.wastewaterDisposal = new HashMap<>();
        this.wastewaterDisposalCost = new HashMap<>();
        this.solidWasteVolume = new HashMap<>();
        this.solidWasteDisposalCost = new HashMap<>();
        this.environmentalTemperature = new HashMap<>();
        this.productionAndServices = new HashMap<>();
    }
}
