package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Aman ur fired                  dont come here";

		String[] k = s.split(" ");
		
		

		List<String> words = new ArrayList<String>();

		for (int i = 0; i <= k.length - 1; i++) {

			if (!k[i].equals("")) {
				
				words.add(k[i]);

			}

		}
		
		
		System.out.println("Count of words is"+" "+words.size());

	}

}
