
public class otobusTest {
	public static void main(String[] args){
		otobus surucu1=new otobus();
		surucu1.yas=49;
		surucu1.ehliyet="E";	
		surucu1.firma="KamilKoc";
		surucu1.tecrube=5000;
		System.out.println(surucu1.BilgiAl());
		
		surucu1.git(250);
		surucu1.mola();
		surucu1.git(250);
		System.out.println(surucu1.BilgiAl());
		surucu1.hız=90;
		surucu1.git(250);
		System.out.println(surucu1.BilgiAl());
		surucu1.mola();
		System.out.println(surucu1.BilgiAl());

		
	}
}

