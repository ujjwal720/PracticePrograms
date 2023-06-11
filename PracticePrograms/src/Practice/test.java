package Practice;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new test();
		new test();
		new test(1);
		
//static block are invoked only onece at the time of loading the class
	}
	
	{
		System.out.println("Hello this is instance block");
	}
	
	public test() {
		System.out.println("This is constructor");
	}
	
	public test(int a) {
		System.out.println("One argument constructor");
	}
	static {
		System.out.println("Thsi is an static block");
	}

}
