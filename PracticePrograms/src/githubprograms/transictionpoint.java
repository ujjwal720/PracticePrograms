package githubprograms;

public class transictionpoint {
	int m = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 0, 0, 0, 0, 0, 0 };
		int n = 5;

		transictionpoint b=new transictionpoint();
		int l=b.transitionPoint(x, n);
		System.out.println(l);
		
		

	}

	public int transitionPoint(int arr[], int n) {
		int xc = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {

			if (xc != arr[i]) {

				m = i;
				

			}
			
			if(m!=-1) {
				
				break;
			}

		
			
			
			

		}
		
		return m;

	}

}
