public class WhileDemo {
	public static void main (String[] args){
		
//		Random rand = new Random();
//		int i = rand.nextInt() % 150;
//		System.out.println(i);       //random 150ye kadar olan sayıları almak
		
		double r = Math.random();
		System.out.println("r: " + r);
		
		while(r < 0.8d){
			r = Math.random();
			System.out.println(r);
		}
// aynı işlemi do while ile yapalım
		
		double x = 0;
		do{
			x = Math.random();
			System.out.println("x: " + x);
		}while(x <0.8d);
		
		
	}

}
