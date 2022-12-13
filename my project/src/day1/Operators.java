package day1;

public class Operators 
{

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		System.out.println("----Arithmetic Operators----");
		System.out.println(a+b);
	    System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
        System.out.println("----relational operators----");
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        
        boolean x=true;
        boolean y=false;
        System.out.println("----logical operators----");
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);
        System.out.println(!y);
        
        a++;
        b--;
        System.out.println("----increment/decrement operators----");
        System.out.println(a);
        System.out.println(b);
	}
	

}
