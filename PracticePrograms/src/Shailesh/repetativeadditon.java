package Shailesh;

public class repetativeadditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 98;
		int sum = 0;

		while (x >= 9) {
			sum=0;

			String o = Integer.toString(x);
			String act[] = o.split("");

			for (int i = 0; i <= act.length - 1; i++) {

				sum = sum + Integer.parseInt(act[i]);

			}

			x = sum;
			

		}

		System.out.println(sum);

	}

}
