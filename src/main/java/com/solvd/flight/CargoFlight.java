package com.solvd.flight;

import com.solvd.terminal.Terminal;
import com.solvd.vehicle.CargoAircraft;
import com.solvd.vehicle.PassengerAircraft;

import java.time.LocalDateTime;
import java.util.Objects;

public class CargoFlight extends Flight {
    private String cargoFlightCode;
    private CargoAircraft cargoAircraft;

    public CargoFlight(String cargoFlightCode, LocalDateTime departureTime, Terminal departureTerminal,
                           Terminal arrivalTerminal, CargoAircraft cargoAircraft) {
        super(departureTime,departureTerminal,arrivalTerminal);
        this.cargoFlightCode = cargoFlightCode;
        this.cargoAircraft =  cargoAircraft;
    }


    public String getCargoFlightCode() {

        return cargoFlightCode;
    }

    public void setCargoFlightCode(String cargoFlightCode) {
        this.cargoFlightCode = cargoFlightCode;
    }

    public CargoAircraft getCargoAircraft() {
        return cargoAircraft;
    }

    public void setCargoAircraft(CargoAircraft cargoAircraft) {
        this.cargoAircraft = cargoAircraft;
    }

    @Override
    public void takeOff(){

    }
    @Override
    public void land(){   }

    @Override
    public String toString(){
        return "CargoFlight{" + "CargoFlightCode= '" + cargoFlightCode +"' ," +
                "CargoAircraft= '" + cargoAircraft + "' ," +  super.toString() + "}";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof CargoFlight)) return false;
        CargoFlight cargo = (CargoFlight) o;
        return Objects.equals(getCargoFlightCode(),cargo.getCargoFlightCode()) &&
                Objects.equals(getCargoAircraft(), cargo.getCargoAircraft()) &&
                super.equals(o);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getCargoFlightCode(), getCargoAircraft());
    }
}

