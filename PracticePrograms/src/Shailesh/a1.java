package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * series up problems
		 */
		
		a1 a=new a1();
		a.takesum(5);

	}

	public void takesum(int a) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= i; j++) {

				result.add(j);

			}
			
			

		}
		
		System.out.println(result);

	}

}
