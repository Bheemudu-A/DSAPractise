package multithreading.ticketbooking;

//Thread class ex
public class MainClas {
	
	public static void main(String[] args) {
		TicketCounter ticketCount = new TicketCounter();
		Passengers p1 = new Passengers(ticketCount, "Bheem", 2);
		Passengers p2 = new Passengers(ticketCount, "senu", 2);
		p1.start();
		p2.start();
	}

}
