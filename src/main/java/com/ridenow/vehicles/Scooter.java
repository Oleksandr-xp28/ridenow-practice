package com.ridenow.vehicles;

public class Scooter extends Vehicle {

    public Scooter(String vehicleId, String licensePlate, double baseFare) {
        super(vehicleId, licensePlate, baseFare);
    }

    @Override
    public double calculateFare(double distanceKm) {
        return super.calculateFare(distanceKm * 0.30);
    }

    @Override
    public double calculateFare(double distanceKm, double surgeMultiplier) {
        return super.calculateFare(distanceKm, Math.min(surgeMultiplier, 1.2));
    }
}
