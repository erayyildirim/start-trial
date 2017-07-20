package odev;



public class PhdStudent extends MasterStudent {
	protected boolean qualifyingExamToken;
	
	public PhdStudent(int no, String name, int year, String major, String advisor, boolean qualifyingExamToken){
		super(no, name, year , major , advisor);
		this.qualifyingExamToken = qualifyingExamToken;
	}
	

}
