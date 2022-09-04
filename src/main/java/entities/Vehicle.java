package entities;

import java.math.BigDecimal;

public abstract class Vehicle {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String fuel_type;
    private String model;
    private BigDecimal price;
    private String type;

    public Vehicle(String fuel_type, String model, BigDecimal price, String type) {
        this.fuel_type = fuel_type;
        this.model = model;
        this.price = price;
        this.type = type;
    }

    public Vehicle() {
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
