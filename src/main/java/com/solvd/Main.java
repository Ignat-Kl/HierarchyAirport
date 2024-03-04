package com.solvd;

import com.solvd.base.Address;
import com.solvd.base.Airport;
import com.solvd.flight.PassengerFlight;
import com.solvd.person.AirportEmployee;
import com.solvd.person.Passenger;
import com.solvd.person.Person;
import com.solvd.terminal.PassengerTerminal;
import com.solvd.vehicle.Aircraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
        LOGGER.error(airportAddress1.equals(airportAddress2));


        Aircraft aircraft1 = new Aircraft("CRF01","AN-50",350,LocalDateTime.of(1990,10,23,14,5));
        Aircraft aircraft2 = new Aircraft("CRF02","TY-123", 250,LocalDateTime.of(1990,10,23,14,5));
        Aircraft aircraft3 = new Aircraft("CRF03","SE-400", 150,LocalDateTime.of(1990,10,23,14,5));
        LOGGER.info(aircraft1);

        aircraft1.start();
        aircraft1.refuel();

//        System.out.println("Model: " + aircraft1.getModel() + ", Capacity: " + aircraft1.getCapacity());



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

        Passenger passenger1 = new Passenger("Pas001","Oleg","Bersov", LocalDateTime.of(1990,10,23,14,5),"A01", "Oleg@.com");
        Passenger passenger2 = new Passenger("Pas002","Ubbe","Lotgbrok",LocalDateTime.of(2000,11,5,12,30) ,"B02", "Ubbe@.com");
        Passenger passenger3 = new Passenger("Pas003","Ivan","Tablov",LocalDateTime.of(1980,2,25,16,35),"C03", "Ivan@.com");

//        Interface boardPassenger
        passenger1.boardPassenger();
        passenger3.boardPassenger();
//        Interface disembarkPassenger
        passenger2.disembarkPassenger();


        PassengerTerminal terminal1 = new PassengerTerminal("PasBag1","Ter001", "Terminal 1");
        PassengerTerminal terminal2 = new PassengerTerminal("PasBag2","Ter002", "Terminal 2");
        PassengerTerminal terminal3 = new PassengerTerminal("PasBag3","Ter003", "Terminal 3");

        airport1.addTerminal(terminal1);
        airport2.addTerminal(terminal2);
        airport3.addTerminal(terminal3);


        terminal1.addEmployee(employee1);
        terminal2.addEmployee(employee2);
        terminal3.addEmployee(employee3);


        terminal1.addAircraft(aircraft1);
        terminal2.addAircraft(aircraft2);
        terminal3.addAircraft(aircraft3);


        PassengerFlight flight1 = new PassengerFlight("FL001", LocalDateTime.now(),terminal1,terminal2,aircraft1);
        PassengerFlight flight2 = new PassengerFlight("FL002",LocalDateTime.now(), terminal2,terminal1,aircraft2);
        PassengerFlight flight3 = new PassengerFlight("FL003",LocalDateTime.now(),terminal3,terminal1,aircraft3);



        System.out.println("Aircraft in terminal 1:");
        for (Aircraft aircraft : terminal1.getAircrafts()) {
            System.out.println("Code: " + aircraft.getAircraftCode() + ", Model: " + aircraft.getModel() + ", Capacity: " + aircraft.getCapacity());
        }



    }

}
