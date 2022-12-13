package Oopsconcepts;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci c = new Calci();
		c.add(10);
		c.add(10.6f,12);
	c.add(12.7f,12.67f);

	}
}

class Calci {

	public void add(int a) {
		int b=5;
		System.out.println("add result "+(a+b));
	}
public void add(float a, float b) { // over loading..
		System.out.println("add  = " + (a + b));

	}

	public void add(int a, int b) {
		System.out.println("add  = " + (a + b));
}
}