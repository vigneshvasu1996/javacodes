package loops;

public class primefunc {
	public static void main(String[] agrs) {

		for (int a = 1; a <= 10; a++) {
			add(a);
		}
	}

	public static void add(int a) {
		// TODO Auto-generated method stub

		// System.out.println("Please enter number");

		int i;
		boolean isPrimeNumber = true;
		for (i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}

		if (isPrimeNumber) {
			System.out.println("Prime number : " + a);
		} else {
			System.out.println("Not a prime number: " + a);
		}

	}

}
