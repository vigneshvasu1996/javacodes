package Examplespolymorphism;

public class Teacher {

	void add (int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

}
class Student extends Teacher
{
	void add (int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
 class Abs
{

	public static void main(String[] args) {
		Teacher st= new Student();
		st.add(10,20);
		st.add(20,30);
	}
}