package com.solvd.terminal;

import com.solvd.person.Passenger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class PassengerTerminal extends Terminal{
    private static final Logger LOGGER = LogManager.getLogger(PassengerTerminal.class);
    private String passengerBaggageArea;

    public PassengerTerminal(String passengerBaggageArea, String terminalCode, String terminalName) {
        super(terminalCode,terminalName);
        this.passengerBaggageArea = passengerBaggageArea;
    }

    public String getPassengerBaggageArea(){
        return passengerBaggageArea;
    }
    public void setPassengerBaggageArea(String passengerBaggageArea){
        this.passengerBaggageArea = passengerBaggageArea;
    }
        @Override
    public void boardingPermission(){
        LOGGER.info("Board at your terminal");
    }
    @Override
    public void boardingCompletion(){
        LOGGER.info("Boarding at your terminal is completed");
    }

    @Override
    public String toString() {
        return "PassengerTerminal{" + "PassengerBaggageArea= '" + passengerBaggageArea +
                "' ,"+  super.toString();
        }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof PassengerTerminal)) return false;
        PassengerTerminal passenger = (PassengerTerminal) o;
        return Objects.equals(getPassengerBaggageArea(),passenger.getPassengerBaggageArea()) &&
                super.equals(o);
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(getPassengerBaggageArea());
    }
}
