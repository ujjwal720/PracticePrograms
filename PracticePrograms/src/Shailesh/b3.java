package Shailesh;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Remove b and ac
		 */

		String s = "aacb";
		s = s.replace('b', '?');
		s = s.replace("ac", "?");
		String result1 = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) == '?') {

			} else {
				
				result1=result1+s.charAt(i);

			}

		}

		System.out.println(result1);
	}

}
