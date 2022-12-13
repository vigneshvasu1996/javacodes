package loops;

public class RecursiveFunction 
{
     static int count;
	public static void main(String[] args)
	{
	show();
	
	}
		
    public static void show() 
    {    
    	display();
    	System.out.println("Hello");
                   
	}
	 public static void display()
	 {
		 System.out.println("hi");
		 if (count<=5) {
			 count++;
			 display();
		 }
			 
	 }
	
}
