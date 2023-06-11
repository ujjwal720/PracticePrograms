package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class makestringlucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Now make if the string is lu
		 */

		String s = "ABCDE";
		int i = s.length() % 2;
		String luc = "";
		if (i == 0) {
            luc=s;
			System.out.println("This string is an lucky string so no need to change"+" "+luc);

		}

		else {

			char[] result = s.toCharArray();

			List<Character> res1 = new ArrayList<Character>();
			for (int j = 0; j <= result.length - 1; j++) {

				res1.add(result[j]);

			}

			res1.remove(i);
			
			System.out.println(res1);

			for (int k = 0; k <= res1.size() - 1; k++) {
				
				luc=luc+res1.get(k);

			}
			
			System.out.println("Now the following is converted in lucky string"+" "+luc);

		}

	}

}
