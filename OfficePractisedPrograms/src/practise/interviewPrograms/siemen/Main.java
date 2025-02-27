package practise.interviewPrograms.siemen;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import practise.java8.stream.Employee;

/*
 * Consider a Arraylist of employees containing 
   String EmpName,
   String EmpManagerName,
   List<String> previousCompanies.
   note that manager is also employee.So using streams print the Previous Companies list of given Employee's manager .
   Ex:Emp      Manager    PreviousCompanies
      Bunny    sunny      [tcs,wipro]
      sunny    Ram        [cgi]
  
  Input:Bunny
  Output:[cgi](sunny previous companies who is the manager of bunny)

 */
public class Main {

	public static void main(String[] args) {
		
		List<EmployeeHistory> emp = Arrays.asList(
				new EmployeeHistory("Bunny", "Sunny", Arrays.asList("TCS", "Wipro")),
				new EmployeeHistory("Bunny", "Bheem", Arrays.asList("TCS", "Wipro")),
				new EmployeeHistory("Sunny", "Ram", Arrays.asList("CGI")),
				new EmployeeHistory("Ram", "None", Arrays.asList("Infosys", "HCL")// Top Manager
			      
				));
		
		
//	List<EmployeeHistory> emps =	emp.stream().filter(i -> i.getEmpName().equals("Bunny")).distinct().collect(Collectors.toList());	
//	System.out.println("emps : "+emps);
	
		String empName = "Bunny";
		
		Optional<String> empManager = emp.stream().filter(i -> i.getEmpName().equals(empName)).map(EmployeeHistory::getManager).findFirst();
		
	Optional<List<String>> managerPreviousCom =  emp.stream().filter(i -> i.getEmpName().equals(empManager.get())).map(i -> i.getPreviousCompies()).findFirst();
		
		System.out.println("managerPreviousCom : "+managerPreviousCom);
	}
}
