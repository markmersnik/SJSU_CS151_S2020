package homework7;

public class Triangle extends Shape{
	private int base;
	private int height;
	private float area;
	
	Triangle(int base, int height){
		this.base = base;
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
		this.area = (float) (0.5 * this.base * this.height);
	}
	
	public int getBase() {
		return this.base;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public float getArea() {
		this.computeArea();
		return this.area;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Triangle\n" + 
				"Base: " + this.base + "\n"
				+ "Height: " + this.height + "\n"
				+ "Area: " + this.area + "\n";
	}
}
