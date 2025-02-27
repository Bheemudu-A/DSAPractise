package multithreading.ticketbooking;

public class Passengers extends Thread{
	
	protected TicketCounter ticketCounter;
	protected String passengerName;
	protected int numOfTickets;
	
	public Passengers(TicketCounter ticketCounter, String passengerName, int numOfTickets) {
		this.ticketCounter = ticketCounter;
		this.passengerName=passengerName;
		this.numOfTickets=numOfTickets;
	}
	
	@Override
	public void run() {
		ticketCounter.bookingTickets(passengerName, numOfTickets);
	}

	
	

}
