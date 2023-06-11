package abstractclass;

import java.util.ArrayList;
import java.util.List;

public class sumexceptpresenindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6 };
		

		List<Integer> x = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {
			

			int sum=0;

			for (int j = 0; j <= a.length - 1; j++) {

				if (i == j) {

				} else {
					
					int d=a[j]*a[j];
					
					sum=sum+d;

				}

			}
			x.add(sum);

		}
		
		System.out.println(x);

	}

}
