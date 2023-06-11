package githubprograms;

public class sumodigitsinscreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String y = "a2b4c6";
		char[] l = y.toCharArray();
		int sum = 0;
		for (int i = 0; i <= l.length - 1; i++) {

			if (Character.isDigit(l[i])) {
				String o = Character.toString(l[i]);
				int p = Integer.valueOf(o);
				sum = sum + p;
			}

		}

		System.out.println(sum);

	}

}
