package practise.interviewPrograms;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;

    // Constructor
    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    // toString method for displaying Employee details
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", designation='" + designation + "'}";
    }
}



