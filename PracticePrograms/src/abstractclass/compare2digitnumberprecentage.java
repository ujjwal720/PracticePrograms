package abstractclass;

public class compare2digitnumberprecentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 89;
		int m = 21;

		String c = Integer.toString(x);
		String d = Integer.toString(m);

		if (c.charAt(0) == d.charAt(1) && c.charAt(1) == d.charAt(0)) {

			System.out.print("Both character are equal");

		}

		else if (c.charAt(0) == d.charAt(1)) {

			System.out.println("Only one character is equal");

		}

		else if (c.charAt(1) == d.charAt(0)) {

			System.out.println("Only one character is equal");

		}

		else if (c.equals(d)) {

			System.out.print("Both character are equal are of equal string");

		}

		else {

			System.out.println("Tata nothing is same");
		}

	}

}
