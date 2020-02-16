package homework2;

public class Product {
	
	private String name;
	private String description;
	private float price;
	private int max_quantity;
	
	Product(String name, String desc, float price, int max) {
		this.name = name;
		this.description = desc;
		this.price = price;
		this.max_quantity = max;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setMaxQuantity(int max) {
		this.max_quantity = max;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public int getMaxQuantity() {
		return this.max_quantity;
	}
	
	public String toString() {
		
	}
}
