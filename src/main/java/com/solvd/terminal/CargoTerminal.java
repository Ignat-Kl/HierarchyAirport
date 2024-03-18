package com.solvd.terminal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class CargoTerminal extends Terminal {
    private static final Logger LOGGER = LogManager.getLogger(CargoTerminal.class);
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
    public void cargoLoadingStarted(){
        LOGGER.info("The cargo is loading and will be ready soon");
    }
    @Override
    public void cargoLoadingCompleted(){
        LOGGER.info("The cargo is loaded and ready");
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
