package Shailesh;

public class coding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * countwords with given prefix
		 */

		String[] l = { "pay", "attention", "practice", "attend" };
		String prefix = "at";
		int count=0;
		for (int i = 0; i <= l.length - 1; i++) {

			String result = l[i];
			boolean a = result.contains(prefix);
			if (a == true) {
				
				count++;
			}

		}
		
		System.out.println("The count for given prefix is"+" "+count);

	}

}
