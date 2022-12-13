package Arrays;
import java.util.Scanner;

import utils.HelperClass;



public class MatrixAddition {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		Matrix m = new Matrix(3);
		System.out.println("Matrix Add:-");
		m.setMatrix1();
		m.setMatrix2();
		m.showResult(m.getM1());
		System.out.println("+");
		m.showResult(m.getM2());
		System.out.println("=");
		m.showResult(m.add());
	}
}

class Matrix {
	int mArr1[][] = null;
	int mArr2[][] = null;
	int size;

	Matrix(int size) {
		this.size = size;
		mArr1 = new int[size][size];
		mArr2 = new int[size][size];
	}

	public int[][] getM1() {
		return mArr1;
	}

	public int[][] getM2() {
		return mArr2;
	}

	public void setMatrix1() {
		System.out.println("Enter matrix one values");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				
				mArr1[i][j] = HelperClass.getScanner().nextInt();
			}
		}
	}

	public void setMatrix2() {
		System.out.println("Enter matrix two values");

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				
				mArr2[i][j] =HelperClass.getScanner().nextInt();
			}
		}
	}

	public int[][] add() {
		int mArr3[][] = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				mArr3[i][j] = mArr1[i][j] + mArr2[i][j];
			}
		}
		return mArr3;
	}

	public void showResult(int arr[][]) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				
				System.out.print(arr[i][j] + " ");

//				if (i == j) {
//					System.out.print("* ");
//				} else {
//					System.out.print(arr[i][j] + " ");
//				}
			}
			System.out.println();
		}
	}

}