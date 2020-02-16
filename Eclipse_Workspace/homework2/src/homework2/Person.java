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
	public String toString(String first, String last) {
		return first + " " + last;
	}
	
	public String toString(String firstName, String lastName, int age, String ssn, String address, String gender, float weight) {
		return firstName + " " + this.lastName + "'s attributes:\n" +
				"Age: " + this.age + "\n" +
				"SSN: " + this.ssn + "\n" + 
				"Address: " + this.address + "\n" +
				"Gender: " + this.gender + "\n" + 
				"Weight: " + this.weight + "\n";
	}
	
	//Introduce method that print person's attributes
	public void introduce() {
		System.out.println(this.toString(this.firstName, this.lastName, this.age, this.ssn, this.address, this.gender, this.weight));
	}
}
