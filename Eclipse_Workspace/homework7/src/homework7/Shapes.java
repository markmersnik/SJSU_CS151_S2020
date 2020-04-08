package homework7;

import java.util.ArrayList;

public class Shapes extends Thread{
	
	private ArrayList<Shape> shapeList;
	
	Shapes() {
		shapeList = new ArrayList<Shape>();
	}
	
	public void add(Shape s) {
		shapeList.add(s);
	}
	
	public void remove(Shape s) {
		shapeList.remove(s);
	}
	
	public ArrayList<Shape> getShapeList(){
		return this.shapeList;
	}
	
	public synchronized void compute(){
		for(int i = 0; i < this.shapeList.size(); i++) {
			this.shapeList.get(i).computeArea();
			System.out.println(this.shapeList.get(i).toString());
		}
	}
}
