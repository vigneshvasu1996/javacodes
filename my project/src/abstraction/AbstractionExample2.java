package abstraction;

public class AbstractionExample2 {
	public static void main(String[] args) {
		iMessage.iAlert i=new C();
		i.showAlert();
		
		// nameless class
		iMessage.iAlert i2 = new iMessage.iAlert() {
			
			@Override
			public void showAlert() {
			
			}
		};
	}
}

interface iMessage {
	public void verbose();
	interface iAlert {
		public void showAlert();
	}
	interface iWarning {
		public void showWarning();
	}
}

interface I {
	public void alert();
}
interface I2 extends I{
	
}
abstract class A implements I{
	public void alert() {
		
	}
	public abstract void display();
}
abstract class B extends A  {
    public abstract void show();
}
class C extends B implements iMessage.iAlert{

	@Override
	public void show() {
		
	}

	@Override
	public void display() {		
	}

	@Override
	public void showAlert() {
		// TODO Auto-generated method stub
		
	}

	

}
