package homework6;

public class Person {
	
	private String firstName;
	private String lastName;
	private Integer age;

	Person(String firstName, String lastName, Integer age) {
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Integer getAge() {
		return this.age;
	}
}
