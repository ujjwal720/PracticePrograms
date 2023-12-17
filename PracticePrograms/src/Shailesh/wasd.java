package Shailesh;

public class wasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * n copies
		 */
		
            String l=wasd.ms("Hi", 3);
            System.out.println(l);

	}

	public static String ms(String s, int l) {

		String result = "";

		for (int i = 1; i <= l; i++) {
			
			result=result+s;

		}
		
		return result;

	}

}
