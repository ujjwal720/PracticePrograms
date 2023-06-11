package Shailesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = new ArrayList<Integer>();
		int num = 9669;
		String result = Integer.toString(num);
		int len = result.length();
		
		int count = 0;

		for (int i = 1; i <= len; i++) {
			
			String res2 = "";

			char[] o = result.toCharArray();

			for (int j = 0; j <= o.length - 1; j++) {

				if (o[count] == '9') {

					o[count] = '6';

				} else {

					o[count] = '9';

				}
				
				break;

				

			}

			for (int k = 0; k <= o.length - 1; k++) {

				res2 = res2 + o[k];

			}

			int resu8 = Integer.parseInt(res2);
			a.add(resu8);

			if (count < len) {

				count++;
			}

		}
		
		
		Collections.sort(a);
		
		System.out.println(a.get(a.size()-1));
		
		

	}

}
