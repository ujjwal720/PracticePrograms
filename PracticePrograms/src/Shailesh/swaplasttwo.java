package Shailesh;

public class swaplasttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * swaplasttwo
		 * swap problems
		 */

		String l = "Coding";

		char u = l.charAt(l.length() - 1);
		char y = l.charAt(l.length() - 1 - 1);
		String result2 = "";
		result2 = result2 + y+u;
		StringBuilder rt = new StringBuilder(result2);
		String result1 = "";
		String result3 = rt.reverse().toString();
		for (int i = 0; i < l.length() - 1 - 1; i++) {
			
			result1=result1+l.charAt(i);

		}
		
		result1=result1+result3;
		System.out.println(result1);

	}

}
