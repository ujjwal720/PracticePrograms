package githubprograms;

import java.util.ArrayList;
import java.util.List;

public class spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] j = { "ABC", "CBD", "DBA" };
		String h = "abc";

		for (int i = 0; i <= j.length - 1; i++) {

			int x = i + 1;

			String t1 = j[i];
			String t2 = j[x];
			if (t1.charAt(t1.length() - 1) == t2.charAt(0)) {
				System.out.println(t1+" "+t2);
			}

			if (x == j.length - 1) {
				break;
			}
		}

	}

}
