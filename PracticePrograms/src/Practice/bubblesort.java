package Practice;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {4,6,5,1,1};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-1;j++) {
			if(max>a[j]) {
				
			}
			else {
			 max=a[j];
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			       
			}
				
				
			}
		}
		
		for(int k=0;k<=a.length-1;k++) {
			System.out.println(a[k]);
		}
		
		

	}

}
