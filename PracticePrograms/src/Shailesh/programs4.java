package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class programs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Find first and last ocurance of the target
		 * elelemnt
		 */

		int[] a = { 1, 2, 3, 1, 1, 1, 1, 1, 1, 1 };
		List<Integer> index = new ArrayList<Integer>();
		int target = 1;

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] == target) {
				
				index.add(i);

			}

		}
		
		System.out.println("The first index is in at index"+" "+index.get(0)+" "+"The last index is at"+" "+index.get(index.size()-1));

	}

}
