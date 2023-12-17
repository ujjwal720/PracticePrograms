package Shailesh;

import abstractclass.l;

public class trigg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a_m = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String lm = "GFG";
		String[] gh = lm.split("");
		int count = 0;

		for (int i = 0; i <= gh.length - 1; i++) {

			String o1 = gh[i].toLowerCase();

			for (int j = 0; j <= a_m.length - 1; j++) {

				String[] um = a_m[j].split("");

				for (int k = 0; k <= um.length - 1; k++) {

					if (um[k].equals(o1)) {
						
						count++;
						break;

					}

				}

			}

		}
		
		System.out.println(count);

	}

}
