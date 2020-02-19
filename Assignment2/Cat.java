package homework2;

public class Cat extends Animal implements Attributes {

	public Cat(String type, String name, int age, String gender, int speed) {
		super(type, name, age, gender, "Home", speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int a) {
		// TODO Auto-generated method stub
		System.out.println("The cat, " + super.getName() + " climbs a " + a + " foot tree.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("The cat, " + super.getName() + " meows.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The cat, " + super.getName() + " eats some tuna.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The cat, " + super.getName() + " is sleeping in a hat.");
	}
	
	public void scratch() {
		System.out.println("The cat, " + super.getName() + " scratches its' toy scratcher.");
	}
	
	public void info() {
		System.out.println("\n" + this.getClass().getSimpleName() + super.toString());
	}

}
