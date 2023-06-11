package Shailesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class peogram15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "helllo";

		List<Character> u = new ArrayList<Character>();

		for (int i = 0; i <= s.length() - 1; i++) {

			u.add(s.charAt(i));

		}

		Set<Character> io = new HashSet<Character>(u);

		if (io.size() == u.size()) {

			System.out.println("No duplicate characters");

		}

		else {

			System.out.println("We have duplicate characters");

		}

	}

}
