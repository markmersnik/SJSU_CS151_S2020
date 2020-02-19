package homework2;

public class Dog extends Animal implements Attributes {

	public Dog(String type, String name, int age, String gender, int speed) {
		super(type, name, age, gender, "Home", speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int a) {
		// TODO Auto-generated method stub
		System.out.println("The dog, " + super.getName() + " runs " + a + " feet.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("The dog, " + super.getName() + " barks.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The dog, " + super.getName() + " eats a steak.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The dog, " + super.getName() + " is sleeping on his bed.");
	}
	
	public void lick() {
		System.out.println("The dog, " + super.getName() + " licks your face.");
	}
	
	public void info() {
		System.out.println("\n" + this.getClass().getSimpleName() + super.toString());
	}

}
