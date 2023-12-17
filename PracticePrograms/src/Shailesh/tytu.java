package Shailesh;

public class tytu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * armstring number
		 */

		int x = 153;

		String s = Integer.toString(x);

		int sum = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			String l = Character.toString(s.charAt(i));

			int pop = Integer.parseInt(l);

			sum = sum + pop * pop * pop;

		}

		System.out.println(sum);

		if (sum == x) {

			System.out.println("The following is an armstrong umber");

		}

		else {
			
			System.out.println("The following is not an armstrong number");

		}

	}

}
