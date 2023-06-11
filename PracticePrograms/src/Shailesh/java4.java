package Shailesh;

public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first = 11;
		int last = 15;
		int target = 1;
		String t_g = Integer.toString(target);
		int count = 0;

		for (int i = first; i <= last; i++) {

			String k = Integer.toString(i);
			String l[] = k.split("");

			for (int j = 0; j <= l.length - 1; j++) {

				if (t_g.equals(l[j])) {

					count++;

				}

			}

		}
		System.out.println(count);
		

	}

}
