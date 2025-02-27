package practise.AirplaneTiacketReservation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Integer;
class Main{

	public static void main(String[] args) {
		FlightService flightService = new FlightService();
		ReservationService reservationService = new ReservationService();

		// Add some flights
		Flight flight1 = new Flight();
		flight1.setFlightNumber("AI101");
		flight1.setOrigin("New York");
		flight1.setDestination("London");
		flight1.setDepartureTime(new Date());
		flight1.setArrivalTime(new Date());
		flight1.setTotalSeats(100);
		flight1.setAvailableSeats(2);
		
		System.out.println("flight1 : "+flight1);
		flightService.addFlight(flight1);

		// Add a passenger
		Passenger passenger1 = new Passenger();
		passenger1.setId("P001");
		passenger1.setName("John Doe");
		passenger1.setPassportNumber("A12345678");
		passenger1.setEmail("john.doe@example.com");
		System.out.println("passenger1 : "+passenger1);

		// Create a reservation
		Reservation reservation = reservationService.createReservation(passenger1, flight1, "12A");
		if (reservation != null) {
			System.out.println("Reservation created successfully: " + reservation.getReservationId());
		} else {
			System.out.println("Failed to create reservation.");
		}

		// List all flights
		System.out.println("Available flights:");
		for (Flight flight : flightService.getAllFlights()) {
			System.out.println(flight.getFlightNumber() + " from " + flight.getOrigin() + " to " + flight.getDestination());
		}

		// List all reservations
		System.out.println("All reservations:");
		for (Reservation res : reservationService.getAllReservations()) {
			System.out.println(res.getReservationId() + " for passenger " + res.getPassenger().getName());
		}
	}
}
