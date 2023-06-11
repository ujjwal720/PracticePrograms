package Shailesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tyu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Sentenceisanpangram
		 */

		String s = "thequickbrownfoxjumpsoverthelazydog";
		String[] i_p = s.split("");

		List<String> i = new ArrayList<String>();
		Collections.addAll(i, i_p);
		System.out.println(i);
		Set<String> p_o = new HashSet<String>(i);
		if (p_o.size() != 26) {

			System.out.println("The sentence is not pangram");

		}

		else {
			
			System.out.println("tHE SENTENCE IS PANGRAM");

		}

	}

}
