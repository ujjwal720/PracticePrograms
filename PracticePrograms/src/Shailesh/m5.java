package Shailesh;

public class m5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcomejava25,uyt89,98";
		int sum = 0;
		char[] rss = s.toCharArray();

		String l = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isDigit(s.charAt(i))) {

				l = l + s.charAt(i);

			}

			else {
				try {

					int m = Integer.parseInt(l);

					sum = sum + m;
					l = "";
				} catch (Exception e) {

				}

			}

		}

		try {
			int o = Integer.parseInt(l);
			sum = sum + o;
		}

		catch (Exception e) {

		}

		System.out.println(sum);

	}

}
