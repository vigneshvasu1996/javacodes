package abstraction;

public class example_abstraction {

	public static void main(String[] args) {
wanimal an=new wanimal();

an.cat();
an.dog();
an.tiger();
	}

}
abstract class animals
{
  abstract void cat();
  abstract void dog();
}

class wanimal extends animals
{
	 void cat()
	{
	System.out.println("cat is pet animal");	
	}
	void dog()
	{
  System.out.println("lion is wild animal");		
	}
	void tiger()
	{
	System.out.println("normal method");	
	}
}
