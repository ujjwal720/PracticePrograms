package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class gff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * print pascal taringle
		 */
		
		int rows=5;
		int col=5;
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> m = new ArrayList<Integer>();

		for (int i = 1; i <= rows; i++) {

			int count = 0;
			int sum = 0;

		

			for (int j = 1; j <= col; j++) {

				if (i == 1 && j == 1) {

					System.out.print(1);

				}

				if (i == 2 && (j == 1 || j == 2)) {
					m.add(1);

					System.out.print(1);

				}

				if (i > 2) {

					if (j == 1) {
						
						m.add(1);

						System.out.print(1);

					}
					if (j == i) {
						
						m.add(1);

						System.out.print(1);

					}

					if (j < i && j != 1 && j!=i) {

						try {

							for (int k = 0; k <= l.size() - 1; k++) {

								sum = l.get(count) + l.get(count + 1);
								System.out.print(sum);
								m.add(sum);
								sum = 0;
								count++;
								break;

							}
						} catch (Exception e) {

						}

					}

				}

				else {

					System.out.print("");

				}

			}
			
			
			 l = new ArrayList<Integer>(m);
			 m = new ArrayList<Integer>();
			System.out.println();

		}

	}

}
