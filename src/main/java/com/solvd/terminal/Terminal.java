package com.solvd.terminal;

import com.solvd.interFace.TerminalOperation;
import com.solvd.person.AirportEmployee;
import com.solvd.vehicle.Aircraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Terminal implements TerminalOperation {
    private String terminalCode;
    private String terminalName;
    private List<AirportEmployee> employees = new ArrayList<>();
    private List<Aircraft> aircrafts = new ArrayList<>();

    public Terminal(String terminalCode, String terminalName) {
        this.terminalCode = terminalCode;
        this.terminalName = terminalName;
    }

    public void addEmployee(AirportEmployee employee) {
        employees.add(employee);
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
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

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    @Override
    public void loadCargo(){

    }

    @Override
    public void unLoadCargo(){
    }
    @Override
    public String toString(){
        return  "Terminal{" +
                "terminalCode='" + terminalCode + '\'' +
                ", terminalName='" + terminalName + '\'' +
                ", employee=" + employees +
                ", aircraft=" + aircrafts +
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



