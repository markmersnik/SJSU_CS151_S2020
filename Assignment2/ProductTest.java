package homework2;

public class ProductTest {
	public static void main(String[] args) {
		Product p = new Product("Trampoline shoes", "shoes that make you jump higher", 29.99, 4);
		System.out.println(p.toString(p.getName(), p.getDescription(), p.getPrice(), p.getMaxQuantity()));
	}
}
