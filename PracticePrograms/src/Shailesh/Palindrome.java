package Shailesh;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 123;
		String s = Integer.toString(x);
		StringBuilder z = new StringBuilder(s);
		if (z.reverse().toString().equals(s)) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The numbe is not palindrome");
		}

	}

}
