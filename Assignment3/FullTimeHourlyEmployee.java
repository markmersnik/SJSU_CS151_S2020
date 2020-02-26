package homework3;

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
	
	public float computePay(int weeks) {
		return (float)hourlyRate*weeks;
	}
	
	public String toString() {
		return "Full Time Hourly Employee\n" + "Hourly Rate: " + this.hourlyRate + "\nOvertime Rate: " + this.overtimeRate + "\n\n";
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
}
