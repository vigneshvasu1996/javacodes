package WayToCreateMethods;

public class calculation {
	int x=10;
	int y=20;
	
	/*void sum() // case 1:Not taking any parameters and also not return values
	{
		System.out.println(x+y);
	}*/
	
	
	
    /* int sum()  //case2:Not taking any parameters but return values
    {
    	return(x+y);
    }*/
	
	
/*	void sum(int a,int b) //case3:Taking parameters but not return values
	{
		System.out.println(a+b);
	}*/
	
	int sum(int a,int b)  //case4;Taking parameters and also return values
	{
		return(a+b);
	}
	
    

	public static void main(String[] args)
	{
        calculation cal=new calculation();
        
       // cal.sum();//case1:
        
      /*  int result=cal.sum();     //case2: 
        System.out.println(result);    ------------ both type are same
        System.out.println(cal.sum());  ----------- both type are same*/
        
        //cal.sum(100,200); //case3:
        
        System.out.println(cal.sum(100,200));
         
        
	}

}
