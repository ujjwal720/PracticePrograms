package Shailesh;

public class PO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * / Reverse indivitual Character
		 */

		/*
		 * Compare versions of string
		 */

		String s = "Hello World";
		String result = "";
		String[] actual = s.split(" ");

		for (int i = 0; i <= actual.length - 1; i++) {
			
			String l = actual[i];
			StringBuilder i_p = new StringBuilder(l);

			if (i != actual.length - 1) {

				
				result = result + i_p.reverse().toString() + " ";

			}

			if (i == actual.length - 1) {
				
				result = result + i_p.reverse().toString();

			}

		}
		
		System.out.println(result);

	}

}
