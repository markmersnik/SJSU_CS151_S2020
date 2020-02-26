package homework3;

public class FullTimeSalaryEmployee extends Employee{
	
	private int salary = 60000;
	private int timeOff = 14;
	private String benefits = "Healthcare, Dental, and 401k";
	
	FullTimeSalaryEmployee() {
		
	}
	
	FullTimeSalaryEmployee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	FullTimeSalaryEmployee(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setTimeOff(int timeOff) {
		this.timeOff = timeOff;
	}
	
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public int getTimeOff() {
		return this.timeOff;
	}
	
	public String getBenefits() {
		return this.benefits;
	}

}
