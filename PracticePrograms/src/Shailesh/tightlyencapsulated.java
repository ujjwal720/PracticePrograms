package Shailesh;

public class tightlyencapsulated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a a = new a(1);

	}

}

class a {

	int a = 10;
	
	private void trm() {
		
		System.out.println("This private");
		
	}

	public a(int a) {

	 
		System.out.println(a +"of int");
	}

	public a(String s) {
		
		System.out.println("This is for the string");

	}
	
	public a(StringBuffer b) {
		
		System.out.println(b);
	}
	
	public a(int ...b) {
		
		System.out.println(b);
	}
}

class b extends a {

	private int b = 12;
	
	protected void trm() {
		
		System.out.println("This private");
		
	}
}

class c extends b{
	
final void trm() {
		
		System.out.println("This private");
		
	}
	
	
}