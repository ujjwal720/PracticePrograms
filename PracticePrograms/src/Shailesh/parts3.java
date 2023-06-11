package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class parts3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<String>();
		String s = "abc";
		int count = 0;
		String result2="";
		if (s.length() % 3 == 0) {

			String re_s = "";

			for (int i = 0; i <= s.length() - 1; i++) {

				count++;

				re_s = re_s + s.charAt(i);

				if (count % 3 == 0) {

					res.add(re_s);
					re_s = "";

				}

			}

		

			for (int j = 0; j <= res.size() - 1; j++) {
				
				char firstChar = res.get(j).charAt(0);
	            String restOfString = res.get(j).substring(1);
	            String result=restOfString+firstChar;
	            result2=result2+result;
	            

			}
			
			System.out.println(result2);

		}

	}

}
