public class otobus {
	int yas;
	String ehliyet;
	String firma;
	int tecrube;
	int hız;

	public void git(int km) {
		tecrube += km;

	}
	
	public void mola() {
		hız = 0;
		System.out.println("mola verildi");
		
	}

	public String BilgiAl() {
		return "Bilgiler: " + "Yas: " + yas + " Ehliyet:" + ehliyet
				+ " Firma: " + firma + " Yol Puan: " + tecrube + " Hızı:" + hız
				+ " kmph.";
	}
}
