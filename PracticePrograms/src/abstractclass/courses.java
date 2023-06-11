package abstractclass;

public class courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] x = { "hindi", "chemistry", "science" };
		String s = "hind";
		int count = 0;
		for (int i = 0; i <= x.length - 1; i++) {

			if (s.equalsIgnoreCase(x[i])) {

				count = 1;

				System.out.println("Traget string is there");
				break;
			}

			else {

			}

		}
		if (count == 0) {
			
			System.out.println("Target element is not there");

		}

	}

}
