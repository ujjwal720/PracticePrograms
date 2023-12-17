package Shailesh;

public class qw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		qw a = new qw();
		int x_m = a.ui(1, 2, 2);
		System.out.println(x_m);

	}

	public int ui(int a, int b, int c) {

		int sum = 0;

		if (a != b && c != b && a != c && b != c) {

			sum = a + b + c;

		}

		if (a == c) {

			sum = b;

		}

		if (a == b) {

			sum = c;

		}

		if (b == c) {

			sum = a;

		}

		if (a == b && b == c && a == c) {
			
			sum=0;

		}
		
		return sum;

	}

}
