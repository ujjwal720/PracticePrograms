package Shailesh;

public class PR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * eoither of the string comes at ur end
		 * 
		 * 
		 */

		boolean s=PR.endOther("HOBBC", "BBC");
		System.out.println(s);

	}

	public static boolean endOther(String a, String b) {

		String result1 = "";
		String result2 = "";
		int count = 0;
		int count2 = 0;
		boolean flag;

		if (a.length() > b.length()) {

			result1 = b;
			count = a.length()-1;
			result2 = a;

		} else {
			result1 = a;
			count = b.length()-1;
			result2 = b;
		}

		StringBuilder op = new StringBuilder(result1);
		String result3 = op.reverse().toString();
		

		for (int i = 0; i <= result3.length() - 1; i++) {

			if (result2.charAt(count) == result3.charAt(i)) {

				count2++;

			}

		  count--;

		}

		if (count2 == result3.length()) {

			flag=true;

		}
		else {
			
			flag=false;
		}
		
		return flag;

	}

}
