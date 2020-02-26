package homework3;

public class PartTimeHourlyEmployee extends FullTimeHourlyEmployee {
	
	private double hoursAWeek = 24;
	
	PartTimeHourlyEmployee() {
		
	}
	
	PartTimeHourlyEmployee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	PartTimeHourlyEmployee(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
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
		return "Part Time Hourly Employee\n" + "Hours a Week: " + this.hoursAWeek + "\n\n";
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
}
