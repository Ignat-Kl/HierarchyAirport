package com.solvd.flight;

import com.solvd.person.Passenger;
import com.solvd.terminal.Terminal;
import com.solvd.vehicle.Aircraft;

import java.time.LocalDateTime;
import java.util.Objects;

public class PassengerFlight extends Flight{
    private String passengerFlightCode;

    public PassengerFlight(String passengerFlightCode, LocalDateTime departureTime, Terminal departureTerminal,
                           Terminal arrivalTerminal, Aircraft aircraft) {
        super(departureTime,departureTerminal,arrivalTerminal,aircraft);
        this.passengerFlightCode = passengerFlightCode;
    }


    public String getPassengerFlightCode() {

        return passengerFlightCode;
    }

    public void setPassengerFlightCode(String passengerFlightCode) {
        this.passengerFlightCode = passengerFlightCode;
    }

    @Override
    public void takeOff(){

    }
    @Override
    public void land(){   }

    @Override
    public String toString(){
        return "PassengerFlight{" + "passengerFlightCode= '" + passengerFlightCode +"' ,"+  super.toString();
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof PassengerFlight)) return false;
        PassengerFlight passenger = (PassengerFlight) o;
        return Objects.equals(getPassengerFlightCode(),passenger.getPassengerFlightCode()) &&
                super.equals(o);
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(getPassengerFlightCode());
    }
}

