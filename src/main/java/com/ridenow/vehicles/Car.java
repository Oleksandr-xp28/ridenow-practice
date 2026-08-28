package com.ridenow.vehicles;

public class Car extends Vehicle {

    public Car(String vehicleId, String licensePlate, double baseFare) {
        super(vehicleId, licensePlate, baseFare);
    }

    @Override
    public double calculateFare(double distanceKm) {
        return super.calculateFare(distanceKm * 0.50);
    }
}
