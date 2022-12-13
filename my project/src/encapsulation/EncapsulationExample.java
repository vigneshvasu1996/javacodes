package encapsulation;

import java.io.File;
import java.net.HttpURLConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Vector;

import basics.PrimeNumber;


public class EncapsulationExample {

	public static void main(String[] args) {
		String strin;
		Scanner scan;
		String d;
		Connection c;
		ArrayList<String> ar;
		Vector<String> v;
		LinkedHashMap<Integer, String> lk;
		File f;
		HttpURLConnection e;
		
		PrimeNumber p=new PrimeNumber();
		
		Student s=new Student();
		
		
		/* 
		 *             same      same      outside           outside
		 *             class     package    package(sub)    package(non sub)  
 		 * private       Y         N         N                 N
 		 * Default       Y         Y         N                 N
		 * protected     Y         Y         N (Y)             N
		 * public        Y         Y         Y                 Y
		 *  
		 * 
		 */
	}
}
class Student extends Object{
	
}
class SeniorStudent extends Student {
	
}
