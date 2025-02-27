package multithreading.ticketbooking;

public class TicketCounter {
	
	private int ticketsCount = 3;
	
	
	//synchronized is must when multiple threads performing same operation
	public synchronized void bookingTickets(String name, int numOfTickets) {		
		if(ticketsCount>=numOfTickets) {
			System.out.println("Hi "+ name +" Welcome to Red Bus available tickets count is "+numOfTickets);
			ticketsCount -= numOfTickets;
			System.out.println("Your Tickets booked successfully");
		}else {
			System.out.println("Sorry, only "+name+" ticket is available");
		}
	}

}
