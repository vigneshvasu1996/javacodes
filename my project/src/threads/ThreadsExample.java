/*package threads;

public class ThreadsExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			Task t = new Task(i);
			t.start();
		}

		System.out.println(Thread.currentThread().getName() + " -> Welcome..");
	}
}

class Task extends Thread {

	int number;

	Task(int number) {
		this.number = number;
	}

	@Override
	  public void run() {

		// bg thread created..
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " -> " + number + " * " + i + " = " + (i * number));
		}
	}

}*/
