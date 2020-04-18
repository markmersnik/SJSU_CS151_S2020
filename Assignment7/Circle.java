package homework7;

public class Circle extends Shape{

	private int radius;
	private float area;
	
	Circle(int radius) {
		this.radius = radius;
		this.computeArea();
		
	}
	
	public void run() {
		try {
			this.computeArea();
			System.out.println(this.toString());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	 public void computeArea() {

		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
		
	}
	
	public float getArea() {
		
		return this.area;
		
	}
	
	public int getRadius() {
		
		return this.radius;
		
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle\n" + 
				"Radius: " + this.radius + "\n"
				+ "Area: " + this.area + "\n";
	}

}
