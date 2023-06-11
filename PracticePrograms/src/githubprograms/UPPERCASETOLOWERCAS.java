package githubprograms;

public class UPPERCASETOLOWERCAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Aman";
		String o = "";
		char[] k = s.toCharArray();
		for (int i = 0; i <= k.length - 1; i++) {
			int p;
			char y;
			int x = k[i];
			if (x >= 65 && x <= 90) {
				p = x + 32;
				y = (char) p;
				o = o + y;

			}

			else {
				p = x - 32;
				y = (char) p;
				o = o + y;

			}

		}

		System.out.println(o);

	}

}
