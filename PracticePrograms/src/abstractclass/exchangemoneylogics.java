package abstractclass;

public class exchangemoneylogics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount = 20;
		int count1 = 0;
		int count2 = 0;
		int[] am = { 5, 1 };

		while (amount != 0) {
			if (amount >= 5) {

				int b = amount-5;
				amount = b;
				count1++;
			}

			else {

				int c = amount - 1;
				amount = c;
				count2++;

			}

		}
		
	    System.out.println("The amount of 5 rs coin needed for above is"+" "+ count1);
	    System.out.println("The amount of 1 rs coin needed for above is"+" "+ count2);


	}

}
