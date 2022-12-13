package Arrays;
import java.util.Arrays;

public class SortingExample {

	public static void main(String[] args) {

		int a[] = { 45, 12, 9, 34, 76, 11, 8, 23, 123 };

		System.out.println(Arrays.toString(a));
		System.out.println("After sort:-");
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					int t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int median;
		if (a.length % 2 == 0) {
			int mi = a.length / 2;
			median = (a[mi] + a[mi - 1]) / 2;
		} else {
			int mi = a.length / 2;
			median = a[mi];
		}
		System.out.println("Median = " + median);
	}


}
