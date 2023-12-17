package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class brackets1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()()))";
		List<String> l = new ArrayList<String>();
		for (int i = 0; i <= s.length() - 1; i++) {
         if(s.charAt(i)=='(' || s.charAt(i)==')') {
			String resultString = Character.toString(s.charAt(i));
			l.add(resultString);
			
			/*'
			 * Print Bracket Number
			 */
			
         }

		}

		int count = 0;
		int count1 = 0;

		for (int i = 0; i <= l.size() - 1; i++) {
			
			if(count1==0) {
				
				count1=count;
			}

			if (l.get(i).equals("(")) {

				count++;
				count1++;
				System.out.println(count);

			} else {
				
			
				System.out.println(count1);
				count1--;

			}

		}

	}

}
