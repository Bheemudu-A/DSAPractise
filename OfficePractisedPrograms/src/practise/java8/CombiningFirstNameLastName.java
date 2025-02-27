package practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CombiningFirstNameLastName {
	
	public static void main(String[] args) {
		
		List<String> firstName = Arrays.asList("Bheem", "Koushika");
        List<String> lastName = Arrays.asList("Avula", "Pulagam");
        
        			
        Map<String, String> map =   IntStream.range(0, Math.min(firstName.size(), lastName.size())).boxed().collect(Collectors.toMap(firstName :: get, lastName::get));
     
        System.out.println("map : "+map);
        
     //to sort map in assigning order of keys   
     Map<String, String> sortedmap =   IntStream.range(0, Math.min(firstName.size(), lastName.size())).boxed().collect(Collectors.toMap(firstName :: get,  lastName::get, (v1, v2) ->v1, TreeMap :: new));
		
     	System.out.println("sortedmap : "+sortedmap);
	}

}
