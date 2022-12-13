package polymorphism;

public class PolymorphismOverriding {
public static void main(String[] args) {
		
		SSE s =new SSE();//object created for class SSE
		s.applyLeave();
		s.taskList();
		s.perks();
		
	}
}

class Employee {
	
	public void applyLeave() {
		
	}
}
class SE extends Employee {
	
	public void taskList() {
		System.out.println("Tasks:-");
		System.out.println("Coding");
		System.out.println("Unit testing");
	}
	public void perks() {
		System.out.println("Perks..");
		System.out.println("EL : 12 SL:8 CL:4");
		System.out.println("HI : 10L cover");
	}
}

class SSE extends SE {

	public void perks() {
		//super.perks();
		System.out.println("Phone bill allowance");
		System.out.println("Petrol allowance");
		System.out.println("HL : 4L family floater cover");
	}
	public void taskList() {
		//super.taskList();
		System.out.println("Tasks:-");
		System.out.println("Code review");
		System.out.println("Demo to client");
		System.out.println("Critical issue fix");
	}
}
