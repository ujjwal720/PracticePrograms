package Shailesh;

public class java712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Count numbe rof digits in string
		 */

		String s = "HA123UJ33312";

		char[] target = s.toCharArray();

		int count = 0;

		for (int i = 0; i <= target.length - 1; i++) {

			if (Character.isDigit(target[i])) {
				
				
				count++;

			}

		}
		
		System.out.println("This is the following count of digits"+" "+count);

	}

}
