import java.util.*;
public class ConditionalOperations {
	public static void main (String[] args){
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = b1 & b2;
		boolean b4 = b1 | b2;
		boolean b5 = b1 ^ b2;
		System.out.println("b1 & b2: " + b3);
		System.out.println("b1 | b2: " + b4);
		System.out.println("b1 ^ b2: " + b5);
		
		if ((getOne() == 7) && (getTwo() == 2)){
			System.out.println("value1 is 7 And value2 is 2");
		}
		
		if ((getOne() == 8) || (getTwo() == 1)){
			System.out.println("value1 is 8 or value2 is 1");
		}
		
		//Ternary operator
		int i = 8;
		int j = 11;
		int min = (i <= j) ? i : j;
		System.out.println(min);
		System.out.println((10 >> 2) + " " + (10 << 2));
		
		int w = 1;
		int y = 3;
		int z = 5;
		int x = ++y*w++ + (2 + y*z) + w;
		System.out.println(x);
		
		
		
		
	}
	public static int getOne() {
		System.out.println(" In getOne()");
		return 8;
	}
	
	public static int getTwo() {
		System.out.println(" In getTwo()");
		return 9;
	}

}
