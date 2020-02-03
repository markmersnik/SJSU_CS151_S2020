package homework2;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	
	//Constructor for our Person class.
	Person(String firstName, String lastName, int age, float gpa, String major, String department) {
		
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		
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
	
	public void setGPA(float gpa) {
		this.gpa = gpa;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setDepartment(String department) {
		this.department = department;
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
	
	public float getGPA() {
		return this.gpa;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public class Course {
		
		private String[] courses = new String[] {"CS 151", "PHIL 101", "CS 146", "GEOG 112"};
		
		public void printSchedule() {
			System.out.println("Class Schedule:");
			for(int i = 0; i < courses.length; i++) {
				System.out.println("Course " + Integer.toString(i + 1) + ": " + courses[i]);
			}
		}
		
	}
}
