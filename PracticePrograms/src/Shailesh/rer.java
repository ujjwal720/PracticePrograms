package Shailesh;

public class rer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] l = { "hey","aeo","mu","ooo","artro"};
		int left = 1;
		int right = 4;
		int count = 0;

		for (int i = 0; i <= l.length - 1; i++) {

			String lk = l[i];

			for (int j = 0; j <= lk.length() - 1; j++) {

				if (j >= left && j <= right) {

					if (lk.charAt(j) == 'a' || lk.charAt(j) == 'e' || lk.charAt(j) == 'i' || lk.charAt(j) == 'o'
							|| lk.charAt(j) == 'u') {

						count++;
						break;

					}

				}

			}

		}

		System.out.println(count);

	}

}
