package com.solvd.utils;


import com.solvd.person.Passenger;
import com.solvd.vehicle.Aircraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class AirportUtils {
    private static final Logger LOGGER = LogManager.getLogger(AirportUtils.class);

    public static int calculateCapacity(Aircraft aircraft, List<Passenger> passengers){
        int availableSeats=aircraft.getCapacity() - passengers.size();
        if (availableSeats > 0) {
            LOGGER.info("Available seats " + availableSeats);
        } else {
            LOGGER.info("No seats available");
        }
        return availableSeats;
    }
}
