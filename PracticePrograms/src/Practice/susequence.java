package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class susequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = { 1, 2};
		List<Integer> b = Arrays.asList(a);
		int fact = 1;
		for (int i = a.length; i >= 1; i--) {
			fact = fact * i;
		}
		
		int i = 0;
		while (i <= fact - 1) {
			List<Integer> y=new ArrayList<Integer>(b);
			List<Integer> x=new ArrayList<Integer>();
			
			for (int j = b.size(); j >= 1; j--) {
				
				int m = i % j;
				x.add(y.get(m));
				y.remove(m);
				

			}
			i++;
			System.out.println(x);
			
		
		
		

	}

}
	
}
