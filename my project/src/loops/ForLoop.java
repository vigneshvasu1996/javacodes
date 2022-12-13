package loops;
import java.util.Scanner;
public class ForLoop 
{
	/**
	 * @param arg	 */
	public static void main(String[] args)
	{
		//int num=8;
		int sum=0;
		System.out.println("enter the value");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) 
		{
System.out.print("(");
			for(int j=1;j<=i;j++) 
			{
			System.out.print(j);
			if(j!=i) {
				System.out.print("+");
			} 
			sum=sum+j;
			}
			
			System.out.print(")");
			if(i!=num) {
				System.out.print("+");
			}
			}
		
		System.out.print("="+sum);
		
}
}
