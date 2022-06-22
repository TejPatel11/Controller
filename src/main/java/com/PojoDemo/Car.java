package com.PojoDemo;

public class Car {
    private String make;
    private String model;
    private double price;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String make, String model, double price, int maxSpeed, boolean isElectric) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "make=" + make + '\n' +
                "model=" + model + '\n' +
                "price=" + price + '\n' +
                "maxSpeed=" + maxSpeed +'\n' +
                "isElectric=" + isElectric + '\n';
    }
}


