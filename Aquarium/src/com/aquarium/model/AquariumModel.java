package com.aquarium.model;

public class AquariumModel {
    private int aquariumId;
    private String aquariumName;
    private String location;
    private double tankSize;
    private String waterType;
    private String maintenance;
    private double temperature;
    private String feeding;

    public AquariumModel() {
    }

    public AquariumModel(int aquariumId, String aquariumName, String location, double tankSize, 
                         String waterType, String maintenance, double temperature, String feeding) {
        this.aquariumId = aquariumId;
        this.aquariumName = aquariumName;
        this.location = location;
        this.tankSize = tankSize;
        this.waterType = waterType;
        this.maintenance = maintenance;
        this.temperature = temperature;
        this.feeding = feeding;
    }

    // Getters
    public int getAquariumId() {
        return aquariumId;
    }

    public String getAquariumName() {
        return aquariumName;
    }

    public String getLocation() {
        return location;
    }

    public double getTankSize() {
        return tankSize;
    }

    public String getWaterType() {
        return waterType;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getFeeding() {
        return feeding;
    }

    // Setters
    public void setAquariumId(int aquariumId) {
        this.aquariumId = aquariumId;
    }

    public void setAquariumName(String aquariumName) {
        this.aquariumName = aquariumName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }
}