package com.company;

public class Cars {
    private String color, form, idCode;
    private double engine, fuelConsumption, fuelLeftOver;
    private final double gasValue = 1.5;
    private int distanceTravelled  = 0;

    public Cars(String color, String form, String idCode, double engine, double fuelConsumption, double fuelLeftOver) {
        this.color = color;
        this.form = form;
        this.idCode = idCode;
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.fuelLeftOver = fuelLeftOver;
    }

    void drive (double distance){
        fuelLeftOver -= (distance/100) * fuelConsumption;
        System.out.println( form + " проїхав " + distance + " залишилось " + fuelLeftOver + " літрів бензину");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelLeftOver() {
        return fuelLeftOver;
    }

    public void setFuelLeftOver(double fuelLeftOver) {
        this.fuelLeftOver = fuelLeftOver;
    }

    public double getGasValue() {
        return gasValue;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
}
