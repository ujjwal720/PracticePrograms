package abstractclass;

import java.util.ArrayList;
import java.util.List;

public class sumlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> myList = new ArrayList<List<Integer>>();
		int[] a = { 1, 2, 3, 4, 5 };

	

		for (int i = 0; i <= a.length - 1; i++) {
			List<Integer> u = new ArrayList<Integer>();

			for (int j = i; j <= a.length - 1; j++) {
				
				u.add(a[j]);

			}
			
			myList.add(u);
		
			

		}
		
	        System.out.println(myList);

	}

}
