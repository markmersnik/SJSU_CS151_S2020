package homework3;

public class BusinessTest {
	public static void main(String[] args) {
		
		Customer c = new Customer("Chris", "Johnson");
		c.setPreferredPayment("Credit");
		c.makePayment();
		
		Executive e = new Executive();
		e.setOfficeFloor(23);
		e.setReceptionistName("Sam");
		e.introduce();
		
		FullTimeSalaryEmployee f = new FullTimeSalaryEmployee();
		f.introduce();
		
		PartTimeHourlyEmployee p = new PartTimeHourlyEmployee("Susie", "Lee");
		p.introduce();
		
		Contractor co = new Contractor();
		co.introduce();
		
		System.out.println(p.getFirstName() + "'s pay for 30 hours of work is $" + p.computePay(30));
	}
}
