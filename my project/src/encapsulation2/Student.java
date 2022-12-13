package encapsulation2;

public class Student {

	 int id =123;
	 public String name="Raj";
	 private int age = 23; // within class
	 protected int mark = 67;
	 
	 public void displayDetails() {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(age);
		 System.out.println(mark);
	 }
}
