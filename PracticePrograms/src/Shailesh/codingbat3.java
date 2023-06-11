package Shailesh;

public class codingbat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		codingbat3.catDog("catcat");

	}

	/*
	 * cat dog appers same numbe rof time
	 */
	


	public static boolean catDog(String s) {

		int count1 = 0;
		int count2 = 0;
		boolean flag=false;

		s = s.replace("cat", "?");

		s = s.replace("dog", "!");

		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) == '?') {

				count1++;

			}

			if (s.charAt(i) == '!') {

				count2++;

			}

		}

		if (count1 == count2) {

			flag=true;

		} else {
			
			flag=false;

		}
		
		return flag;

	}

}
