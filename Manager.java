package pgo10;

public class Manager extends Employee {
	private double bonus;
	
	public Manager(String firstName, String lastName, int year, int hireDate, String companyName, double salary, double bonus) {
		super(firstName, lastName, year, hireDate, companyName, salary);
		
		this.bonus = bonus;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	
	@Override
	public String toString() {
		return String.format("Manager with last name %s and age %d  has salary %.1f", getLastName(), getAge(), getSalary());
	}
	
}
