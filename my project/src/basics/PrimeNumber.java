package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number");
		Scanner Myscanner= new Scanner(System.in);
	    int num=Myscanner.nextInt();
	  
		boolean isPrimeNumber = true;
		for(int i=2;i<num;i++) {
		    if(num%i == 0) {
		       isPrimeNumber = false;
		       break;
		    }
		}
	
		if(isPrimeNumber) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a prime number");
		}
	}
}