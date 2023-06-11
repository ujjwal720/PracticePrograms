package Shailesh;

public class pru865 {
	
	static String result = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * get first two chars form string
		 * for the following questing of the coding bat
		 */
		
		pru865.firsttwo("Aman");

	}

	public static void firsttwo(String s) {



		int count = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			if (count==2) {

				break;

			}

			else {
				
				result=result+s.charAt(count);
				count++;
				

			}

		}
		
		System.out.println(result);

	}

}
