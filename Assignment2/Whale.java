package homework2;

public class Whale extends Animal implements Attributes {

	public Whale(String type, String name, int age, String gender, int speed) {
		super(type, name, age, gender, "Ocean", speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int a) {
		// TODO Auto-generated method stub
		System.out.println("The whale, " + super.getName()  + "  swims " + a + "yards.");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("The whale, " + super.getName()  + "  makes a pulsed call sound.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The whale, " + super.getName()  + " eats a fish.");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The whale, " + super.getName() + " is sleeping.");
	}
	
	public void surface() {
		System.out.println("The whale, " + super.getName() + " surfaces to the top of the water.");
	}
	
	public void info() {
		System.out.println("\n" + this.getClass().getSimpleName() + super.toString());
	}
}
