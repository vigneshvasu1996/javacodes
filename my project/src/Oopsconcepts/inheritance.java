package Oopsconcepts;

public class inheritance {

	public static void main(String[] args) {

		Person p = new Person();
		p.name = "";
		p.dob = "";
		p.walk();
		p.applyForVoterID();

		System.out.println("\n.............Employee................\n");
		Employee e = new Employee();
		e.empID = 24342;
		e.name = "Santhosh";
		e.walk();
		e.applyForVoterID();
		e.doCoding();
		e.doPresentation();

		System.out.println("\n.................Senior Employee.............\n");
		SeniorEmployee se = new SeniorEmployee();
		se.empID = 34534;
		se.name = "Rajesh";
		se.attendDSM();
		se.applyLeave();
		se.doKTsession();
		se.doCoding();
		se.doCodeReview();
	}
}

class Person {
	String name;
	String dob;
	int age;
	String address;

	public void walk() {
		System.out.println("Walking..");
	}

	public void applyForVoterID() {
		System.out.println("apply for voter ID ");
	}
}

class Employee extends Person {
	int empID;
	String designation;
	float salary;
	String skillSet;

	public void applyLeave() {
		System.out.println("apply for leave");
	}

	public void doPresentation() {
		System.out.println("Show presentation..");
	}

	public void attendDSM() {
		System.out.println("Attend daily stand up meet");
	}

	public void doCoding() {
		System.out.println("Code and Debug");
	}

}

class SeniorEmployee extends Employee {

	public void doCodeReview() {
		System.out.println("Review codes and approval");
	}

	public void doKTsession() {
		System.out.println("Knowledge session ");
	}
}

class Student extends Person {
	public void writeExam() {
		System.out.println("Write Exam.");
	}

	public void applyLeave() {
		System.out.println("apply leave");
	}
}



