package homework3;

public class Executive extends FullTimeSalaryEmployee {
	
	private int officeFloor = 2;
	private String receptionistName = "N/A";
	
	Executive() {
		super.setSalary(100000);
	}
	
	Executive(String firstName, String lastName) {
		super(firstName, lastName);
		super.setSalary(100000);
	}
	
	Executive(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
		super.setSalary(100000);
	}
	
	public void setOfficeFloor(int floor) {
		this.officeFloor = floor;
	}
	
	public void setReceptionistName(String name) {
		this.receptionistName = name;
	}
	
	public int getOfficeFloor() {
		return this.officeFloor;
	}
	
	public String getReceptionistName() {
		return this.receptionistName;
	}
	
	public int computePay() {
		return this.getSalary();
	}
	
	public String toString() {
		return "Executive\n" + "Office Floor: " + this.officeFloor + "\nReceptionist's Name: " + this.receptionistName + "\n\n";
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
}
