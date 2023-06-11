package githubprograms;

import java.util.Scanner;

public class pronicnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Please enter the number to check");
		Scanner a = new Scanner(System.in);
		Integer b = a.nextInt();
		for (int i = 2; i <= b; i++) {

			int x = i * (i + 1);
			if (i==b) {

				System.out.println("Given is not pronic number");
				break;
			}

			if (x == b) {

				System.out.println("The following is a pronic number " + b + " = " + i + "*" + (i + 1));
				break;
			}

		}

	}

}
