package abstractclass;

public class starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 5;
		int col = 5;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i>=j) {

					System.out.print("*");
				}
				else {
					
					System.out.print("");
				}

			}
			
			System.out.println();
		}

	}

}
