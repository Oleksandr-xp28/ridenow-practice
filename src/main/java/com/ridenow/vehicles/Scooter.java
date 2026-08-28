package com.ridenow.vehicles;

public class Scooter extends Vehicle {

    public Scooter(String vehicleId, String licensePlate, double baseFare) {
        super(vehicleId, licensePlate, baseFare);
    }

    @Override
    public double calculateFare(double distanceKm) {
        return baseFare + distanceKm * 0.30;
    }
}