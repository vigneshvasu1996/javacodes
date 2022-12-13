package abstraction;

public class FinalExample {
	public static void main(String[] args) {

		Employeee e = new Employeee();
		System.out.println(e.workHours);
	}
}

/*
 * final float PI = 3.14f;
 */
class Employeee {
	// this variable can't be changed..
	final int workHours = 8;

	//this method can't be override
	final public void agreeTermsAndPolicy() {

	}

	public void workDetails() {
		System.out.println("");
	}
}

class SeniorEmployee extends Employeee {
	@Override
	public void workDetails() {
		// TODO Auto-generated method stub
	}
}
// this class can't be extended..
final class Ceo extends Employeee {

	@Override
	public void workDetails() {
		System.out.println("Client ..");
	}

}
