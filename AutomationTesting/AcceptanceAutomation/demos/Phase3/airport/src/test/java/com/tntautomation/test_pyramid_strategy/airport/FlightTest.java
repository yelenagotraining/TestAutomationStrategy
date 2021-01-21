package com.tntautomation.test_pyramid_strategy.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlightTest {

    @Test
    public void testFlightCreation() {
        Flight flight = new Flight("AA123", 100);
        assertNotNull(flight);
    }

    @Test
    public void testInvalidFlightNumber() {
        assertThrows(RuntimeException.class,
                ()->{
                    Flight flight = new Flight("AA12", 100);
                });
        assertThrows(RuntimeException.class,
                ()->{
                    Flight flight = new Flight("AA12345", 100);
                });
    }

    @Test
    public void testValidFlightNumber() {
        Flight flight = new Flight("AA345", 100);
        assertNotNull(flight);
        flight = new Flight("AA3456", 100);
        assertNotNull(flight);
    }

    @Test
    public void testSellTickets() {
        Flight flight = new Flight("AA1234", 50);
        flight.setOrigin("London");
        flight.setDestination("Bucharest");
        for(int i=0; i<flight.getPlaces(); i++) {
            flight.sellTicket();
        }
        assertEquals(50, flight.getPassengers());
        assertThrows(RuntimeException.class,
                ()->{
                    flight.sellTicket();
                });

    }

    @Test
    public void testSetInvalidPlaces() {
        Flight flight = new Flight("AA1234", 50);
        flight.setOrigin("London");
        flight.setDestination("Bucharest");
        for(int i=0; i<flight.getPlaces(); i++) {
            flight.sellTicket();
        }
        assertEquals(50, flight.getPassengers());
        assertThrows(RuntimeException.class,
                ()->{
                    flight.setPlaces(49);
                });

    }

    @Test
    public void testSetValidPlaces() {
        Flight flight = new Flight("AA1234", 50);
        flight.setOrigin("London");
        flight.setDestination("Bucharest");
        for(int i=0; i<flight.getPlaces(); i++) {
            flight.sellTicket();
        }
        assertEquals(50, flight.getPassengers());
        flight.setPlaces(52);
        assertEquals(52, flight.getPlaces());
    }
}
