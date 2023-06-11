package Shailesh;

public class checkiftwostringequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Based on the first charcater
		 * by this we understand string are immutable in java
		 */

		String s = "AbCD";
		
		if (Character.isLowerCase(s.charAt(0))) {

		s=	s.toLowerCase();

		} else {
			
		s=	s.toUpperCase();

		}
		
		System.out.println(s);

	}

}
