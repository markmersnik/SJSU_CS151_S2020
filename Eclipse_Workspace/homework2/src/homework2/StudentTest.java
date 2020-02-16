package homework2;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("John", "Smith", 20, (float) 3.6, "Computer Science", "School of Computer Science");
		System.out.printf(s.getFirstName() + " " + s.getLastName() + "'s ");
		
		Student.Course c = s.new Course();
		c.printSchedule();
	}
	
}
