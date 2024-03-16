package com.solvd.person;

import com.solvd.person.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.Objects;

public class Passenger extends Person {
    private static final Logger LOGGER = LogManager.getLogger(Passenger.class);
    private String seatNumber;

    public Passenger(String personId, String personName,String personSurname,LocalDateTime dateOfBirth,String seatNumber,String personEmail) {
        super(personId,personName,personSurname,dateOfBirth,personEmail);
        this.seatNumber = seatNumber;

    }
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    @Override
    public void displayInfo(){
        System.out.println("Passenger ID: " + getPersonId());
        System.out.println("Passenger Name: " + getPersonName());
        System.out.println("Seat Number: " + getSeatNumber());
    }

    @Override
    public void  boardPassenger(){
        LOGGER.info("The passenger " + getPersonName() + " took his seat");
    }
    @Override
    public void disembarkPassenger(){
        LOGGER.info("The passenger " + getPersonName()+  " left his seat");
    }

    @Override
    public String toString(){
        return "Passenger{" + "seatNumber= '" + seatNumber +"' ,"+  super.toString();
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Passenger)) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(getSeatNumber(),passenger.getSeatNumber()) &&
                super.equals(o);
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(getSeatNumber());
    }
}

