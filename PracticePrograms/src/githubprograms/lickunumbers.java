package githubprograms;

import java.util.Scanner;

public class lickunumbers {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        System.out.println("Please Enter the Number");
		Scanner x = new Scanner(System.in);
		int sum = 0;

		try {

			int z =x.nextInt();
			String k = Integer.toString(z);
			if (k.length() == 4) {
				char[] m = k.toCharArray();

				for (int i = 0; i <= m.length - 1; i++) {

					int xc = Integer.parseInt(Character.toString(m[i]));

					sum = sum + xc;

				}

				if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {

					System.out.println("The folowing number is lucky number");

				}
				else {
					
					System.out.println("The number is not lucky number");
				}

			} else {

				System.out.println("The following entered input will not work");

			}

		} catch (Exception e) {

			throw new Exception("This input do not works it only need digits");

		}
	}

}
