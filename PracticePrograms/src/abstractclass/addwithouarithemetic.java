package abstractclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class addwithouarithemetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * by one character
		 */
		
		addwithouarithemetic b=new addwithouarithemetic();
		  b.Mispell("versed","versed");
	}

	public void Mispell(String s, String x) {
		
		if(s.length()==x.length()) {

		char[] k = s.toCharArray();
		char[] l = x.toCharArray();
		List<Character> c = new ArrayList<Character>();
		List<Character> d = new ArrayList<Character>();

		for (int i = 0; i <= k.length - 1; i++) {
			c.add(k[i]);
		}

		for (int j = 0; j <= k.length - 1; j++) {
			d.add(l[j]);
		}

		
		int count = 0;
		for (int m = 0; m <= c.size() - 1; m++) {
			if (c.get(m) != d.get(m)) {

				count++;
			}

		}

		if (count == 1 || count==0) {
			System.out.println("Only one character is mispleed");
		}

		else {
			
			System.out.println("Mpre than one character is mispleded");

		}

	}
		
		else {
			
			System.out.println("Not possible to anaylis this as length is not same");
		}
		
	}
	
	

}
