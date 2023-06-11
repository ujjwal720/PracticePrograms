package Shailesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sortbytakingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> h = new ArrayList<Integer>();

		System.out.println("Enter the number in array");

		Scanner x = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {

			int t = x.nextInt();

			h.add(t);

		}
		
		System.out.println(h);
	}

}
