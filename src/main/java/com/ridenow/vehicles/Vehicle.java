package com.ridenow.vehicles;

public class Vehicle {
    private final String vehicleId;
    private final String licensePlate;
    protected double baseFare;

    public Vehicle(String vehicleId, String licensePlate, double baseFare) {
        this.vehicleId = vehicleId;
        this.licensePlate = licensePlate;
        this.baseFare = baseFare;
    }

    public double calculateFare(double distanceKm){
        return baseFare + distanceKm;
    }
    public double calculateFare(double distanceKm, double surgeMultiplier){
        return calculateFare(distanceKm) * surgeMultiplier;
        //return (baseFare + distanceKm) * surgeMultiplier;
    }

    public void printSummary(){
        System.out.print("Vehicle ID: " + getVehicleId() +"; ");
        System.out.print("License Plate: " + getLicensePlate()+"; ");
        System.out.print("Base Fare: " + getBaseFare()+"; ");
        System.out.println();
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", baseFare=" + baseFare +
                '}';
    }
}