package Shailesh;

public class DIVIDEnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1012;

		String[] y = Integer.toString(x).toString().split("");

		for (int i = 0; i <= y.length - 1; i++) {
			int p = Integer.parseInt(y[i]);
			if (x % p == 0) {
				System.out.println("The divisor are" + " " + p);
			}
		}

	}

}
