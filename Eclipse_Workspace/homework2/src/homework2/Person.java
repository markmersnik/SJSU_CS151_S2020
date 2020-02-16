package homework2;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private String address;
	private String gender;
	private float weight;
	
	Person(String firstName, String lastName, int age, String ssn, String address, String gender, float weight) {
		
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
		
	}
	
	//Setters for each of the fields.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setWeight(float weight) { 
		this.weight = weight; 
	}
	
	
	//Getters for each of the fields.
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getSSN(float ssn) {
		return this.ssn;
	}
	
	public String getAddress(String address) {
		return this.address;
	}
	
	public String getGender(String gender) {
		return this.gender;
	}
	
	public float getWeight(float weight) { 
		return this.weight; 
	}
	
	//Overloaded toString method 
	public String toString(Person p) {
		return p.getFirstName() + " " + p.getLastName();
	}
	
	//Introduce method that print person's attributes
	public void introduce() {
		System.out.println(this.firstName + " " + this.lastName + "'s attributes:");
		System.out.println("Age: " + this.age);
		System.out.println("SSN: " + this.ssn);
		System.out.println("Address: " + this.address);
		System.out.println("Gender: " + this.gender);
		System.out.println("Weight: " + this.weight);
	}
	
}
