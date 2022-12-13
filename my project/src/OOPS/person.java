package OOPS;

public class person {
	int enumber;
	String role;
	String dob;
	long salary;
	String department;
	
	void display() {
		System.out.println(enumber);
		System.out.println(role);
		System.out.println(dob);
		System.out.println(salary);
	    System.out.println(department);
	}
	void bonus() {
		System.out.println("bonus"+2000);
	}
	public static void main (String[]args) {
		person emp1=new person();
		emp1.enumber=123;
		emp1.role="engineer";
		emp1.dob="12/12/1212";
		emp1.salary=25000;
		emp1.department="department:" + "tester";
		emp1.display();
		emp1.bonus();
		System.out.println("---------next employee--------");
		person emp2=new person();
		emp2.enumber=321;
		emp2.role="engineer";
		emp2.dob="31/12/1313";
		emp2.salary=35000;
		emp2.department="developer";
		emp2.display();
		emp2.bonus();
	}

}
