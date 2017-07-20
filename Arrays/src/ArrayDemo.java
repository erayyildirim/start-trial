import java.util.Random;
import java.util.Arrays;
public class ArrayDemo {
	
	int[] intArray = new int[10];
	
	boolean[] flags = {true,false};
	
	public ArrayDemo(){
		
		for (int i=0; i < intArray.length; i++){
			System.out.println(intArray[i] + "-");
		}
		
		System.out.println("Initializing Arrays");
		for (int i=0; i < intArray.length; i++){
			Random r = new Random();
			int randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
			
		}
	}
	
public static void main (String[] args){
		ArrayDemo demo = new ArrayDemo();
	
}
	
	


}
