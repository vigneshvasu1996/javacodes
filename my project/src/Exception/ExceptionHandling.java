package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 9;
		int j = 4;
		int arr[] = { 5, 2, 4 };
		String name = "";
		System.out.println(Thread.currentThread().getName());
		try {
			int k = i / j;
			System.out.println(k);
			System.out.println(arr[1]);
			name = "";
			if (name != null) {
				System.out.println(name.length());
			}
			
		} catch (ArithmeticException e) {
			System.out.println("Math error went wrong..");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index error");
		} finally {
			System.out.println("Always executes..");
		}
		
	    
		System.out.println(name.length());
		System.out.println("another line ...");
	}
	
}

