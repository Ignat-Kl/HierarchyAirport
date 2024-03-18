package com.solvd;

import com.solvd.base.Address;
import com.solvd.base.Airport;
import com.solvd.cargo.Cargo;
import com.solvd.flight.CargoFlight;
import com.solvd.flight.PassengerFlight;
import com.solvd.person.AirportEmployee;
import com.solvd.person.Passenger;
import com.solvd.terminal.CargoTerminal;
import com.solvd.terminal.PassengerTerminal;
import com.solvd.vehicle.CargoAircraft;
import com.solvd.vehicle.PassengerAircraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.solvd.utils.AirportUtils.*;



public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args){
        Address airportAddress1 = new Address("123 Main St", "LA", "California", "USA", "122345");
        Address airportAddress2 = new Address("34 Higway", "Bronx","NY", "USA","1345");
        Address airportAddress3 = new Address("45 Jorg", "Kvinx", "NY", "USA", "3456");
        LOGGER.info(airportAddress1);
        LOGGER.info(airportAddress2);


        PassengerAircraft passengerAircraft1 = new PassengerAircraft("PAC01","AN-50",5,LocalDateTime.of(1990,10,23,14,5));
        PassengerAircraft passengerAircraft2 = new PassengerAircraft("PAC02","TY-123", 3,LocalDateTime.of(1990,10,23,14,5));
        PassengerAircraft passengerAircraft3 = new PassengerAircraft("PAC03","SE-400", 15,LocalDateTime.of(1990,10,23,14,5));
        LOGGER.info(passengerAircraft1);
        passengerAircraft1.start();
        passengerAircraft1.refuel();


        CargoAircraft cargoAircraft1 = new CargoAircraft ("CAC01","ANA-50",150,LocalDateTime.of(1990,10,23,14,5));
        CargoAircraft cargoAircraft2 = new CargoAircraft ("CAC02","TYR-10",10,LocalDateTime.of(1999,10,23,14,5));
        CargoAircraft cargoAircraft3 = new CargoAircraft ("CAC03","G-50",2500,LocalDateTime.of(2009,10,23,14,5));
        LOGGER.info(cargoAircraft1);


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
        Passenger passenger3 = new Passenger("Pas003","Ivan","Tablov",LocalDateTime.of(2008,2,25,16,35),"C03", "Ivan@.com");

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


        passengerTerminal1.addAircraft(passengerAircraft1);
        passengerTerminal2.addAircraft(passengerAircraft2);
        passengerTerminal3.addAircraft(passengerAircraft3);


        PassengerFlight passengerFlight1 = new PassengerFlight("FL001", LocalDateTime.now(),passengerTerminal1,passengerTerminal2, passengerAircraft1);
        PassengerFlight passengerFlight2 = new PassengerFlight("FL002",LocalDateTime.now(), passengerTerminal2,passengerTerminal3, passengerAircraft2);
        PassengerFlight passengerFlight3 = new PassengerFlight("FL003",LocalDateTime.now(),passengerTerminal3,passengerTerminal1, passengerAircraft3);

        CargoFlight cargoFlight1 = new CargoFlight("CF001", LocalDateTime.now(),cargoTerminal1,cargoTerminal2,cargoAircraft1);
        CargoFlight cargoFlight2 = new CargoFlight("CF002", LocalDateTime.now(),cargoTerminal2,cargoTerminal3,cargoAircraft2);
        CargoFlight cargoFlight3 = new CargoFlight("CF003", LocalDateTime.now(),cargoTerminal3,cargoTerminal1,cargoAircraft3);

        List<Cargo> cargos = new ArrayList<>();
        Cargo cargo1 = new Cargo("C001", "Vase", 1,airportAddress1);
        Cargo cargo2 = new Cargo("C002", "Brick", 1200,airportAddress2);
        Cargo cargo3 = new Cargo("C003", "Wallet", 14,airportAddress3);

        cargos.add(cargo1);
        cargos.add(cargo2);
        cargos.add(cargo3);



        LOGGER.info("Aircraft in terminal 1:");
        for (PassengerAircraft passengerAircraft : passengerTerminal1.getAircrafts()) {
            LOGGER.info("Code: " + passengerAircraft.getAircraftCode() + ", Model: " + passengerAircraft.getModel() + ", Capacity: " + passengerAircraft.getCapacity());
        }

        calculateCapacity(passengerAircraft2,passengers);
        adult(passenger3);
        calculateCarrying(cargos,cargoAircraft3);

        List<Cargo> cargoListForAircraft1 = Arrays.asList(cargo1,cargo2);
        List<Cargo> cargoListForAircraft2 = Arrays.asList(cargo3);
        calculateCarrying(cargoListForAircraft1,cargoAircraft1);

    }

}
