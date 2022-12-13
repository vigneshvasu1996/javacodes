package polymorphism;

public class PolymorphismOverloading {
	public static void main(String[] args) {
		
		Calci c = new Calci();
		c.add(10);
		c.add(10,12);

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
