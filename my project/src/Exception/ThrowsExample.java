package Exception;

public class ThrowsExample {

	public static void main(String[] args) {

		Person p = new Person("Sathish", 12);
		Application a = new Application();
		a.applyAadhar(p);
		try {
			a.applyVoterID(p);
			a.doVote();

		} catch (AgeUnderLimitException e1) {
			System.err.println("Errorr in applying voter id");
		}

	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}
}

class Application {

	public void applyAadhar(Person p) {
		System.out.println("Applying aadhar for " + p.name);
	}

	public void applyVoterID(Person p) throws AgeUnderLimitException {
		if (p.age <= 17) {
			throw new AgeUnderLimitException();
		}
		System.out.println("Applying for voter id for " + p.name);
		// 50 + lines ...

		System.out.println("voter id process done..");
	}

	public void doVote() {
		System.out.println("Voting success..");
	}

}

class AgeUnderLimitException extends Exception {

	public AgeUnderLimitException() {
		// TODO Auto-generated constructor stub
		super("Age is under limit (18)");
	}
}
