package com.solvd.terminal;

import com.solvd.interFace.TerminalOperation;
import com.solvd.person.AirportEmployee;
import com.solvd.vehicle.PassengerAircraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Terminal implements TerminalOperation {
    private String terminalCode;
    private String terminalName;
    private List<AirportEmployee> employees;
    private List<PassengerAircraft> passengerAircrafts;

    public Terminal(String terminalCode, String terminalName) {
        this.terminalCode = terminalCode;
        this.terminalName = terminalName;
    }

    public void addEmployee(AirportEmployee employee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
    }

    public void addAircraft(PassengerAircraft passengerAircraft) {
        if (passengerAircrafts == null) {
            passengerAircrafts = new ArrayList<>();
        }
        passengerAircrafts.add(passengerAircraft);
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public List<AirportEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<AirportEmployee> employees) {
        this.employees = employees;
    }

    public List<PassengerAircraft> getAircrafts() {
        return passengerAircrafts;
    }

    public void setAircrafts(List<PassengerAircraft> passengerAircrafts) {
        this.passengerAircrafts = passengerAircrafts;
    }

    @Override
    public void cargoLoadingStarted(){
    }
    @Override
    public void cargoLoadingCompleted(){
    }
    @Override
    public void boardingPermission(){}
    @Override
    public void boardingCompletion(){}
    @Override
    public String toString(){
        return  "Terminal{" +
                "terminalCode='" + terminalCode + '\'' +
                ", terminalName='" + terminalName + '\'' +
                ", employee=" + employees +
                ", aircraft=" + passengerAircrafts +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Terminal)) return false;
        Terminal terminal = (Terminal) o;
        return Objects.equals(getTerminalCode(), terminal.getTerminalCode()) &&
                Objects.equals(getTerminalName(), terminal.getTerminalName()) &&
                Objects.equals(getEmployees(), terminal.getEmployees()) &&
                Objects.equals(getAircrafts(), terminal.getAircrafts());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTerminalCode(), getTerminalName(), getEmployees(), getAircrafts());
    }
}



