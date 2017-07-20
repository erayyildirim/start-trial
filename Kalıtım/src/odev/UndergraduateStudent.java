package odev;



public class UndergraduateStudent extends Student{
	protected String minor;
	
	public UndergraduateStudent(int no, String name, int year,String major,String minor) {
		super(no, name, year, major);
		this.minor = minor;	
	}

	
	
	

}
