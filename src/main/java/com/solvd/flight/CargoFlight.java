package com.solvd.flight;

import com.solvd.terminal.Terminal;
import com.solvd.vehicle.Aircraft;

import java.time.LocalDateTime;
import java.util.Objects;

public class CargoFlight extends Flight {
    private String cargoFlightCode;

    public CargoFlight(String cargoFlightCode, LocalDateTime departureTime, Terminal departureTerminal,
                       Terminal arrivalTerminal, Aircraft aircraft) {
        super(departureTime, departureTerminal, arrivalTerminal, aircraft);
        this.cargoFlightCode = cargoFlightCode;
    }

    public String getCargoFlightCode(){
        return cargoFlightCode;
    }
    public void setCargoFlightCode(String cargoFlightCode){
        this.cargoFlightCode = cargoFlightCode;
    }
    @Override
    public void load(){

    }
    @Override
    public void unload(){    }

    @Override
    public String toString(){
        return "CargoFlight{" + "CargoFlightCode= '" + cargoFlightCode +"' ,"+  super.toString();
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof CargoFlight)) return false;
        CargoFlight cargo = (CargoFlight) o;
        return Objects.equals(getCargoFlightCode(), cargo.getCargoFlightCode()) &&
                super.equals(o);
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(getCargoFlightCode());
    }
}
