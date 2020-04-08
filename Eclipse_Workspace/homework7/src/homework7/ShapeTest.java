package homework7;

public class ShapeTest {
	
	public static void main(String[] args) {
		Shapes s = new Shapes();
		
		Rectangle r1 = new Rectangle(5,10);
		Rectangle r2 = new Rectangle(2,9);
		Triangle t1 = new Triangle(3, 4);
		Triangle t2 = new Triangle(12, 32);
		Circle c1 = new Circle(12);
		Circle c2 = new Circle(62);
		Hexagon h1 = new Hexagon(3);
		Hexagon h2 = new Hexagon(23);
		
		s.add(r1);
		s.add(r2);
		s.add(t1);
		s.add(t2);
		s.add(c1);
		s.add(c2);
		s.add(h1);
		s.add(h2);
		
		
		
	}
}
