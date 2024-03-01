package com.solvd.terminal;

import java.util.Objects;

public class CargoTerminal extends Terminal {
    private String cargoBaggageArea;

    public CargoTerminal(String CargoBaggageArea, String terminalCode, String terminalName) {
        super(terminalCode,terminalName);
        this.cargoBaggageArea = cargoBaggageArea;
    }

   public String getCargoBaggageArea(){
        return cargoBaggageArea;
    }

    public void setCargoBaggageArea(String cargoBaggageArea) {
        this.cargoBaggageArea = cargoBaggageArea;
    }

    @Override
    public void loadCargo(){

    }
    @Override
    public void unLoadCargo(){
    }
    @Override
    public String toString(){
        return "CargoTerminal{" + "cargoBaggageArea= '" + cargoBaggageArea +"' ,"+  super.toString();
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof CargoTerminal)) return false;
        CargoTerminal cargo = (CargoTerminal) o;
        return Objects.equals(getCargoBaggageArea(), cargo.getCargoBaggageArea()) &&
                super.equals(o);
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(getCargoBaggageArea());
    }

}
