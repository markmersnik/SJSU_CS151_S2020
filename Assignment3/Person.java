package homework3;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private Address address;
	private String gender;
	private float weight;
	
	Person(){
		
	}
	
	Person(String firstName, String lastName) {
		
		this.firstName = firstName; 
		this.lastName = lastName;
		
	}
	
	Person(String firstName, String lastName, Address address) {
		
		this.firstName = firstName; 
		this.lastName = lastName;
		this.address = address;
		
	}
	
	Person(String firstName, String lastName, int age, String ssn, Address address, String gender, float weight) {
	
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
	
	public void setAddress(int number, String name, String city, int zip, String state) {
		Address address = new Address(number, name, city, zip, state);
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
		return this.address.toString();
	}
	
	public String getGender(String gender) {
		return this.gender;
	}
	
	public float getWeight(float weight) { 
		return this.weight; 
	}
	
	//Overloaded toString method 
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
	
	public String toString(String firstName, String lastName, int age, String ssn, Address address, String gender, float weight) {
		return firstName + " " + this.lastName + "'s attributes:\n" +
				"Age: " + this.age + "\n" +
				"SSN: " + this.ssn + "\n" + 
				"Address: " + this.address.toString() + "\n" +
				"Gender: " + this.gender + "\n" + 
				"Weight: " + this.weight;
	}
	
	//Introduce method that print person's attributes
	public void introduce() {
		System.out.println(this.toString(this.firstName, this.lastName, this.age, this.ssn, this.address, this.gender, this.weight));
	}
	
	public class Address {
		
		private int streetNumber;
		private String streetName;
		private String city;
		private int zip;
		private String state;
		
		public Address(int number, String name, String city, int zip, String state) {
			this.streetNumber = number;
			this.streetName = name;
			this.city = city;
			this.zip = zip;
			this.state = state;
		}
		
		public String toString() {
			return this.streetNumber + " " + this.streetName + ".\n" + this.city + ", " + this.state + " " + this.zip;
		}
	}
	
}