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
	
	public Shape min() {
		Shape smallest = this.shapeList.get(0);
		for(int i = 1; i < this.shapeList.size(); i++) {
			double min = Integer.MAX_VALUE;
			if(this.shapeList.get(i).getArea() < min) {
				smallest = this.shapeList.get(i);
				min = smallest.getArea();
			}
		}
		return smallest;
	}
	
	public Shape max() {
		Shape largest = this.shapeList.get(0);
		for(int i = 1; i < this.shapeList.size(); i++) {
			double max = Integer.MIN_VALUE;
			if(this.shapeList.get(i).getArea() > max) {
				largest = this.shapeList.get(i);
				max = largest.getArea();
			}
		}
		return largest;
	}
	
	public void setShapeList(ArrayList<Shape> list){
		this.shapeList = list;
	}
	
	public ArrayList<Shape> getShapeList(){
		return this.shapeList;
	}
	
	public synchronized void compute(){
		for(int i = 0; i < this.shapeList.size(); i++) {
			this.shapeList.get(i).start();
		}
	}
}
