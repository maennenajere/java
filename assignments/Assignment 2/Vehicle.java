package oop;

/*
Create Java class Vehicle, that has

Private member variable fuelUsed that is type Double. This stores how much fuel the vehicle has used.

Private member variable distanceDriven that is type Double that stores how many kilometers the vehicle has driven.

Constructor with parameter that initializes the member variable distanceDriven

Getters and setters for the variables fuelUsed and distanceDriven

Public method getFuelConsumption that returns the fuel consumption as liters per 100km (fuelUsed / distanceDriven * 100) with return type Double
*/

public class Vehicle {
    private double fuelUsed;
    private double distanceDriven;

    public Vehicle(double distanceDriven) {
        this.distanceDriven = distanceDriven;
        this.fuelUsed = 0.0;
    }

    public double getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public double getDistanceDriven() {
        return distanceDriven;
    }

    public void setDistanceDriven(double distanceDriven) {
        this.distanceDriven = distanceDriven;
    }

    public double getFuelConsumption() {
        if (distanceDriven == 0) {
            return 0.0;
        }
        return (fuelUsed / distanceDriven * 100);
    }
}