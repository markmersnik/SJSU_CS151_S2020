package homework3;

public class Employee extends Person {
	
	private int employeeID;
	private boolean directDeposit;
	
	Employee() {
		
	}

	Employee(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	
	Employee(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
		// TODO Auto-generated constructor stub
	}
	
	Employee(String firstName, String lastName, int age, String ssn, Address address, String gender, float weight) {
		super(firstName, lastName, age, ssn, address, gender, weight);
		// TODO Auto-generated constructor stub
	}
	
	
	public void setEmployeeID(int id) {
		this.employeeID = id;
	}
	
	public void setWeight(boolean dd) { 
		this.directDeposit = dd;
	}
	
	
	public int getEmployeeID() {
		return this.employeeID;
//		return "Employee ID: " + this.employeeID + "\n";
	}
	
	public boolean getDirectDepositStatus() {
		
		return this.directDeposit;
//		if(directDeposit) {
//			return "Direct Deposite: Activated\n";
//		}
//		return "Direct Deposite: Not Activated\n";
	}
	

}
