package Shailesh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countunique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = { 1, 2, 3, 4, 3 };
		List<Integer> b = Arrays.asList(a);
		Set<Integer> io = new HashSet<Integer>(b);
		int sum = 0;
		for (int i : io) {

			sum = sum + i;
		}

		System.out.println(sum);

	}

}
