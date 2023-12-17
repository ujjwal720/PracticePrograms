package Shailesh;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *
		 * Numbe of small bars to use to reach to the goal
		 */

		int result = p1.makeChoclate(4, 1, 9);
		System.out.println(result);

	}

	public static int makeChoclate(int small, int big, int goal) {

		int sum = 0;

		int n = 0;

		sum = sum + 5 * big;

		if (sum == goal) {

			n = -1;

		}

		else {

			while (true) {

				for (int i = 1; i <= small; i++) {

					sum = sum + 1;

				}

				if (sum == goal) {

					n = small;
					break;

				} else {

					n = -1;
					break;

				}

			}

		}
		return n;

	}

}
