package Shailesh;

public class program8765 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int z = 1234;

		String k = Integer.toString(z);

		String[] resu = k.split("");

		int sum = 0;

		for (int i = 0; i <= resu.length - 1; i++) {

			sum = sum + Integer.parseInt(resu[i]);

		}

		System.out.println(sum);

	}

}
