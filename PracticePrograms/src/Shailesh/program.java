package Shailesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "1231";
		char[] l = s.toCharArray();
		char act = '1';
		List<Integer> m = new ArrayList<Integer>();
		List<Character> actm = new ArrayList<Character>();
		List<Integer> m_x = new ArrayList<Integer>();
		for (int i = 0; i <= l.length - 1; i++) {

			actm.add(l[i]);

		}

		for (int i = 0; i <= l.length - 1; i++) {

			if (l[i] == act) {

				m.add(i);

			}

		}

		for (int i = 0; i <= m.size() - 1; i++) {

			String result = "";

			List<Character> actmCopy = new ArrayList<Character>(actm);

			actmCopy.set(m.get(i), '?');

			for (int j = 0; j <= actm.size() - 1; j++) {

				if (actmCopy.get(j) != '?') {

					result = result + actmCopy.get(j);

				}

			}

		   int y=Integer.parseInt(result);
		   m_x.add(y);

		}
		
		Collections.sort(m_x);
		System.out.println(m_x.get(m_x.size()-1)+" "+"is greater");

	}

}
