package OOPS;

public class PersonMain {

	public static void main(String[] args) {

			person emp1=new person();
			emp1.enumber=100;
			emp1.role="engineer";
			emp1.dob="12/12/1212";
			emp1.salary=25000;
			emp1.department="department:" + "tester";
			emp1.display();
			emp1.bonus();
			System.out.println("---------next employee--------");
			person emp2=new person();
			emp2.enumber=200;
			emp2.role="engineer";
			emp2.dob="31/12/1313";
			emp2.salary=35000;
			emp2.department="developer";
			emp2.display();
			emp2.bonus();
		}

	

}
