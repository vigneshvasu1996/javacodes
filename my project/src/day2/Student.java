package day2;

import java.util.Scanner;

public class Student {
      int sid;
      String sname;
      int sub1;
      int sub2;
      int sub3;
		Scanner sc = new Scanner(System.in);
        Student std=new Student();
      
       void getStuData(int sid,String sname)
      {
    	   int id=sid;
    	   String sn=sname;
    	   System.out.println("Student details :..\n"+sid+" "+sname);
      }
       void getStudMarks()
       {
    	   System.out.println("Enter Student Marks:\n");;
    	   
    	float m1=sc.nextFloat();
   		float m2=sc.nextFloat();
   		float m3=sc.nextFloat();
   		System.out.println("First mark:"+m1);
   		System.out.println("Second mark:"+m2);
   		System.out.println("Third mark:"+m3);
       }
       void totalMarks()
       {
    	  
       }
	public static void main(String[] args) {
		Student stu=new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID");
		int sid =sc.nextInt();
		System.out.println("Enter Student Name");
		String sname=sc.next();
		/*stu.sub1=70;
		stu.sub2=60;
		stu.sub3=90;*/
		
		stu.getStuData(sid,sname);
		stu.getStudMarks();
		stu.totalMarks();
		
		

	}

}
