package com.manasa.vehicle.model;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "vehicleName", nullable = false)
    private String vehicleName;
    @Column(name = "vehicleQuantity", nullable = false)
    private int vehicleQuantity;
    @Column(name = "vehiclePrice", nullable = false)
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleQuantity() {
        return vehicleQuantity;
    }

    public void setVehicleQuantity(int vehicleQuantity) {
        this.vehicleQuantity = vehicleQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleQuantity=" + vehicleQuantity +
                ", price=" + price +
                '}';
    }
}
