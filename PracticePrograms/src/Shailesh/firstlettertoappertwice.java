package Shailesh;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class firstlettertoappertwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String let = "abccbaacz";

		List<Character> u = new ArrayList<Character>();
		for (int i = 0; i < +let.length() - 1; i++) {

			u.add(let.charAt(i));

		}

		Set<Character> ab = new LinkedHashSet(u);
		List<Character> ub = new ArrayList<Character>(ab);

		for (int j = 0; j <= ub.size() - 1; j++) {

			int count = 2;
			int count1 = 0;

			for (int k = 0; k <= u.size() - 1; k++) {

				if (ub.get(j) == u.get(k)) {

					count1++;

				}

			}

			if (count == count1) {
				
				System.out.println(ub.get(j)+" "+"This is the count of 2 of the character");
				break;

			}

		}

	}

}
