package homework2;

public class Animal {

	private String type;
	private String name;
	private int age;
	private String gender;
	private String environment;
	private int speed;
	
	public Animal(String type, String name, int age, String gender, String environment, int speed) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	
	public void setType(String type) {
		this.type = type;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getType() {
		return this.type;
	}
		
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getEnvironment() {
		return this.environment;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public String toString() {
		return "\nType: " + this.type +
				"\nName: " + this.name + 
				"\nAge: " + this.age + " years old" +
				"\nGender: " + this.gender + 
				"\nEnvironment: " + this.environment + 
				"\nSpeed: " + this.speed + " miles/hr\n"; 
	}

}
