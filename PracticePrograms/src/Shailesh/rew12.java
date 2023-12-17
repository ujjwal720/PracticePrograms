package Shailesh;

public class rew12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * spider man web
		 */

		int[] a = { 2,2,3};
		int sum = 0;
		int x = 0;
		int actual = 0;

		for (int i = 0; i <= a.length - 1; i++) {

			try {

				if (i == 0) {

					sum = sum + 1;
					x = sum;

				}

				if (i != 0 && a[i] > a[i - 1]) {
					/*
					 * sum = sum + x; sum = sum + 1;
					 */

					actual = x;

					int actual1 = actual + 1;

					x = actual1;

					sum = sum + actual1;

				}

				if (i != 0 && a[i] <= a[i - 1]) {

					sum = sum + 1;
					x = sum;

				}

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

		System.out.println(sum);

	}

}
