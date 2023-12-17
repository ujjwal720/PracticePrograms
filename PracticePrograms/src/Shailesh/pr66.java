package Shailesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pr66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "is2 sentence4 This1 a3";
		List<Integer> l = new ArrayList<Integer>();

		List<String> resm = new ArrayList<String>();
		List<String> resm1 = new ArrayList<String>();
		String[] plus = s.split(" ");
		String result = "";
		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isDigit(s.charAt(i))) {

				String res = Character.toString(s.charAt(i));

				int res1 = Integer.parseInt(res);

				l.add(res1);

			}

		}

		for (int i = 0; i <= plus.length - 1; i++) {

			resm.add(plus[i]);

		}

		List<Integer> m = new ArrayList<Integer>(l);

		Collections.sort(l);

		for (int i = 0; i <= plus.length - 1; i++) {

			for (int j = 0; j <= plus.length - 1; j++) {

				if (l.get(i) == m.get(j)) {

					resm1.add(resm.get(j));
					break;

				}

			}

		}

		for (int i = 0; i <= plus.length - 1; i++) {
			
			result=result+resm1.get(i)+" ";

		}
		
		System.out.println(result);

	}

}
