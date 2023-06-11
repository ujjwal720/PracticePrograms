package abstractclass;

public class formtraingleornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		formtraingleornot u=new formtraingleornot();
		 int x=u.formtaringle(3, 3, 5);
		 System.out.println(x);
		
	}

	public int formtaringle(int a, int b, int c) {

		int count = 0;

		if (a >= b + c) {

			count++;
		}

		if (b >= a + c) {
			count++;
		}

		if (c >= a + b) {
			count++;
		}
		
		return count;

	}

}
