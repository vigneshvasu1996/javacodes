package day2;

public class StringMethods 
{
	public static void main(String[] args) 
	{  
		String s= "Welcome";
		String s1="T0 Java";
		
		System.out.println(s.length());//length of String
		System.out.println(s.concat(s1));//combining of Strings
		s="   Welcome   ";
		System.out.println(s);
		System.out.println(s.trim());//It removes space before and after character but not in middle like"to_java"
        s="Welcome";
		System.out.println(s.charAt(5)); //m
		System.out.println(s.contains("Wel"));//returns true or false
		System.out.println(s.equals("welcome"));//false
		System.out.println(s.equalsIgnoreCase("welcome"));//true
		s="Welcome To Java";
		System.out.println(s.replace('a','i'));
		System.out.println(s.replace("Java","Selenium"));
		s="welcome";
		System.out.println(s.substring(0,4));
		s="WELCOME";
		System.out.println(s.toLowerCase());
		s="welcome";
		System.out.println(s.toUpperCase());
	}

}
