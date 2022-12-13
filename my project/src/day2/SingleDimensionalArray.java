   package day2;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{
		//int a[]=new int[5];
		/*a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		int a[]= {100,200,300,400,500};
		System.out.println(a.length);//finding the size of array
		System.out.println(a[4]);//reading the specific value of array
		
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		//reading the value using enhanced For loop
		for(int i:a) // variable"i"assigned by us "a"is contains array value
		{
        System.out.println(i);
	} 
	}
}
