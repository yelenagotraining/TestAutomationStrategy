package com.tntautomation.test_pyramid_strategy.airport;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        List<String> newList = Arrays.asList(Locale.getISOCountries());
        System.out.println(newList);
       Passenger passenger = new Passenger("123-45-6789", "John Smith", "US");
       passenger.recordToSystem();

       Flight flight = new Flight("BA884", 100);
       flight.setOrigin("London");
       flight.setDestination("Bucharest");
       flight.sellTicket();
       flight.takeOff();
       flight.land();
    }
}
