package homework6;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	
	private LinkedList<Course> courses;
	
	Student() {
		
		this.firstName = "none";
		this.lastName = "none";
		this.age = -1;
		this.gpa = -1;
		this.major = "none";
		this.department = "none";
		courses = new LinkedList<Course>();
		
	}
	
	Student(String firstName, String lastName, int age, float gpa, String major, String department) {
		
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		courses = new LinkedList<Course>();
		
	}
	
	public void addCourse(String name, String description, String department, String startTime, String weekday) {
		Course c = new Course(name, description, department, startTime, weekday);
		courses.add(c);
	}
	
	public void removeCourse(Course c) {
		courses.remove(c);
	}
	
	public void sortCourses(String attribute, Boolean ascending) throws UnmatchedAttributeException{
		if(attribute.equalsIgnoreCase("name")) {
			Collections.sort(courses, new Comparator<Course>() {
				  @Override
				  public int compare(Course c1, Course c2) {
				    return c1.getName().compareTo(c2.getName());
				  }
				});
			if(!ascending) {
				Collections.reverse(courses);
			}
		}
		else if(attribute.equalsIgnoreCase("description")) {
			Collections.sort(courses, new Comparator<Course>() {
				  @Override
				  public int compare(Course c1, Course c2) {
				    return c1.getDescription().compareTo(c2.getDescription());
				  }
				});
			if(!ascending) {
				Collections.reverse(courses);
			}
		}
		else if(attribute.equalsIgnoreCase("department")) {
			Collections.sort(courses, new Comparator<Course>() {
				  @Override
				  public int compare(Course c1, Course c2) {
				    return c1.getDepartment().compareTo(c2.getDepartment());
				  }
				});
			if(!ascending) {
				Collections.reverse(courses);
			}
		}
		else if(attribute.equalsIgnoreCase("start time")) {
			Collections.sort(courses, new Comparator<Course>() {
				  @Override
				  public int compare(Course c1, Course c2) {
				    return c1.getStartTime().compareTo(c2.getStartTime());
				  }
				});
			if(!ascending) {
				Collections.reverse(courses);
			}
		}
		else if(attribute.equalsIgnoreCase("day of the week")) {
			for(int i = 0; i < courses.size(); i++) {
				
			}
			Collections.sort(courses, new Comparator<Course>() {
				  @Override
				  public int compare(Course c1, Course c2) {
				    return c1.getName().compareTo(c2.getName());
				  }
				});
			if(!ascending) {
				Collections.reverse(courses);
			}
		}
		else {
			throw new UnmatchedAttributeException("Non-existant attribute inputted. Must be either 'name', 'description', 'department', 'start time', or 'day of the week'.");
		}
	}
	
	public void printInfo() {
		System.out.println("INFO:");
		System.out.println("Name: " + this.firstName + " " + this.lastName);
		System.out.println("Age: " + this.age);
		System.out.println("GPA: " + String.format("%.2f", this.gpa));
		System.out.println("Major: " + this.major);
		System.out.println("Department: " + this.department + "\n");
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
	
	class UnmatchedAttributeException extends Exception {
		public UnmatchedAttributeException(String message) {
			super(message);
		}
	}
}
