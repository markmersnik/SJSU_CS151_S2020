package homework7;

public class Circle implements Shape{

	private int radius;
	private float area;
	
	Circle(int radius) {
		this.radius = radius;
		this.computeArea();
		
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
				+ "Area: " + this.area;
	}

}
