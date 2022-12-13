package day2;

public class constructorpractise {
	int a;
	int b;
	int c;
	constructorpractise()
	{
		a=10;
		b=20;
		c=30;
	}
	void display()
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		constructorpractise cp=new constructorpractise();
		cp.display();

	}

}
