package com.ridenow.app;
import com.ridenow.vehicles.*;

public class Main {
    static void main() {
        System.out.println("RideNow platform starting...");

        Vehicle car = new Car("C-001", "KA7777AA", 5.0);
        Vehicle bike = new Bike("B-105", "NO-PLATE", 2.0);
        Vehicle scooter = new Scooter("S-992", "SC-1234", 3.0);

        Vehicle[] fleet = {car, bike, scooter};

        for (Vehicle v : fleet) {
            v.printSummary();
        }

        for (Vehicle v : fleet) {
            System.out.println(v.calculateFare(10));
        }
    }
}
