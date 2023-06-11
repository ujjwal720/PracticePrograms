package Shailesh;

public class programs6788 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * curtain of length 12;
		 */

		int count = 0;
		int sum = 0;
		int[] curtain = { 3, 42, 60, 6, 14 };
		int length = 12;
		for (int i = 0; i <= curtain.length - 1; i++) {

			int x = curtain[i] / length;
			sum = sum + x;

		}

		System.out.println("The total curatin in the following is" + " " + sum);

	}

}
