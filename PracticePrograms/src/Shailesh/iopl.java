package Shailesh;

public class iopl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 12345 23455 34555
		 */
       
		for (int i = 1; i <= 5; i++) {
			 int k=0;
			int count = i;

			for (int j = 1; j <= 5; j++) {
				
				

				if (count<5) {
					
					System.out.print(count);
					count++;
					k=j;

				}
				
				if(count==5 && k<j) {
					
					System.out.print(count);
				}
				
				

			}
			
			System.out.println();

		}

	}

}
