package Shailesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ytr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = "codeleet";
		List<Integer> l = Arrays.asList(4,5,6,7,0,2,1,3);
		List<Character> u = new ArrayList<Character>();
		String result1 = "";

		for (int i = 0; i <= l.size() - 1; i++) {
			
			char t=result.charAt(l.get(i));
			

			result1 = result1 + result.charAt(l.get(i));
			
		

		}
		
		System.out.println(result1);
		
		

	
		/*
		 * codeleet
		 * 01234567
		 */

	}

}
