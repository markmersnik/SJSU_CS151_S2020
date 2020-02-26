package homework3;

public class Customer extends Person {
	
	private String preferredPayment;
	private String specialAccomodations;
	
	Customer() {
		
	}

	Customer(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	
	Customer(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
		// TODO Auto-generated constructor stub
	}
	
	public void setPreferredPayment(String payment) {
		this.preferredPayment = payment;
	}
	
	public void setAccomodations(String accomodations) { 
		this.specialAccomodations = accomodations;
	}
	
	
	//Getters for each of the fields.
	public String getPreferredPayment() {
		return this.preferredPayment;
	}
	
	public String getAccomodations() {
		return this.specialAccomodations;
	}
	
	public String toString() {
		return "Customer\n" + "Preferred Payment: " + this.preferredPayment + "\n" + "Special Accomodations: " + this.specialAccomodations + "\n\n";
	}
}
