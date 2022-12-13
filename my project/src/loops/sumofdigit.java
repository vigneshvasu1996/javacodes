package loops;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter a Number: ");
int number= sc.nextInt();
int sum=0;
int i=number;
while(i!=0)
{
	int L=i%10;
	sum+=L;
	i/=10;
}
System.out.printf("Sum of digits value is:"+sum);
sc.close();
}
	}

