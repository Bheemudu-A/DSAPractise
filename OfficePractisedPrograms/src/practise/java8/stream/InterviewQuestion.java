package practise.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewQuestion {
	
	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
			new Employee(101, 30000),	
		    new Employee(104, 40000),
		    new Employee(102, 50000));
		
		List<EmployeeDept> dept = Arrays.asList(
				new EmployeeDept(101, "Mech"),
				new EmployeeDept(104, "IT"),
				new EmployeeDept(102, "IT")
				);
		
	Map<String, Integer> map =	dept.stream()
			.collect(Collectors.toMap(
					EmployeeDept:: getEmpDept, 
					ed -> emp.stream().filter(e -> e.getId() == ed.getId()).mapToInt(Employee::getSalary).findFirst().orElse(0), 
						Math::max
						));

		
	
	System.out.println("map : "+map);
	}

}
