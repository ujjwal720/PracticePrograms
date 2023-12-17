package Shailesh;

public class oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		uit a = new opl();

	}

}

class uit {

	public uit() {

		System.out.println("Parent constructor");

	}

	public uit(String s) {

		System.out.println("Parent constructor 9");

	}

	private int a = 0;

	public void msk(int a) {

		this.a = a;

		System.out.println("This is an msk");

	}

	public void getname() {

		msk(1);
		System.out.println(a);

	}

}

class opl extends uit {

	public opl() {

		System.out.println("This is child 1");

	}

}
