package com.solvd.utils;


import com.solvd.cargo.Cargo;
import com.solvd.person.Passenger;
import com.solvd.vehicle.CargoAircraft;
import com.solvd.vehicle.Vehicle;
import com.solvd.vehicle.PassengerAircraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;


public class AirportUtils {
    private static final Logger LOGGER = LogManager.getLogger(AirportUtils.class);

    public static int calculateCapacity(PassengerAircraft passengerAircraft, List<Passenger> passengers) {
        int availableSeats = passengerAircraft.getCapacity() - passengers.size();
        if (availableSeats > 0) {
            LOGGER.info("Available seats " + availableSeats);
        } else {
            LOGGER.info("No seats available");
        }
        return availableSeats;
    }

    public static int calculateCarrying(List<Cargo> cargoList, CargoAircraft cargoAircraft) {
        int totalWeight = cargoList.stream().mapToInt(Cargo::getWeight).sum();
        int carrying = cargoAircraft.getCapacity() - totalWeight;
        if (carrying>0) {
            LOGGER.info("There is still space left to load additional cargo: " + carrying + " kg");
        } else if (carrying == 0) {
            LOGGER.info("The plane is fully loaded, there is no more space for cargo ");
        } else {
            LOGGER.info("The plane is fully loaded, there is no more space for cargo " + Math.abs(carrying) + " kg");
        }
        return carrying;
    }



    public static int adult(Passenger passenger){
        LocalDate dateOfBirth = passenger.getDateOfBirth().toLocalDate();
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        if (age >= 18) {
            LOGGER.info("You're over 18 years old, continue your session");
        } else {
            LOGGER.info("You're under 18 years old, your session's been terminated ");
        }
        return age;
    }
}
