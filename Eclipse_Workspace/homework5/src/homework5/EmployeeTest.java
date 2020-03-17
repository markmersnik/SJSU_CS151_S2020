package homework5;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("John", "Smith", "101", 35);
		
		System.out.println("$" + e.computePay(40));
		System.out.println("$" + e.computePay(23));
		System.out.println("$" + e.computePay(1));
		System.out.println("$" + e.computePay(0));
		System.out.println("$" + e.computePay(-5));
		System.out.println("$" + e.computePay(45));
	}
}
