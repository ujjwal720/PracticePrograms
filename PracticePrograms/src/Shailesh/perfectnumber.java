package Shailesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please write the number to check");
		Scanner a = new Scanner(System.in);
		int number = a.nextInt();
		List<Integer> p = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {

				p.add(i);

			}
		}

		for (int j = 0; j <= p.size() - 2; j++) {

			sum = sum + p.get(j);

		}

		if (sum == number) {

			System.out.println("The following is an perfect");

		} else {

			System.out.println("The numbe ris not an perfect number");

		}

	}

}
