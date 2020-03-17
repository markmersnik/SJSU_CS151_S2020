package homework5;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String id;
	private int hourlyPay;
	
	Employee() {
		this.firstName = "none";
		this.lastName = "none";
		this.id = "none";
		this.hourlyPay = 0;
	}
	
	Employee(String firstName, String lastName, String id, int hourlyPay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		if(hourlyPay > 0) {
			this.hourlyPay = hourlyPay;
		}
		else {
			this.hourlyPay = 15;
		}
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getID() {
		return this.id;
	}
	
	public int getHourlyPay() {
		return this.hourlyPay;
	}
	
	public float computePay(int hoursWorked) {
		try {
			if(hoursWorked < 0) {
				hoursWorked = 0;
				throw new NumberFormatException();
			}
			else if(hoursWorked > 40) {
				hoursWorked = 40;
				throw new TooManyHoursWorkedException();
			}
		}
		catch(NumberFormatException | TooManyHoursWorkedException e) {
			System.out.println(e);
		}
		return hoursWorked * this.hourlyPay;
	}
	
	class NumberFormatException extends Exception {
		NumberFormatException() {
			super("Numbers of hours is Invalid.");
		}
		NumberFormatException(String s) {
			super(s);
		}
	}
	
	class TooManyHoursWorkedException extends Exception {
		TooManyHoursWorkedException() {
			super("Cannot work more than 40 hours.");
		}
		TooManyHoursWorkedException(String s) {
			super(s);
		}
	}
}
