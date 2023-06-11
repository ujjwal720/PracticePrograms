package Shailesh;

public class twodimenisonalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] y = { { 1, 2, 3 }, { 1, 2 } };

		

		for (int i = 0; i <= y.length - 1; i++) {

			for (int j = 0; j <= y[i].length - 1; j++) {
				
				System.out.print(y[i][j]);

			}
			System.out.println();

		}

	}

}
