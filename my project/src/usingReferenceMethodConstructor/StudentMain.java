package usingReferenceMethodConstructor;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1=new Student(100,"sam",'A');//parameters given for constructor variables 
		
		//1)assign values by using reference variable
		/* stu1.sid=100;
		 stu1.sname="sam";
		 stu1.grade='A';*/
		
		//2)assign values by using method
		 /*stu1.getvalues(100,"sam",'A');*/
		 
		 stu1.display();
	}

}
