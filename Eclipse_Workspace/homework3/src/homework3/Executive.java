package homework3;

public class Executive extends FullTimeSalaryEmployee {
	
	private int officeFloor;
	private String receptionistName;
	
	Executive() {
		super.setSalary(100000);
	}
	
	Executive(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	Executive(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
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
}
