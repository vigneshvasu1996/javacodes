package threads;

public class taskinfo {

	public static void main(String[] args) {
		task T=new task();
		
		T.start();
		try {
			T.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		int a = 5/0;
		System.out.println("complete-");
			
		
	}

}
class task extends Thread 
{
	public void run()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("ashok rasuu");
	}
}
}