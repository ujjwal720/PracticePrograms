package Shailesh;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 11 };
		int target = 10;

		for (int i = 0; i <= a.length - 1; i++) {
			
			if(a[i]>target) {
				
				System.out.println("Nearest to the"+" "+target+" "+a[i]);
				break;
			}

		}

	}

}
