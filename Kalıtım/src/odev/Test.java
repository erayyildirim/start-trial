package odev;

public class Test {
	public static void main(String [] args){
		Student s1 = new Student(957, "Esin" , 2014  , "adsas");
		s1.study();
		s1.register();
		
		GraduateStudent g1 = new GraduateStudent(100, "Deniz", 1995 , "ffggf","sdfsd");
		g1.study();
		g1.register();
		g1.meetWithAdvisor();
		g1.study();
		g1.writeThesis();
		g1.youWillDie();
	}

}
