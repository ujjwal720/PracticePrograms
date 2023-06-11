package abstractclass;

import java.lang.reflect.Field;

public class bv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		io a = new io();
		a.getClass().getDeclaredFields();
		System.out.println(a.getClass());
		System.out.println(a);
		Class b = a.getClass();
		Field[] u = b.getFields();

		for (int i = 0; i <= u.length - 1; i++) {
			System.out.println(u.toString());
		}
	}

}

class io {

	public int a = 10;

	public void ms() {

		System.out.println("Hello");
	}
}