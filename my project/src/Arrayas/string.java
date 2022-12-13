package Arrayas;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Hello";
college cc=new college();
cc.display(10, 20);
cc.display(90, 78, 88);
cc.display();
int d=cc.display(10, 10);
System.out.println("return type"+d);

	}

}
class college
{
int  display(int a,int b)//*over loading (methods name are same)
	{
System.out.println("first class");
int d=a+b;
return d; 
	}

	void display(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("second class");
		
	}
	void display()
	{
		System.out.println("without parameter");
	}
	}
