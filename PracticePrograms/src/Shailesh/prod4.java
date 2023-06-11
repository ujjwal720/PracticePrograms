package Shailesh;

public class prod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int c=0;
		int flag = 0;
		int num = 1;
		int length =4 ;
		while (true) {

			String h = Integer.toString(num);
			String[] le2 = h.split("");

			if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {

			
				c=num;
				System.out.println(num);
				

			}

			if (le2.length > length) {
				break;

			}
			
			num++;

		}

	

	}

}
