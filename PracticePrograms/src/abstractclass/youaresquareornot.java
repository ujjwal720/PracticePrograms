package abstractclass;

public class youaresquareornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 3;
		int flag = 0;

		for (int i = 0; i <= x; i++) {

			int squ = i * i;

			if (squ == x) {

				flag = 1;

			}

			else if (squ > x) {

				break;
			}

		}

		if (flag == 0) {

			System.out.println("The numbe is not square number");
		}

		else {
			
			System.out.println("The numbe ris square number");

		}

	}

}
