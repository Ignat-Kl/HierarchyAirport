package com.solvd.flight;

import com.solvd.interFace.FlightOperation;
import com.solvd.terminal.Terminal;
import com.solvd.vehicle.PassengerAircraft;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Flight implements FlightOperation {

    private LocalDateTime departureTime;
    private Terminal departureTerminal;
    private Terminal arrivalTerminal;


    public Flight(LocalDateTime departureTime, Terminal departureTerminal, Terminal arrivalTerminal) {
        this.departureTime = departureTime;
        this.departureTerminal = departureTerminal;
        this.arrivalTerminal = arrivalTerminal;

    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Terminal getDepartureTerminal() {
        return departureTerminal;
    }

    public void setDepartureTerminal(Terminal departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    public Terminal getArrivalTerminal() {
        return arrivalTerminal;
    }

    public void setArrivalTerminal(Terminal arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    @Override
    public void takeOff(){

    }
    @Override
    public void land(){

    }
    @Override
    public void load(){

    }
    @Override
    public void unload(){    }

    @Override
    public String toString(){
        return "Flight{" +
                "departureTime='" + departureTime + '\'' +
                ", departureTerminal='" + departureTerminal + '\'' +
                ", arrivalTerminal='" + arrivalTerminal + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDepartureTime(), flight.getDepartureTime()) &&
                Objects.equals(getDepartureTerminal(), flight.getDepartureTerminal()) &&
                Objects.equals(getArrivalTerminal(), flight.getArrivalTerminal());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getDepartureTime(),getDepartureTerminal(),getArrivalTerminal());
    }
}

