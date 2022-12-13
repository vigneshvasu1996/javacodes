package encapsulation2;

import utils.HelperClass;

public class College {

	public void displayStudent() {
		Student s = new Student();
		System.out.println(s.id);
		System.out.println(s.name);
		//System.out.println(s.age);
		System.out.println(s.mark);
		new HelperClass().getScanner().nextInt();
		float emi = new HelperClass().calculateEmi(50000, 12);
	}
}
