package com.solvd.flight;

import com.solvd.terminal.Terminal;
import com.solvd.vehicle.PassengerAircraft;

import java.time.LocalDateTime;
import java.util.Objects;

public class PassengerFlight extends Flight{
    private String passengerFlightCode;
    private PassengerAircraft passengerAircraft;

    public PassengerFlight(String passengerFlightCode, LocalDateTime departureTime, Terminal departureTerminal,
                           Terminal arrivalTerminal, PassengerAircraft passengerAircraft) {
        super(departureTime,departureTerminal,arrivalTerminal);
        this.passengerFlightCode = passengerFlightCode;
        this.passengerAircraft =  passengerAircraft;
    }


    public String getPassengerFlightCode() {

        return passengerFlightCode;
    }

    public void setPassengerFlightCode(String passengerFlightCode) {
        this.passengerFlightCode = passengerFlightCode;
    }

    public PassengerAircraft getPassengerAircraft() {
        return passengerAircraft;
    }

    public void setPassengerAircraft(PassengerAircraft passengerAircraft) {
        this.passengerAircraft = passengerAircraft;
    }

    @Override
    public void takeOff(){

    }
    @Override
    public void land(){   }

    @Override
    public String toString(){
        return "PassengerFlight{" + "passengerFlightCode= '" + passengerFlightCode +"' ," +
                "passengerAircraft= '" + passengerAircraft + "' ," +  super.toString() + "}";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof PassengerFlight)) return false;
        PassengerFlight passenger = (PassengerFlight) o;
        return Objects.equals(getPassengerFlightCode(),passenger.getPassengerFlightCode()) &&
                Objects.equals(getPassengerAircraft(), passenger.getPassengerAircraft()) &&
                super.equals(o);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getPassengerFlightCode(), getPassengerAircraft());
    }
}

