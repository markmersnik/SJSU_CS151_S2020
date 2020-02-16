package homework2;

public class Employee extends Person{
	
	private String id;
	private String status;
	private String start_date;
	private float pay;
	
	Employee(String firstName, String lastName, int age, String ssn, String address, String gender, 
			float weight, String id, String status, String start_date, float pay) {
		
		super(firstName, lastName, age, ssn, address, gender, weight);
		
		this.id = id;
		this.status = status;
		this.start_date = start_date;
		this.pay = pay;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setStartDate(String start_date) {
		this.start_date = start_date;
	}
	
	public void setPay(float pay) {
		this.pay = pay;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public String getStartDate() {
		return this.start_date;
	}
	
	public float getPay() {
		return this.pay;
	}
	
	public void introduce() {
		super.introduce();
		System.out.println("Employee ID: " + this.id);
		System.out.println("Employee Status: " + this.status);
		System.out.println("Start Date: " + this.start_date);
		System.out.println("Pay: " + this.pay);
	}
}
