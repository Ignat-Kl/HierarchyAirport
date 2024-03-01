package com.solvd.vehicle;

import com.solvd.interFace.VehicleOperation;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Vehicle implements VehicleOperation {
    private String model;
    private int capacity;
    private LocalDateTime year;

    public Vehicle(String model, int capacity,LocalDateTime year) {
        this.model=model;
        this.capacity = capacity;
        this.year = year;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    public LocalDateTime getYear(){
        return year;
    }

    public void setYear(LocalDateTime year){
        this.year=year;
    }
    //Реализация метода
    @Override
    public void start(){

    }
    @Override
    public void stop(){

    }

    @Override
    public void refuel() {

    }
    @Override
    public void recharge(){
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", year=" + year +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(getModel(), vehicle.getModel()) &&
                getCapacity() == vehicle.getCapacity() &&
                Objects.equals(getYear(), vehicle.getYear());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getCapacity(), getYear());
    }
}


