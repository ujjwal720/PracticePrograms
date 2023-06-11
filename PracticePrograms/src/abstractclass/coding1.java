package abstractclass;

public class coding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 5, 1, 4, 3, 2, 7, 8 };
		int sum = 0;
		int index1 = 0;
		int index2 = 0;

		/*
		 * Numbers which lie between 4 and 7 sum
		 */

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] == 4) {

				index1 = i;

			}

			if (a[i] == 7) {

				index2 = i;
			}

			if (index2 != 0 && index1 != 0) {
				int x = index2 - index1;

				if (x > 0) {

					for (int j = index1; j <= index2; j++) {

						sum = sum + a[j];
						

					}
					
					index1=0;
					index2=0;
					
					break;

				}

			}
			
			else {
				
				System.out.println("Nothing lies between the four and seven");
			}

		}

		System.out.println(sum);

	}

}
