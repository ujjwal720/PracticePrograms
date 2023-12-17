package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * right rotate by k times
		 */

		int[] array = { 1, 2, 3, 4, 5 };
		int k = 4;

		// Initialize an ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>();
		List<Integer> u = new ArrayList<Integer>();

		// Add each element from the array to the ArrayList
		for (int i : array) {
			arrayList.add(i);
		}

		for (int i = 1; i <= k; i++) {
			
			int fe=arrayList.get(0);
			int le=arrayList.get(arrayList.size()-1);
			arrayList.add(0, le);
			arrayList.remove(arrayList.size()-1);
			System.out.println(arrayList);
			
			

		}

	}

}
