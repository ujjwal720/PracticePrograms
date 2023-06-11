package Shailesh;

public class javafirstprogramsquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Lucky number
		 */

		int x = 1234;
		
		int sum=0;

		if (x >= 1000 && x <= 9999) {

			String j = Integer.toString(x);

			for (int i = 0; i <= j.length() - 1; i++) {
				
			   String lm=Character.toString(j.charAt(i));
			   
			   int m=Integer.parseInt(lm);
			   
			   sum=sum+m;

			}
			
		   if(sum%7==0) {
			   
			   System.out.println("It is an lucky number");
		   }
		   
		   else {
			   
			   System.out.println("It is not an lucku number");
		   }

		}
		
		else {
			
			System.out.println("The length not within 4 digits");
		}

	}

}
