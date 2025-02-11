package collections;

public class Product {
       private String name;
       private int Quantity;
	public Product(String name, int quantity) {
		super();
		this.name = name;
		Quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
}
