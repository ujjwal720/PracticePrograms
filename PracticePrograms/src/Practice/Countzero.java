package Practice;

public class Countzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 1, 1, 0, 0, 0, 2, 1, 1, 1, 0 };
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == 0) {
				count++;
			}
		}

		System.out.println(count);
	}

}
