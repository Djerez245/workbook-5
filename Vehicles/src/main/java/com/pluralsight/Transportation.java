package com.pluralsight;

public class Transportation {
    protected String name;
    protected double speed;
    protected int numOfSeats;
    protected int qualityOfVehicle;
    protected String color;
    protected double range;
    protected boolean isElectric;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getQualityOfVehicle() {
        return qualityOfVehicle;
    }

    public void setQualityOfVehicle(int qualityOfVehicle) {
        this.qualityOfVehicle = qualityOfVehicle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}

