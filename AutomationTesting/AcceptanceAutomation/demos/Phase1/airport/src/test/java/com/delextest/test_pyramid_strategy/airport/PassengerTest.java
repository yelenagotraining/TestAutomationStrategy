package com.delextest.test_pyramid_strategy.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    @Test
    public void testPassengerCreation() {
          Passenger passenger = new Passenger("123-45-6789", "John Smith", "US");
          assertNotNull(passenger);
    }

    @Test
    public void testInvalidSsn() {
        assertThrows(RuntimeException.class,
                ()->{
                    Passenger passenger = new Passenger("123-456-789", "John Smith", "US");
                });


    }
    @Test
    public void testInvalidCountryCode() {
        assertThrows(RuntimeException.class,
                ()->{
                    Passenger passenger = new Passenger("123-45-6789", "John Smith", "US");
                });
    }
    @Test
    public void testSetInvalidCountryCode() {
        assertThrows(RuntimeException.class,
                ()->{
                    Passenger passenger = new Passenger("123-45-6789", "John Smith", "US");
                    //passenger.setCountryCode("GJ");
                });

    }

}
