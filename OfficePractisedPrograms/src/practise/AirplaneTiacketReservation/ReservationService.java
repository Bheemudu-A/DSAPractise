package practise.AirplaneTiacketReservation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Integer;

class ReservationService{
	

    private List<Reservation> reservations;

    public ReservationService() {
        this.reservations = new ArrayList<>();
    }

    public Reservation createReservation(Passenger passenger, Flight flight, String seatNumber) {
        if (flight.getAvailableSeats() > 0) {
            Reservation reservation = new Reservation();
            reservation.setReservationId("bheem102");
            reservation.setPassenger(passenger);
            reservation.setFlight(flight);
            reservation.setSeatNumber(seatNumber);
            flight.setAvailableSeats(flight.getAvailableSeats() - 1);
            reservations.add(reservation);
            return reservation;
        }
        return null;
    }

    public List<Reservation> getAllReservations() {
    	System.out.println("Reservations : "+reservations);
        return reservations;
    }

    public Reservation getReservationById(String reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationId().equals(reservationId)) {
                return reservation;
            }
        }
        return null;
    }

}
