package entities;

import java.math.BigDecimal;

public class Plane extends Vehicle {
    private String airline;
    private int passenger_capacity;

    public Plane(String fuel_type, String model, BigDecimal price, String airline, int passenger_capacity) {
        super(fuel_type, model, price, "PLANE");
        this.airline = airline;
        this.passenger_capacity = passenger_capacity;
    }

    public Plane() {
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }
}
