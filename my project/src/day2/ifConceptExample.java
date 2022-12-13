package day2;

import java.util.Scanner;

public class ifConceptExample {

	public static void main(String[] args) {
//int age;
int b=100;
int a=200;
int c;
		Scanner s= new Scanner(System.in);
System.out.println("Enter the value: ");
/*age=s.nextInt();
//int age = 14;
int vote = 18;
if(vote<=age) {
	System.out.println("Eligible for Voting");
}
else
	{
	System.out.println("Your age is under 18 - not eligible");
	}*/
c=s.nextInt();
if(c>a) {
	System.out.println("First class");
}
else if(c>=b){
	System.out.println("Second class");
}
else {
	System.out.println("Fail");

	}

	}
}
