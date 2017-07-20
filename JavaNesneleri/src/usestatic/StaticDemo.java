package usestatic;

public class StaticDemo {
	static int i = 10;
	int k = 5;
	int nesnesay;
	int c;
	{
		c=2;
		c++;
		++c;
	}
	

	public static void main(String[] args) {

		System.out.println(StaticDemo.i);
		StaticDemo.increment();
		System.out.println(StaticDemo.i);

		StaticDemo st1 = new StaticDemo();
		StaticDemo st2 = new StaticDemo();

		// etikolmayan ulaşım
		System.out.println(st1.i);
		System.out.println(st2.i);
		// etikolmayan ulasım
		st1.increment();
		st2.increment();
		st2.increment();
		System.out.println(st1.i);
		System.out.println(st2.i);

		System.out.println(StaticDemo.i);
		System.out.println(st1.k);
		System.out.println(st1.c);
		System.out.println(st2.c);

	}

	static void increment() {
		i++;
	}

}
