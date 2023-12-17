package Shailesh;

public class yt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ignore the numbers 6 to 7
		 */

		int[] l_m = {1,1,2};
		int index = -1;
		int index1 = -1;
		int sum = 0;

		for (int i = 0; i <= l_m.length - 1; i++) {

			if (l_m[i] == 6) {

				index = i;

			}

			if (l_m[i] == 7) {

				index1 = i;

			}

		}

		if (index1 >= index) {

			for (int i = 0; i <= l_m.length - 1; i++) {

				if (i >= index && i <= index1) {

				}

				else {
					
					
					sum=sum+l_m[i];

				}

			}
			
			System.out.println(sum);

		}

	}

}
