package ObjectClass;

public class toStringExample {
	public static void main (String [] args){
		
		Car c1 = new Car(2012,"Mercedes","CLK200",450);
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		System.out.println(c1.getClass().getName());
		
		System.out.println();
		
		Car c2 = new Car (2010,"Skoda","Fabia",75);
		System.out.println(c2);
	}

}
