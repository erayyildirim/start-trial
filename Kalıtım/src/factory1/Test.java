package factory1;

public class Test {
	public static void main (String [] args){
		
		Employee e1 = new Employee(1,"Eray", 7 , "Business Solution");
		e1.printInfo();
		System.out.println("Maaşı: " + e1.calculateSalary());
		e1.work();
		
		Manager m1 = new Manager(3,"Faruk", 20 , "Business Solution","Business Solution");
		m1.printInfo();
		System.out.println("Maaşı: " + m1.calculateSalary());
		m1.work();
		
		Director d1 = new Director(4, "Mehmet", 2, "Management", "Management", 3000);
		d1.printInfo();
		System.out.println("Maaşı: " + d1.calculateSalary());
		d1.work();;
		
		
	}

}
