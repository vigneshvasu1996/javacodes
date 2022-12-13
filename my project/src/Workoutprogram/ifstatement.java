package Workoutprogram;

import java.util.Scanner;

public class ifstatement {

	private Object system;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int pen=10;
int specialPen=15; 
int cost;
Scanner price=new Scanner(System.in);
System.out.println("Enter your amount..");
cost = price.nextInt();
if(cost>specialPen) {
	System.out.println("You buy a Specialpen...");
}
else if(cost>pen) {
	System.out.println("You buy a pen...");
}
else {
	System.out.println("You have more money");
}
	}

}