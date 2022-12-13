package utils;

import java.util.Scanner;

public class HelperClass {

	public static Scanner getScanner() {
		return new Scanner(System.in);
	}

	public float calculateEmi(float loanAmt, int tenure) {
		return (loanAmt * getInteresetRate(loanAmt)) / tenure;
	}

	private float getInteresetRate(float loanAmt) {

		if (loanAmt < 100000) {
			return 7.0f;
		} else if (loanAmt < 500000) {
			return 8.0f;
		} else {
			return 10.0f;
		}
	}

}
