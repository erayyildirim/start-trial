
package odev;



public class Student {
	protected int no;
	protected String name;
	protected int year;
	protected String major;

	public Student (int no, String name, int year, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.major = major;

	}
	
	public void study () {
		System.out.println("Öğrenci çalıştı.");
	}
	
	public void register(){
		System.out.println("Öğrenci kayıt oldu.");
	}
	
	public void youWillDie(){
		System.out.println("Follow the white rabbit");
	}
	

}
