package OOPS;

public class Functions {

	static int a=54;
	public static void main(String[] sdf) {
		System.out.println("Hi");
		display(); // function/method call
		add(12,a);
		int results = add2(12,98);
		System.out.println("Add2 result = "+results);
		System.out.println("Bye..");
		{
			//scope
			int x=10;
			System.out.println(x);
			
		}

	}

	//no return no param
	public static void display() {
		// func/method implementation
		System.out.println("Displaying..");
	}

	// no return with param
	public static void add(int a, int b) {
		System.out.println("Result  = " + (a + b));
	}
	
	//with return with param
	public static int add2(int a, int b) {
		int r = a+b;
		return r;
	}
	// with return no param
	public static float getPIvalue() {
		return 3.14f;
	}
}
	
