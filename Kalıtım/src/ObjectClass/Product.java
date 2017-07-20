package ObjectClass;

public class Product {
	int no;
	String name;
	double price;

	public Product(int no, String name, double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		new Object().equals(new Object());
	}
    
	public boolean equals(Product p1) {
		boolean b = false;
		if (no == p1.no)
			b = true;
		return b;
	}

	public int hashCode() {
		return no;
	}
	
	public Object clone(){
		return new Product(no, name, price);
	}

	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

}
