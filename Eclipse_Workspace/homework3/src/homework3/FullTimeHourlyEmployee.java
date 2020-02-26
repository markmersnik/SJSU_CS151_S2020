package homework3;

import homework3.Person.Address;

public class FullTimeHourlyEmployee extends Employee{
	private double hourlyRate = 7.50;
	private double overtimeRate = 15;
	FullTimeHourlyEmployee() {
		
	}
	
	FullTimeHourlyEmployee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	FullTimeHourlyEmployee(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
	}
	
	public void setHourlyRate(double hourRate) {
		this.hourlyRate = hourRate;
	}
	
	public void setOvertimeRate(double rate) {
		this.overtimeRate = rate;
	}
	
	public double getHourlyRate() {
		return this.hourlyRate;
	}
	
	public double getOvertimeRate() {
		return this.overtimeRate;
	}
}
