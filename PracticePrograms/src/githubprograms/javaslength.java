package githubprograms;

import java.util.Scanner;

public class javaslength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String");
		Scanner x = new Scanner(System.in);
		String d = x.next();
		System.out.println("Enter the Number");
		int a = x.nextInt();
		int b = x.nextInt();
		int u = b - a;
		if (d.length() % u == 0) {
			
			System.out.println("Same");

		}
		
		else {
			
			System.out.println("Not Same");
		}

	}

}
