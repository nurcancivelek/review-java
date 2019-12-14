package Review7;

public class School {
	public static void main(String[] args) {
		
	

	Student s1= new Student();
	s1.studentNr=222;
	s1.studentName="Temel Laz";
	s1.gradeLevel="Grade 1";
	
	Student s2= new Student();
	s2.studentNr=312;
	s2.studentName="Mary Adams";
	s2.gradeLevel="Grade 3";
	
	Student s3= new Student();
	s3.studentNr=431;
	s3.studentName="James Beast";
	s3.gradeLevel="Grade 3";
	
	Teacher t1= new Teacher();
	t1.teacherName="Paul Smith";
	t1.salary=50000;
	t1.subject="Math";
	
	Teacher t2= new Teacher();
	t2.teacherName="Emily Jordan";
	t2.salary=35000;
	t2.subject="Art";
	
	s1.displayName();
	System.out.println(s1.studentName);
	
	t1.teach();
	s1.study();
	s2.study();
	s3.sleep();
	t1.yell();
	
	}
}
