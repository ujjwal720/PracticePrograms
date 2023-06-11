package Shailesh;

public class pro12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean r_s=	pro12.gHappy("yyygggxyy");
	System.out.println(r_s);

	}

	public static boolean gHappy(String s) {
        boolean x;
		int count = 0;
		int count1 = 0;

		char[] k_l = s.toCharArray();

		for (int i = 0; i <= s.length() - 1; i++) {

			

			if (k_l[i] == 'g') {
				count++;
				count1++;

				if (k_l[i] == k_l[i + 1] || k_l[i]==k_l[i-1]) {

					count++;

					

				}

				else {

					

					break;

				}

			}

		}

		if (count1 + count1 == count) {

			x=true;

		}

		else {
			
			x=false;

		}
		
		return x;

	}

}
