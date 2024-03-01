package com.solvd.vehicle;

import java.time.LocalDateTime;
import java.util.Objects;

public class Aircraft extends Vehicle {

    private String aircraftCode;

    public Aircraft(String aircraftCode, String model, int capacity, LocalDateTime year) {
        super(model, capacity, year);
        this.aircraftCode = aircraftCode;

    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }
    @Override
    public void start(){

    }
    @Override
    public void stop(){

    }
    @Override
    public void refuel(){
    }
    @Override
    public String toString(){
        return "Aircraft{" + "aircraftCode='" + aircraftCode + '\'' + ", " + super.toString();
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Aircraft)) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(getAircraftCode(),aircraft.getAircraftCode()) &&
                super.equals(o);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getAircraftCode());
    }
}


