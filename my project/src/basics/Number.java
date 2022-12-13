package basics;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int sum=0;
for (int i=1; i<=a;i++) {
	
	
	System.out.print(i);
	if(i!=a)
	{
		System.out.print("+");
	}
	sum= sum+i;
System.out.print("=" +sum);
}
	}

}
