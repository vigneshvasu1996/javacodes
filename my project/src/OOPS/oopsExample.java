package OOPS;
import java.util.Scanner;

public class oopsExample {
	public void sub(int s1, int s2)
	{

int c=s1-s2;
System.out.println("subtraction value"+c);
	}
	
	public void display()
	{
		oopsExample oops2=new oopsExample();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first value for subtraction");
	int s1=sc.nextInt();
	System.out.println("Enter the first value for subtraction");
		int s2=sc.nextInt();
		oops2.sub(s1,s2);
		int age=25;
	    String name="vignesh kumar";
		String dob="31/12/1996";
		String place="Ulagankathan";
		System.out.println("Name="+name);
		System.out.println("Age of the person="+age);
		System.out.println("date of birth="+dob);
		System.out.println("name of the place="+place);
		
	}
	public void addition(int a, int b)
	{
int c=a+b;
	System.out.println("addition of the two numers are"+(a+b));	
	if(a>b)
	{
System.out.println("First number is biggest number");
	}
	else
	{
	System.out.println("second number is biggest");	
	}
	while(c<30)
	{
	System.out.println("welcome to oops");	
	c++;
	}
	}
	public static void main(String[] args) {
		
		oopsExample obj=new oopsExample();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number for addition");
		int a=sc.nextInt();
		System.out.println("enter the second number for addition");
		int b=sc.nextInt();
		obj.display();
		obj.addition(a,b);
		// TODO Auto-generated method stub

	}

}
