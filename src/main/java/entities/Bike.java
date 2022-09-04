package entities;

import java.math.BigDecimal;

public class Bike extends Vehicle {
    public Bike(String fuel_type, String model, BigDecimal price) {
        super(fuel_type, model, price, "BIKE");
    }
    public Bike() {
    }
}
