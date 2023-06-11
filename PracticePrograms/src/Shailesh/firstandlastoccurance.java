package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class firstandlastoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		int b = 5;
		List<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == b) {

				c.add(i);
			}

		}
		
		System.out.println("the first occurance is in index"+" "+c.get(0)+"the last couurance in"+" "+c.get(c.size()-1));

	}

}
