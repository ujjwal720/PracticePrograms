package githubprograms;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "HARI";
		char[] p = s.toCharArray();
		String n = "";
		for (int i = 0; i <= p.length - 1; i++) {

			int j = p[i];
			int k = j + 1;
			char t = (char) k;
			n = n + t;

		}
		System.out.println(n);

	}

}
