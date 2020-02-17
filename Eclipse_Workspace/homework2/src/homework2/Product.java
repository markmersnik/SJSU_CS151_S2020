package homework2;

public final class Product {
	
	final String name;
	final String description;
	final double price;
	final int max_quantity;
	
	Product(String name, String desc, double price, int max) {
		this.name = name;
		this.description = desc;
		this.price = price;
		this.max_quantity = max;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getMaxQuantity() {
		return this.max_quantity;
	}
	
	//Overloaded toString method
	public String toString() {
		return "Name: " + this.name + "\n" + "Description: " + this.description + "\n";
	} 
	
	public String toString(String name, String desc, double price, int max) {
		return "Name: " + this.name + "\n" + "Description: " + this.description + "\n" 
				+ "Price: $" + this.price + "\n" + "Maximum Quantity: " + this.max_quantity + "\n";
	}
}
