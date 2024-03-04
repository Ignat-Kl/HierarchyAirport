package com.solvd.vehicle;

import java.time.LocalDateTime;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aircraft extends Vehicle {
    private static final Logger LOGGER = LogManager.getLogger(Aircraft.class);

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
        LOGGER.info(getModel() + " turbine is running");
    }
    @Override
    public void stop(){
        LOGGER.info( getModel() + " turbine is turned off");
    }
    @Override
    public void refuel(){
        LOGGER.info(getModel() + " tank is full");
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


