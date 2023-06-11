package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class programspractice784 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calculate the total intrest in the number of the array no intrest upto 2000
		 */

		List<Integer> x = new ArrayList<Integer>();
		int[] a = { 2000, 4000, 8000, 9000 };
		double m=2000.0;
	double sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			
			if(a[i]!=2000.0) {
				
				double l=(double)20/100;
				double o=l*a[i];
				sum=sum+o;
			}
       

		}
		
		System.out.println(sum);

	}

}
