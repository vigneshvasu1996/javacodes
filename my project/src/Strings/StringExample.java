package Strings;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		
		String name ="Rajesh"; // literals
		name="Sathish";
		String name2 = "Rajesh";
		String nameObj = new String("rajesh"); // object
		String nameObj2 =new String("Rajesh");
		
		System.out.println(name==name2);
		
		System.out.println(name2.equalsIgnoreCase(nameObj));
		
		System.out.println("Length "+name.length());
		System.out.println("Index of "+name.indexOf('S'));
		System.out.println("char at "+name.charAt(0));
	
	    System.out.println("Startwith "+name.startsWith("S"));
	    System.out.println("endswith "+name.endsWith("sh"));
	    System.out.println("Contains "+name.contains("sh"));
	
	    System.out.println(name.toUpperCase());
	    System.out.println(name.toLowerCase());
	    
	    char arr[] = name.toLowerCase().toCharArray();
	    System.out.println(Arrays.toString(arr));
	    int count=0;
	    for(char c: arr) {
	    	if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u') {
	    		count++;
	    	}
	    }
	    System.out.println("No of vowels : "+count);
	    String message="Hi world How are you all";
	    
	    String words[] = message.split(" ");
	    for(String word : words) {
	    	System.out.println(word);
	    }
	    
	    System.out.println(message.substring(9));
	    System.out.println(message.substring(0,9));
	    
	    System.out.println(message.toLowerCase().replace("hi","Hello"));
	    // A..Z a..z 0..9 
	    String email ="senthil14@gmail.com";
	    System.out.println(email.replaceAll("[a-z@]","*"));
	}
}
