package Shailesh;

public class aphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Numbers program
		 */

		int x = 153;
		int sum = 0;
		int count = 0;
		String l = Integer.toString(x);

		for (int i = 0; i <= l.length() - 1; i++) {
			count++;
			String k = Character.toString(l.charAt(i));
			int u = (int) Math.pow(Integer.parseInt(k), count);
			sum = sum + u;

		}

		if (sum == x) {

			System.out.println("The following is an disarium number");

		}

		else {
			
			System.out.println("The following is not an disarium number");

		}

	}

}
