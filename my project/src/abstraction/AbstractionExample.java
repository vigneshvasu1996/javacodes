package abstraction;
import java.util.Scanner;

//import projectUtil.MyScanner;

/* abstraction-> abstract  -> 0- 100% abstraction
 *               interface -> 100% abstraction
                  
      abstract class and interface-> can't create objects           
                 
                 */


public class AbstractionExample  {
	// Driver class.
		public static void main(String[] args) {

			IAnimal a;
			System.out.println("1.Dog 2.Cat");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Dog---------------");
				a = new Dog();// binding..
			} else {
				System.out.println("Cat----------");
				a = new Cat(); // binding..
				// Cat c=(Cat) new Animal(); not possible
			}
			displayInfo(a);
		}

		public static void displayInfo(IAnimal a) {
			a.eat();
			System.out.println(a.getHeight());
			System.out.println(a.getLifeSpan());
			if (a instanceof Dog) {
				((Dog) a).bark(); // casting..
			}
			if (a instanceof Cat) {
				((Cat) a).jump();
			}
		}
	}

	interface IAnimal {
		String value="abc"; // final
		
		public void eat();
		public int getLifeSpan();
		public int getHeight();
	}
	interface ActionListener {
		public void walk();
		public void run();
	}
	abstract class Animal {

		String value = "ABC";
		public abstract void eat();

		public abstract int getLifeSpan();

		public abstract int getHeight();

		public void birth() { // normal/non-abstract

		}

		public void death() {

		}
	}

	class Dog implements IAnimal,ActionListener {
		public void eat() {
			System.out.println(value);
			System.out.println("Biscuits / bones");
		}

		public int getHeight() {
			return 20;
		}

		public void bark() {
			System.out.println("Barks..");
		}

		public int getLifeSpan() {
			return 12;
		}

		@Override
		public void walk() {
		}

		@Override
		public void run() {		
		}
	}

	class Cat implements IAnimal {
		public void eat() {
			System.out.println("Milk/fish,");
		}

		public int getLifeSpan() {
			return 8;
		}

		public int getHeight() {
			return 12;
		}

		public void jump() {
			System.out.println("Jump..");
		}
	}

	class Goat implements IAnimal {

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getLifeSpan() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getHeight() {
			// TODO Auto-generated method stub
			return 0;
		}
		

}
