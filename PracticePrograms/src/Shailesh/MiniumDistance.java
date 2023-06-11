package Shailesh;

public class MiniumDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] z = { "the", "fox", "quick", "brown" };
		String c = "the";
		String d = "fox";
		int a = 0;
		int b = 0;
		for (int i = 0; i <= z.length - 1; i++) {
			if (c.equals(z[i])) {
				a = i + 1;
			}
			if (d.equals(z[i])) {
				b = i + 1;
			}
		}
		if (a > b) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}

	}
}