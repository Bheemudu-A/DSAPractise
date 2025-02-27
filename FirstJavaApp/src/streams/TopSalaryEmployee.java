package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TopSalaryEmployee {
	
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>(Arrays.asList(
				new Employee("Bheem", 70000),
				new Employee("Koushika", 2000000),
				new Employee("Ramesh", 56000))
				);
	
		System.out.println("list : "+list);
		
		System.out.println("Top salary : "+employeeWithTopSalary(list));
	}

	private static String employeeWithTopSalary(List<Employee> list) {
		
	Optional<String> eName = 	list.stream().sorted((e1, e2) -> e2.getSalary()-e1.getSalary()).map(each -> each.getName()).findFirst();
		
		return eName.get();
	}
	
	
			

}
