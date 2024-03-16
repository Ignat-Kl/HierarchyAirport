package com.solvd;

import com.solvd.base.Address;
import com.solvd.base.Airport;
import com.solvd.flight.CargoFlight;
import com.solvd.flight.PassengerFlight;
import com.solvd.person.AirportEmployee;
import com.solvd.person.Passenger;
import com.solvd.person.Person;
import com.solvd.terminal.CargoTerminal;
import com.solvd.terminal.PassengerTerminal;
import com.solvd.utils.AirportUtils;
import com.solvd.vehicle.Aircraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static com.solvd.utils.AirportUtils.*;



public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args){
        Address airportAddress1 = new Address("123 Main St", "LA", "California", "USA", "122345");
        Address airportAddress2 = new Address("34 Higway", "Bronx","NY", "USA","1345");
        Address airportAddress3 = new Address("45 Jorg", "Kvinx", "NY", "USA", "3456");
        LOGGER.info(airportAddress1);
        LOGGER.info(airportAddress2);


        Aircraft aircraft1 = new Aircraft("CRF01","AN-50",5,LocalDateTime.of(1990,10,23,14,5));
        Aircraft aircraft2 = new Aircraft("CRF02","TY-123", 3,LocalDateTime.of(1990,10,23,14,5));
        Aircraft aircraft3 = new Aircraft("CRF03","SE-400", 15,LocalDateTime.of(1990,10,23,14,5));
        LOGGER.info(aircraft1);

        aircraft1.start();
        aircraft1.refuel();


        Airport airport1 = new Airport("AIR01", "International Airport01",airportAddress1);
        Airport airport2 = new Airport("AIR02","International Airport02", airportAddress2);
        Airport airport3 = new Airport("AIR03", "International Airport03", airportAddress3);


        AirportEmployee employee1 = new AirportEmployee("EMP001", "John","Snak",LocalDateTime.of(1990,10,23,14,5),"Driver", 500.5,"John@.com");
        AirportEmployee employee2 = new AirportEmployee("EMP002", "Jan","Koval",LocalDateTime.of(1997,11,10,9,12),"Salesman",450.6,"Janl@.com");
        AirportEmployee employee3 = new AirportEmployee("EMP003", "Ivar","Ifrav",LocalDateTime.of(2003,3,23,23,45),"Manager",789.2,"Ivar@.com");
//        employee2.displayInfo();

//        Interface sellTicket and checkTicket
        employee2.sellTicket();
        employee3.checkTicket();

        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger1 = new Passenger("Pas001","Oleg","Bersov", LocalDateTime.of(1990,10,23,14,5),"A01", "Oleg@.com");
        Passenger passenger2 = new Passenger("Pas002","Ubbe","Lotgbrok",LocalDateTime.of(2000,11,5,12,30) ,"B02", "Ubbe@.com");
        Passenger passenger3 = new Passenger("Pas003","Ivan","Tablov",LocalDateTime.of(1980,2,25,16,35),"C03", "Ivan@.com");

        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);

//        Interface boardPassenger
        passenger1.boardPassenger();
        passenger3.boardPassenger();
//        Interface disembarkPassenger
        passenger2.disembarkPassenger();


        PassengerTerminal passengerTerminal1 = new PassengerTerminal("PasBag1","TerPas001", "TerminalPassenger 1");
        PassengerTerminal passengerTerminal2 = new PassengerTerminal("PasBag2","TerPas002", "TerminalPassenger 2");
        PassengerTerminal passengerTerminal3 = new PassengerTerminal("PasBag3","TerPas003", "TerminalPassenger 3");

        CargoTerminal cargoTerminal1 = new CargoTerminal("CarBag1","TerCar001","TerminalCargo 1");
        CargoTerminal cargoTerminal2 = new CargoTerminal("CarBag2","TerCar002","TerminalCargo 2");
        CargoTerminal cargoTerminal3 = new CargoTerminal("CarBag3","TerCar003","TerminalCargo 3");


        airport1.addTerminal(passengerTerminal1);
        airport2.addTerminal(passengerTerminal2);
        airport3.addTerminal(passengerTerminal3);


        passengerTerminal1.addEmployee(employee1);
        passengerTerminal2.addEmployee(employee2);
        passengerTerminal3.addEmployee(employee3);


        passengerTerminal1.addAircraft(aircraft1);
        passengerTerminal2.addAircraft(aircraft2);
        passengerTerminal3.addAircraft(aircraft3);


        PassengerFlight passengerFlight1 = new PassengerFlight("FL001", LocalDateTime.now(),passengerTerminal1,passengerTerminal2,aircraft1);
        PassengerFlight passengerFlight2 = new PassengerFlight("FL002",LocalDateTime.now(), passengerTerminal2,passengerTerminal3,aircraft2);
        PassengerFlight passengerFlight3 = new PassengerFlight("FL003",LocalDateTime.now(),passengerTerminal3,passengerTerminal1,aircraft3);

//        CargoFlight cargoFlight1 = new CargoFlight("CF001", LocalDateTime.now(),cargoTerminal1,cargoTerminal2, );

        LOGGER.info("Aircraft in terminal 1:");
        for (Aircraft aircraft : passengerTerminal1.getAircrafts()) {
            LOGGER.info("Code: " + aircraft.getAircraftCode() + ", Model: " + aircraft.getModel() + ", Capacity: " + aircraft.getCapacity());
        }

        calculateCapacity(aircraft2,passengers);

    }

}
