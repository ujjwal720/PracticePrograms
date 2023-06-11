package abstractclass;

public class l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer.inner a=new outer().new inner();
		

	}

}

class outer {

	public outer() {
		System.out.println("This is an outer constructor");
		
		System.out.println(inner.x);
	}

	class inner {
		
		static int x=10;

		public inner() {
			System.out.println(x);
			System.out.println("This is an inner constructor");

		}
		
		public static void us() {
			System.out.println(x);
		}
	}
}