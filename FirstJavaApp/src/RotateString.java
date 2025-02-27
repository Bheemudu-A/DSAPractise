
public class RotateString {

	
	public static void main(String[] args) {
		
		String s = "abcde";
		String goal = "deabc";
		
		System.out.println("Is RotateString : "+rotateString(s, goal));
	}
	
	
	
	
	public static boolean rotateString(String s, String goal) {
	    if(s.length()!=goal.length())
	        return false;
	        goal += goal;
	        System.out.println("goal "+goal);
	     return goal.contains(s);
	}
}
