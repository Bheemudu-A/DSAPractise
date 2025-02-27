
public class Switchpractise {
	
	public static void main(String[] args) {
		
		
		
		int id = 1;	
		switch(id) {
		case 1:
			System.out.println("Monday");
			break;
		case 2: System.out.println("tuesday");
		break;
		default:
		}
		
		//using lambda expression
		
		String day = switch(id) {
		
		case 1 -> "Monday";
		case 2 -> "tuesday";
		default -> "sunday";
		};
		System.out.println(day);
	}
	

}
