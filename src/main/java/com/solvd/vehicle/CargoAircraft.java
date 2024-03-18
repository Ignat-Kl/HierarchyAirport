package com.solvd.vehicle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.Objects;

public class CargoAircraft extends Vehicle{
    private static final Logger LOGGER = LogManager.getLogger(CargoAircraft.class);

    private String aircraftCode;

    public CargoAircraft(String aircraftCode, String model, int carrying, LocalDateTime year) {
        super(model, carrying, year);
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
        return "CargoAircraft{" + "aircraftCode='" + aircraftCode + '\'' + ", " + super.toString();
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof CargoAircraft)) return false;
        CargoAircraft cargoAircraft = (CargoAircraft) o;
        return Objects.equals(getAircraftCode(), cargoAircraft.getAircraftCode()) &&
                super.equals(o);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getAircraftCode());
    }
}

