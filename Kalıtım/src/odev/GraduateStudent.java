package odev;



public class GraduateStudent extends Student{
	
	protected String advisor;
	protected String thesis;
	
	public GraduateStudent(int no, String name, int year,String major, String advisor){
		super(no, name, year,major);
		this.advisor = advisor;
		
	}
	
	public void writeThesis(){
		System.out.println("Tez yazıldı.");
	}
	
	public void meetWithAdvisor(){
		System.out.println("Görüşme günü.");
	}

}
