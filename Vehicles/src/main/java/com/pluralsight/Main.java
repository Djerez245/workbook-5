package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("red");
        slowRide.setFuelCapacity(5);
        System.out.printf("The color of slow ride is: " + slowRide.getColor() + "\nThe color of slow ride is: " + slowRide.getFuelCapacity());
    }
}
