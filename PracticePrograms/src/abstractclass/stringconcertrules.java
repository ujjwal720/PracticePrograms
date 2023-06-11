package abstractclass;

public class stringconcertrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "COde";

		char[] k = s.toCharArray();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		String l = "";

		for (int i = 0; i <= k.length - 1; i++) {

			if (Character.isUpperCase(k[i])) {

				count1++;
			} else {
				count2++;
			}

		}

		if (count1 == count2) {

			l = s.toLowerCase();

		}

		if (count1 > count2) {

			l = s.toUpperCase();
		}

		if (count1 < count2) {
			l = s.toLowerCase();
		}

		System.out.println(l);

	}

}
