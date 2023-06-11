package githubprograms;

import java.util.Scanner;

public class raiseprogramtothepower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the age");
		Scanner x = new Scanner(System.in);
		int z = x.nextInt();
		if (z < 0) {

			System.out.println("Sorry this number is not allowed");

		} else {

			int y = z * z * z;
			System.out.println("The age of the following is " + " " + y);
		}

	}

}
