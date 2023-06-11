package Shailesh;

public class printlastwtothree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		String result = "";
		String result1 = "";

		for (int i = s.length() - 1; i >= s.length() - 2; i--) {

			result = result + s.charAt(i);
		}

		StringBuilder r = new StringBuilder(result);
		result1=r.reverse().toString();
		System.out.println(result1+result1+result1);

	}

}
