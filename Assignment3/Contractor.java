package homework3;

public class Contractor extends FullTimeHourlyEmployee{
	
	private double hoursAWeek = 15;
	
	Contractor() {
		this.setHourlyRate(40);
	}
	
	Contractor(String firstName, String lastName) {
		super(firstName, lastName);
		this.setHourlyRate(40);
	}
	
	Contractor(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
		this.setHourlyRate(40);
	}
	
	public void setHoursAWeek(double hours) {
		this.hoursAWeek = hours;
	}

	public double getHoursAWeek() {
		return this.hoursAWeek;
	}
	
	public float computePay(int hours) {
		return (float)super.getHourlyRate()*hours;
	}
	
	public String toString() {
		return "Contractor\n" + "Hours a Week: " + this.hoursAWeek + "\nHourly Rate: " + super.getHourlyRate() + "\n\n";
	}
	
	
	public void introduce() {
		System.out.println(this.toString());
	}
}
