package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class rewrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * get the right most digit
		 */
		int[] arrs= {16, 8, 886, 8, 1};
		List<Integer> res=rewrt.rightmostdigit(arrs);
		System.out.println(res);
		

	}

	public static  List<Integer> rightmostdigit(int[] arrs) {

		List<Integer> right = new ArrayList<Integer>();

		for (int i = 0; i <= arrs.length - 1; i++) {

			String s = Integer.toString(arrs[i]);

			int l_m = Integer.parseInt(Character.toString(s.charAt(s.length()-1)));

			right.add(l_m);

		}
		
		return right;

	}

}
