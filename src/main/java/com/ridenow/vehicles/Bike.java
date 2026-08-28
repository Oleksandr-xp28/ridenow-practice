package com.ridenow.vehicles;

public class Bike extends Vehicle {

    public Bike(String vehicleId, String licensePlate, double baseFare) {
        super(vehicleId, licensePlate, baseFare);
    }

    private double fare(double realFare) {
        return Math.min(realFare, 15);
    }

    @Override
    public double calculateFare(double distanceKm) {
        return baseFare + distanceKm * 0.20;
    }
}
