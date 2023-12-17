package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * in order
		 */

		rew.inorder("123");
	}

	public static void inorder(String s) {
		String l = "";
		String m = "";
		String[] jk = s.split("");
		List<String> lop = Arrays.asList(jk);
		for (String i : lop) {

			l = l + i;

		}
		List<String> res = new ArrayList<String>(lop);
		Collections.sort(res);
		for (String i : res) {

			m = m + i;

		}

		if (l.equals(m)) {

			System.out.println("The following is in order");

		}

		else {
			
			
			System.out.println("The following not in order");

		}

	}

}
