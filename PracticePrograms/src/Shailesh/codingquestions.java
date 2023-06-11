package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class codingquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4 };
		List<Integer> u = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			int sum = 0;

			for (int j = i; j <= a.length - 1; j++) {

				sum = sum + a[j];

			}

			u.add(sum);

		}

		System.out.println(u);

	}

}
