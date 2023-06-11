package githubprograms;

public class splitbyxyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean c = splitbyxyz.ismiddle("abcxyzab");
		System.out.println(c);

	}

	public static boolean ismiddle(String s) {
		String[] o = s.split("xyz");

		if (o[0].length() == o[1].length()) {

			return true;
		} else {

			return false;
		}
	}

}
