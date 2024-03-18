package com.solvd.cargo;

import com.solvd.base.Address;
import com.solvd.interFace.CargoOperation;
import com.solvd.person.Person;
import com.solvd.terminal.CargoTerminal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Cargo implements CargoOperation {
    private static final Logger LOGGER = LogManager.getLogger(Cargo.class);
    private String cargoId;
    private String description;
    private int weight;
    private Address destination;

    public Cargo(String cargoId, String description, int weight,
                 Address destination) {
        this.cargoId = cargoId;
        this.description = description;
        this.weight = weight;
        this.destination = destination;
    }

    public String getCargoId(){
        return cargoId;
    }
    public void setCargoId(String cargoId){
        this.cargoId=cargoId;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }
    @Override
    public void loadCargo(){
        LOGGER.info("Cargo is loading");
    }
    @Override
    public void unloadCargo(){
        LOGGER.info("Cargo is unloaded");
    }
    @Override
    public void calculateShippingCost(){
        LOGGER.info("Delivery cost will be");
    }

    public String toString(){
        return "Cargo{" +
                "CargoId='" + cargoId + '\'' +
                ", description='" + description + '\'' +
                ", weight='" + weight + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Cargo)) return false;
        Cargo cargo = (Cargo) o;
        return Objects.equals(getCargoId(),cargo.getCargoId()) &&
                Objects.equals(getDescription(),cargo.getDescription()) &&
                Integer.compare(getWeight(),cargo.getWeight()) == 0 &&
                Objects.equals(getDestination(),cargo.getDestination());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getCargoId(),getDescription(), getWeight(),getDescription());
    }
}
