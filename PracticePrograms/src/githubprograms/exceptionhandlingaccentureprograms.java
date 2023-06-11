package githubprograms;

import java.util.Scanner;

public class exceptionhandlingaccentureprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Total Photo frames");
		Scanner c = new Scanner(System.in);
		int z = c.nextInt();
		System.out.println("Enter the numbe rof frame");
		int p = c.nextInt();
		try {

			int d = z / p;
			if (d < 0) {

				System.out.println("The input is wrong in the frame or total number");

			} else {

				System.out.println("The cost of each frame is " + " " + d);
			}
		}

		catch (Exception e) {

			System.out.println("The following has an Exception");

		}

	}

}
