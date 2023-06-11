package githubprograms;

import java.util.ArrayList;
import java.util.List;

public class insertelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> stuids = new ArrayList<Integer>();
		stuids.add(10);
		stuids.add(20);
		stuids.add(30);
		
	System.out.println(stuids);
	
	stuids.set(0, 1+2);
	
	System.out.println(stuids);
		

	}

}
