package denemeess;

public class deneme {
	
	private int x = 1;
	 
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        for (; x < 5; x++) {
            System.out.println(x);
            if (x < 3) {
                int y = 3;
                f(y);
            } else if (3 < x & x < 12) {
                int y = 8;
                f(y);
            } else {
                int y = 17;
                f(y);
            }
        }
        f(y);
    }
 
    public static void f(int i) {
        System.out.println(i);
    }
 
    public void ff() {
        int i = 6;
    }
}

		
		
	


