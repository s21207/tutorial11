package pgo10;

import java.util.Calendar;

public class Employee extends Person {
	private int hireDate;
	private String companyName;
	private double salary;
	
	public Employee(String firstName, String lastName, int year, int hireDate, String companyName, double salary) {
		super(firstName, lastName, year);
		this.hireDate = hireDate;
		this.companyName = companyName;
		this.salary = salary;
	}
	
	
	public int getJobSeniority() {
		return Calendar.getInstance().get(Calendar.YEAR) - hireDate;
	}
	
	public double getSalary() {
		return salary;
	}
	
}
