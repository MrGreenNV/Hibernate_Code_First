package entities;

import java.math.BigDecimal;

public class Car extends Vehicle {
    private int seats;

    public Car(String fuel_type, String model, BigDecimal price, String type, int seats) {
        super(fuel_type, model, price, "CAR");
        this.seats = seats;
    }

    public Car() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
