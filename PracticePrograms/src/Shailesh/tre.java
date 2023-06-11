package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class tre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * selenium is open source find the middle number
		 */

		String s = "Ujjwa";
		char[] result = s.toCharArray();
		int re = s.length() / 2;
		List<Character> res1 = new ArrayList<Character>();
		for (int i = 0; i <= result.length - 1; i++) {

			res1.add(result[i]);

		}
		
		   res1.remove(re);
		   
		   System.out.println(res1);
		   
		   System.out.println("The following is an lucky number");

	}

}
