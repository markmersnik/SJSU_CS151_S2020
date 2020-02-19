package homework2;

public class Racoon extends Animal implements Attributes {

	public Racoon(String name, int age, String gender, int speed) {
		super("Racoon", name, age, gender, "The streets", speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int a) {
		// TODO Auto-generated method stub
		System.out.println("The racoon, " + super.getName() + " moves " + a + " meters in the dark.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("The racoon, " + super.getName() + " is hissing in the night.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The racoon, " + super.getName() + " is eating out of the garbage.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The racoon, " + super.getName() + " is sleeping in a dumpster.");
	}
	
	public void hide() {
		System.out.println("The racoon, " + super.getName() + " hides in the bushes.");
	}
	
	public void info() {
		System.out.println("\n" + this.getClass().getSimpleName() + super.toString());
	}
}
