package Shailesh;

public class STARCONTINUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;

		for (int i = 1; i <= x; i++) {

			for (int j = 1; j <= x; j++) {

				if (j == i) {

					System.out.print(i);

				}
				if (j < i) {

					System.out.print(i + "*");

				} else {

					System.out.print(" ");

				}

			}

			System.out.println();

		}

	}

}
