
public class ForDemo {
	public static void main(String[] args){
		
		
		for (char c = 0; c < 256; c++){
			System.out.println("value: " + (int)c + " character " + c);
			if (c % 10 == 0 & c != 0)
				System.out.println("\n");
		}
		
		// aynı işlem while ile
	}

}
