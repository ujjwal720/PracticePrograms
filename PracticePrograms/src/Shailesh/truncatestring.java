package Shailesh;

public class truncatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * trim the string based on ac_t
		 */

		String result = "Hello this is my india";
		int ac_t = 4;
		String resul = "";
		String[] i_o = result.split(" ");
		int len = i_o.length;
		if (ac_t <= len) {
			for (int i = 0; i <= ac_t - 1; i++) {
				
				resul=resul+i_o[i]+" ";

			}
			
		}

		else {
			
			System.out.println("Not possible to trim");

		}
		
		System.out.println(resul);

	}

}
