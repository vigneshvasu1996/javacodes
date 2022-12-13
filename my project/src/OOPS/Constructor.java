package OOPS;

public class Constructor {
	
	public static void display(int a,int b) {
		System.out.println(a+b);
		
	}
	

	public static void main(String[] args) {
		Constructor obj=new Constructor();
		display(40,20);
		obj.addition(10,50);
		
		//return type method
         int c=obj.sub(12,10);
         int viky=obj.sub(100,50);
         int f=obj.multiple(3, 8);
        System.out.println(f);
        System.out.println(viky);

	}
	void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	//return type method
	int sub(int a,int b)
{
	 int c=a-b;
	return(c);
	
}
	int multiple(int a, int b)
	{
		int d=a*b;
		return(d);
	}
}
