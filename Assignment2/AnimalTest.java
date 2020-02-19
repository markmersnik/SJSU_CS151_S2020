package homework2;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Dog sparky = new Dog("Golden retreiver", "Sparky", 2, "Male", 28);
		Cat mittens = new Cat("Siamese", "Mittens", 8, "Female", 25);
		Racoon carl = new Racoon("Carl", 5, "Male", 12);
		Whale marsha = new Whale("Blue Whale", "Marsha", 64, "Female", 30);
		
		sparky.info();
		sparky.move(50);
		sparky.sound();
		sparky.eat();
		sparky.sleep();
		sparky.lick();
		
		mittens.info();
		mittens.move(32);
		mittens.sound();
		mittens.eat();
		mittens.sleep();
		mittens.scratch();
		
		carl.info();
		carl.move(12);
		carl.sound();
		carl.eat();
		carl.sleep();
		carl.hide();
		
		marsha.info();
		marsha.move(247);
		marsha.sound();
		marsha.eat();
		marsha.sleep();
		marsha.surface();
		
	}
	
}
