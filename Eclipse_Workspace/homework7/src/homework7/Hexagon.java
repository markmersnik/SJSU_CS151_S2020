package homework7;

public class Hexagon implements Shape{
	private int side;
	private float area;
	
	Hexagon(int sideLength){
		this.side = sideLength;
	}

	@Override
	public void computeArea() {
		this.area = (float) ((((Math.sqrt(3) * 3))/2) * Math.pow(side, 2));
	}
	
	public int getSideLength() {
		return this.side;
	}
	
	public float getArea() {
		this.computeArea();
		return this.area;
	}
	
	public void setSideLength(int SideLength) {
		this.side = SideLength;
	}
	
	@Override
	public String toString() {
		return "Hexagon\n" + 
				"Side Length: " + this.side + "\n"
				+ "Area: " + this.area;
	}
}
