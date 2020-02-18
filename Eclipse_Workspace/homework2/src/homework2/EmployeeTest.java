package homework2;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee joe = new Employee("Joe", "Smith", 29, "111-111-1111", "12345 Elm St.", "Male", (float)150.5, "10395829", "contractor", "2/20/20", (float)60);
		Employee lisa = new Employee("Lisa", "Gray", 42, "222-222-2222", "100 Wood Ln.", "Female", (float)130, "34582932", "full time", "3/24/20", (float)110000);
		Employee timothy= new Employee("Timothy", "Briggs", 35, "333-333-3333", "212 K St.", "Male", (float)181.7, "06840722", "full time", "1/1/20", (float)80000);
		Employee george = new Employee("George", "Wallace", 21, "444-444-4444", "45 6th Ave.", "Male", (float)164.3, "684720394", "part time", "6/21/20", (float)20);
		Employee amy = new Employee("Amy", "Student", 26, "555-555-5555", "9432 Main St.", "Female", (float)132.4, "593872948", "contractor", "9/17/20", (float)45);
		
		joe.introduce();
		joe.calculatePay(30);
		
		lisa.introduce();
		lisa.calculatePay(2);
		
		timothy.introduce();
		timothy.calculatePay(4);
		
		george.introduce();
		george.calculatePay(25);
		
		amy.introduce();
		amy.calculatePay(45);
		
	}
	
}
