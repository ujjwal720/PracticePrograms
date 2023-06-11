package githubprograms;

import java.util.Scanner;

public class ampicablenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers");
		Scanner x = new Scanner(System.in);
		int[] a = new int[2];
		int[] l = new int[2];
		for (int i = 0; i <= a.length - 1; i++) {

			int d = x.nextInt();
			a[i] = d;
		}

		for (int j = 0; j <= a.length - 1; j++) {

			int sum = 0;
			int z = a[j];

			for (int k = 1; k <= z; k++) {
				if (z % k == 0) {

					sum = sum + k;

				}

			}

			l[j] = sum;

		}

		if (l[0] == l[1]) {

			System.out.println("The following is an ampicable numbers");

		}

		else {
			
			System.out.println("the number is not amplicable");

		}

	}

}
