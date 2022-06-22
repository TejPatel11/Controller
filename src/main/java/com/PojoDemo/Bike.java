package com.PojoDemo;

public class Bike {
    private String make;
    private String model;
    private String color;
    private double price;

    public Bike(String make, String model, String color, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "make=" + make + '\n' +
                "model=" + model + '\n' +
                "color=" + color + '\n' +
                "price=" + price;
    }
}
