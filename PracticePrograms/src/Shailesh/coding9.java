package Shailesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class coding9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Decepriting of message using leetcode and lets solve it
		 */

		String s = "eljuxhpwnyrdgtqkviszcfmabo";
		List<Character> all = new ArrayList<Character>();
		List<String> a_z = new ArrayList<String>();
		String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
		String[] i_p = message.split(" ");
		String str = "abcdefghijklmnopqrstuvwxyz";
		String finalz="";

		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) != ' ') {

				all.add(s.charAt(i));

			}

		}

		Set<Character> o = new LinkedHashSet<Character>(all);
		List<Character> alls = new ArrayList<Character>(o);

		for (int j = 0; j <= i_p.length - 1; j++) {

			String result = "";
			String result1 = i_p[j];

			for (int k = 0; k <= result1.length() - 1; k++) {

				for (int l = 0; l <= alls.size() - 1; l++) {

					if (result1.charAt(k) == alls.get(l)) {

						char t = result1.charAt(k);
					
						result = result + str.charAt(l);
						
						break;
					}

				}

				

			}
			a_z.add(result);

		}
		
	   for(int i=0;i<=a_z.size()-1;i++) {
		   
		   finalz=finalz+a_z.get(i)+" ";
		   
		   
	   }
	   
	   System.out.println(finalz);

	}

}
