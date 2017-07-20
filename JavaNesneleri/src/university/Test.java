package university;

public class Test {
	public static void main (String[] args){
		Department d1 = new Department();
		d1.name = "Software Engineering";
		
		Proffessor p1 = new Proffessor();
		p1.name = "Hakan Kutucu";
		
		Course c1 = new Course ();
		c1.name = "Algorithm";
		
		Student s1 = new Student();
		s1.name = "Eray Yıldırım";
		
		Student s2 = new Student();
		s2.name = "Aykut Sezgin";
		Student s3 = new Student();
		s3.name = "Volkan Küçükçetin";
		Student s4 = new Student();
		s4.name = "Mustafa Emirosmanoğlu";
		
		d1.head = p1;
		
		c1.department = d1;
		
		c1.teacher = p1;
		
		p1.coursesGiven = new Course[5];
		p1.coursesGiven [0] = c1;
		
		p1.advise = new Student [10];
		p1.advise[0] = s1;
		p1.advise[1] = s4;
		s1.advisor = p1;
		s1.coursesTaken = new Course[7];  //s1 7 ders alıyor
		s1.coursesTaken[0] = c1;          //aldığı derslerden biri c1
		
		d1.courses = new Course [100];
		d1.courses[0] = c1;
		
		System.out.println("Name of student s1's first course is " + s1.coursesTaken[0].name);
		
		System.out.println("Name of student s1's first course proffessor is " + s1.coursesTaken[0].teacher.name);
		
		//eklemeler
		
		Proffessor p2 = new Proffessor();
		p2.name = "Mehmet Akbaba";
		Proffessor p3 = new Proffessor();
		p3.name = "Ali Yen";
		
		Course c3 = new Course();
		c3.name = "Electronic";
		c3.department = d1;
		c3.teacher = p3;
		
		Course c4 = new Course();
		c4.name = "Database";
		c4.department = d1;
		c4.teacher = p3;
		
		
		
		Course c2 = new Course();
		c2.name = "Automata";
		c2.department = d1;
		c2.teacher = p3;
		p3.coursesGiven = new Course[3];
		p3.coursesGiven[0] = c2;
		p3.coursesGiven[1] = c3;
		p3.coursesGiven[2] = c4;
		
		
		
		s2.coursesTaken = new Course [3];
		s2.coursesTaken[0]=c1; 
		s2.coursesTaken[1]=c2; 
		s2.coursesTaken[2]=c3;
		
		
		
		
		
		for(int i=0; i<s2.coursesTaken.length; i ++){
			System.out.println(s2.name +"'nin " + s2.coursesTaken[i].name + " dersine giren hoca = " + s2.coursesTaken[i].teacher.name);
		}
		
		
		for (int i=0; i<p1.advise.length; i++){
			System.out.println(p1.name + " prf hocamız" + p1.advise[i].name + " adlı öğrencilerimize tavsiye vermektedir.");
			
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
