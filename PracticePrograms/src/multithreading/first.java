package multithreading;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread1 a=new thread1();
		a.start();
	
		thread2 b=new thread2();
		b.start();
	


	}

}


class thread1 extends Thread{
	
	
	public void run() {
	while(true) {
		
		System.out.println("Hello");
	}
		
	}
	
	
}


class thread2 extends Thread{
	
	
	public void run() {
	while(true) {
		
		System.out.println("Hello jk");
	}
		
	}
	
	
}