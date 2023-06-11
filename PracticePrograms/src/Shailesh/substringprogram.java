package Shailesh;

public class substringprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * printed all substring in the strings
		 */

		String s = "abc";
		char[] resu = s.toCharArray();
		String result = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			for (int j = i; j <= s.length() - 1; j++) {

				 result = "";

				for (int k = i; k <= j; k++) {

					result = result + resu[k];

				}
				
				System.out.println(result);

			}
			
			

		}

	}

}
