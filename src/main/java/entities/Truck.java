package entities;

import java.math.BigDecimal;

public class Truck extends Vehicle {
    private double load_capacity;

    public Truck(String fuel_type, String model, BigDecimal price, double load_capacity) {
        super(fuel_type, model, price, "TRUCK");
        this.load_capacity = load_capacity;
    }

    public Truck() {
    }

    public double getLoad_capacity() {
        return load_capacity;
    }

    public void setLoad_capacity(double load_capacity) {
        this.load_capacity = load_capacity;
    }
}
