package day2;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		/*int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/ 
		
		int a[][]= { {100,200},{300,400},{500,600}};
		
		System.out.println("number of rows:"+a.length);
		System.out.println("number of column:"+a[0].length);
		
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++) 
			{
				System.out.println(a[i][j]);
				}
		}*/
		 //enchanced for loop
		for(int r[]:a)
		{
			for(int i:r) 
			{
				System.out.println(i);
			}
		}
	}

}
