package Shailesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prac12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		int allletters = 26;
		String all = "thequickbrownfoxjumpsoverthelazydog";
		String all3 = all.toLowerCase();
		List<String> pol = new ArrayList<String>();
		for (int i = 0; i <= all3.length()-1; i++) {

			String res = Character.toString(all3.charAt(i));
			if (!res.equals(" ")) {

				pol.add(res);

			}

		}

		Set<String> qa = new HashSet<String>(pol);
		List<String> polz = new ArrayList<String>(qa);
		
		if (polz.size() == allletters) {

			System.out.println("The following word is pangram");

		}

		else {

			System.out.println("The following word is not pangram");

		}

	}

}
