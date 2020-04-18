package homework7;

import java.io.Serializable;

public abstract class Shape extends Thread implements Serializable{

	public abstract void run();
	
	public abstract void computeArea();
	
	public abstract float getArea();	
}
