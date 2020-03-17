package homework5;

public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	
	private Course CS151, EE140, CS146, EE257;
	
	Student() {
		
		this.firstName = "none";
		this.lastName = "none";
		this.age = -1;
		this.gpa = -1;
		this.major = "none";
		this.department = "none";
		this.assignCourses();
		
	}
	
	Student(String firstName, String lastName, int age, float gpa, String major, String department) {
		
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.assignCourses();
		
	}
	
	public void assignCourses() {
		CS151 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm","Tue.");
		EE140 = new Course("EE140", "Principles of Electromagnetic Fields", "EE", "9:00am","Mon.");
		CS146= new Course("CS146", "Data Structures and Algorithms", "CS", "12:00pm","Thur.");
		EE257 = new Course("EE257", "Introduction to Machine Learning", "EE", "1:30pm","Wed.");
	}
	
	public void printInfo() {
		System.out.println("INFO:");
		System.out.println("Name: " + this.firstName + " " + this.lastName);
		System.out.println("Age: " + this.age);
		System.out.println("GPA: " + String.format("%.2f", this.gpa));
		System.out.println("Major: " + this.major);
		System.out.println("Department: " + this.department + "\n");
		System.out.println("Course 1: \n" + EE140.toString());
		System.out.println("Course 2: \n" + CS151.toString());
		System.out.println("Course 3: \n" + EE257.toString());
		System.out.println("Course 4: \n" + CS146.toString() + "\n\n");
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
}