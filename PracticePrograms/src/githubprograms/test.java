package githubprograms;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = test.FullName("Ujjwal Shrivastava");
		System.out.println(s);

	}

	public static String FullName(String s) {

		String[] j = s.split(" ");
		String result = "";

		for (int i = 0; i <= j.length - 1; i++) {

			String k = j[i];

			result = result + k.charAt(0);

		}

		return result;

	}

}
