package abstractclass;

public class findthenumberandindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5 };
		int target = 2;

		for (int i = 0; i <= a.length - 1; i++) {
			
			if(a[i]==target) {
				
				System.out.println(i);
			}

		}

	}

}
