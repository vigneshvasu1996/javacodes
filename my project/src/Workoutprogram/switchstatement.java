package Workoutprogram;

import java.util.Scanner;

public class switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
Scanner userName= new Scanner(System.in);
System.out.println("Enter a Name:");
name = userName.nextLine();

switch(name)
{
case "Kishore" :
	System.out.println("Hello..." +name);
	break;
case "Logesh" :
	System.out.println("Hello..." +name);
	break;
	default:
		System.out.println("please check the correct data.." + name);
	}

	}
}

