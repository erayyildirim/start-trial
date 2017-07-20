public class StringDemo {
	public static void main(String[] args) {

		String s1 = new String("http://www.JavaTurk.org");
		String s2 = new String("http://java.sun.com");

		System.out.println("s1: " + s1 + "\t" + "s2: " + s2 + "\n");
		String tmp = s1;
		s1 = s2;
		System.out.println("s1 starts wtih: " + s1.charAt(0));
		s2 = tmp;
		System.out.println("s1: " + s1 + "\t" + "s2: " + s2);
		
		System.out.println("s2: " + s2 + "\t" +"tmp: " + tmp);
		
		String s3 = s2.concat("XYZ");
		System.out.println("s2: " + s2 + "\t" + "s3: " +s3);
		
		//nul için
		System.out.println("s1 starts wtih: " + s1.charAt(0));
		s1=null;
		System.out.println("s1: "+ s1);
		
		//s1 e yenı obje atanabilir
		for (int i=1; i<10; i += 2)
		{ for (int k=0; k < (4 - i / 2); k++)
		{ System.out.print(" "); } 
		for (int j=0; j<i; j++) 
		{ System.out.print("*"); } 
		System.out.println(""); }
	}

}
