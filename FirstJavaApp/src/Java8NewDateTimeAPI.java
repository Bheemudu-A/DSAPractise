import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Java8NewDateTimeAPI {
	/*
	 *before java8 date & time if you want only date it will print both date&time also they are non-synchronized, 
	 *from java8 separate date and time objects and they are synchronized
	 */
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();//no need to created object
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();//machine readable
		System.out.println(dateTime);
		
		//we can check time based on zone
		LocalTime lt = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(lt);
		
	}
	
}
