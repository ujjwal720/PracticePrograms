package githubprograms;

import java.util.Scanner;

public class pencilsbasedonstandared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the number");
		Scanner x = new Scanner(System.in);
		int z = x.nextInt();
		int sum = 0;
		for (int i = 1; i <= z; i++) {

			sum =sum+(i*i);

		}
		
		System.out.println("Nila gets"+" "+ sum+" "+"pencils");

	}

}
