package Shailesh;

public class brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 34, 5, 6, 7, 9, 11, 22, 2, 2, 23, 43 };
		int digit = 2;
		int count = 0;
		String result = Integer.toString(digit);
		for (int i = 0; i <= a.length - 1; i++) {

			String l = Integer.toString(a[i]);

			String[] m = l.split("");

			for (int j = 0; j <= m.length - 1; j++) {

				if (m[j].equals(result)) {

					count++;

				}

			}

		}

		System.out.println(count);

	}

}
