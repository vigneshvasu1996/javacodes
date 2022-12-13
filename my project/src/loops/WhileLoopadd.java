package loops;
import java.util.Scanner;
public class WhileLoopadd {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		while(a>0) {
			b=a%10;
			c=c+b;
			a=a/10;
		}
System.out.println("The addition of given number is...."+c);
	}

}
