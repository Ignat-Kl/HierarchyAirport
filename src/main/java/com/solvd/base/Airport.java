package com.solvd.base;

import com.solvd.base.Address;
import com.solvd.flight.Flight;
import com.solvd.terminal.Terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport {
    private String airportCode;
    private String airportName;
    private Address address;
    private List<Terminal> terminals = new ArrayList<>();

    public Airport (String airportCode, String airportName, Address address) {
        if(airportCode == null || airportName == null || address == null) {
            throw new NullPointerException("All fields must have non-null values");
        }
        this.airportCode=airportCode;
        this.airportName=airportName;
        this.address=address;
    }

    public void addTerminal(Terminal terminal) {
        terminals.add(terminal);
    }

    public String getAirportCode() {
        return airportCode;
    }


    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }


    public  String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(List<Terminal> terminals) {
        this.terminals = terminals;
    }

    @Override
    public String toString(){
        return "Airport{" +
                "airportCode='" + airportCode + '\'' +
                ", airportName='" + airportName + '\'' +
                ", airportAddress='" + address + '\'' +
                ", terminals='" + terminals + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getAirportCode(), airport.getAirportCode()) &&
                Objects.equals(getAirportName(), airport.getAirportName()) &&
                Objects.equals(getAddress(), airport.getAddress()) &&
                Objects.equals(getTerminals(), airport.getTerminals());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getAirportCode(), getAirportName(), getAddress(), getTerminals());
    }
}

