package homework7;

public class Rectangle extends Shape{
	private int width;
	private int height;
	private float area;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
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
		this.area = width * height;		
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public float getArea() {
		this.computeArea();
		return this.area;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle\n" + 
				"Width: " + this.width + "\n"
				+ "Height: " + this.height + "\n"
				+ "Area: " + this.area + "\n";
	}
	
}
