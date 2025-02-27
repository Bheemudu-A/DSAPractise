package practise.interviewPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 50000, "Manager"));
        employees.add(new Employee(102, "Bob", 45000, "Developer"));
        employees.add(new Employee(103, "Alice", 55000, "Lead"));
        employees.add(new Employee(104, "John", 40000, "Tester"));

        // Sort by name and then by salary
        employees.sort(Comparator.comparing(Employee::getName)
                                 .thenComparing(Employee::getSalary));

        // Print sorted employees
        employees.forEach(System.out::println);
    }
    
 /*   public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 50000, "Manager"));
        employees.add(new Employee(102, "Bob", 45000, "Developer"));
        employees.add(new Employee(103, "Alice", 55000, "Lead"));
        employees.add(new Employee(104, "John", 40000, "Tester"));

        // Sort using a custom Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                // First compare by name
                int nameComparison = e1.getName().compareTo(e2.getName());
                if (nameComparison != 0) {
                    return nameComparison; // If names are not equal, return comparison result
                }
                // If names are the same, compare by salary
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });

        // Print sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }*/
}