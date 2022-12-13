package usingReferenceMethodConstructor;

public class Student 
{
	int sid;
	String sname;
	char grade;

	
	Student(int id,String name,char g)    //using constructor
	{
		sid=id;
		sname=name;
		grade=g;		
	}
	void getvalues(int id,String name,char g)  //using Method
	{
		sid=id;
		sname=name;
		grade=g;		
	}
	void display()
	{
		System.out.println(100+" "+"sam"+" "+'A');
	}
}
