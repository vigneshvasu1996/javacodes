package Oopsconcepts;

class java
{
	int salary=1000;
	String name="ashok";
	int id=121;
	
}
class python extends java
{

	String name="vigensh";
    
	 public void screen()
	{
		 
		System.out.println("inheritance class");
	
	}}
class bonuspage extends python  
{
	 public void bonus()

{
		 System.out.println("bonus=20000");
		 }
}
class newemployee extends java
{
	public void newemp()
	{
		System.out.println("new employee");
		System.out.println("salary"+salary);
	}
}
class oldemployee extends java{
	public void oldemp()
	{
		System.out.println("Old employee");
		System.out.println("salary"+salary);
		System.out.println("id"+id);
	}
}
public class exampleinheritance {
	public static void main(String[] args) {
		bonuspage py=new bonuspage();
		oldemployee old=new oldemployee();
System.out.println(py.salary);
System.out.println(py.name);
py.screen();
py.bonus();
old.oldemp();
	}	
	}



