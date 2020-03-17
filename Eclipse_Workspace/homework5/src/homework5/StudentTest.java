package homework5;

public class StudentTest {
	public static void main(String[] args) {
		Student john = new Student("John", "Smith", 20, (float)3.6, "Computer Science", "School of Computer Science");
		Student john2 = john;
		
		john.printInfo();
		john2.printInfo();
	}
}
