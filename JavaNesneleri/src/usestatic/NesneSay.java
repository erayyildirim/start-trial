package usestatic;

public class NesneSay {
	static int counter = 0;

	NesneSay() {

		counter++;
		System.out.println("n" + counter + " was created.");
	}
	NesneSay(int i){
		counter++;
		System.out.println("n" + counter + " was created." + " bu nesne arg almıştır");
		
	}
	public static void main(String[] args) {
		NesneSay n1 = new NesneSay();
		NesneSay n2 = new NesneSay();
		NesneSay n3 = new NesneSay(3);
		NesneSay n4 = new NesneSay();
		NesneSay n5 = new NesneSay(5);

		System.out.println("Oluşturulan nesne sayisi= " + NesneSay.counter);
		

	}

}
