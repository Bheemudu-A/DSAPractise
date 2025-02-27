import java.util.ArrayList;
import java.util.List;

public class FinalKeyWordDemo {
	
	public static void main(String[] args) {
		
		finalChanges();
	}

	private static void finalChanges() {
		
		final int a =10;
			 	 System.out.println(a+5);
			 	 //a =20; gets compilation error
			 	 
			 	 final List<Integer> list = new ArrayList<>();
			 	 
			 	 list.add(12);
			 	 list.add(15);//  Allowed (modifying the object's state)
			 	 //we can add varaibles to Final list reference but we cannot reassign
			// 	 list = new ArrayList<Integer>();  // Compilation Error (reassignment)
			 	 
			 	 List<Integer> ll = new ArrayList<Integer>(list);
			 	 	System.out.println(ll);
			 	 	
			 	 	//note: In short, final prevents reassignment but does not make objects immutable.
		
	}

}
