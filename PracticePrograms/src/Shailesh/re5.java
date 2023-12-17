package Shailesh;

public class re5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * prime nuber any whole number which can only e divide by 1 or itself
		 */

		int start = 2;
		int end = 1000;

		for (int i = start; i <= end; i++) {

			int flag = 0;

			int num = i;

			for (int j = 2; j <= num - 1; j++) {

				if (num % j == 0) {

					flag = 1;

					break;

				}
				

			}

			if (flag == 0) {
				
				System.out.println(i);

			}

		}

	}

}
