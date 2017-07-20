package ObjectClass;

public class EqualityExample {
	public static void main(String[] args) {

		Product p1 = new Product(112, "Kan epe", 169.0);
		Product p2 = new Product(11, "Kanepe", 170.0);

		if (p1 == p2)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		boolean b = p1.equals(p2);
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
	}

}
