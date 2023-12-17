package Shailesh;

public class rtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * nearest multiple of 10
		 */

		int n = 29;
		int p = 29;
		int que = 29;
		int flag = 1;
		int o = 0;
		int l = 0;

		if (que % 10 != 0) {
			while (flag != 0) {

				n--;
				p++;

				if (n % 10 == 0) {

					o = n;
					break;

				}
				if (p % 10 == 0) {

					l = p;
					break;

				}

			}

			if (o == 0) {

				System.out.println(l);

			}

			if (l == 0) {

				System.out.println(o);

			}
		}

		else {
			
			System.out.println(que);

		}

	}

}
