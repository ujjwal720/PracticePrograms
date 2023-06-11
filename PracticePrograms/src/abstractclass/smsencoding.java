package abstractclass;

import java.util.ArrayList;
import java.util.List;

public class smsencoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The sun rises in the east".toLowerCase();
		String v = "";
		String[] p = s.split(" ");
		String constants = "";
		String m = "";
		List<String> k = new ArrayList<String>();

		for (int i = 0; i <= p.length - 1; i++) {

			String s_m = p[i];

			for (int j = 0; j <= s_m.length() - 1; j++) {
				if (s_m.charAt(j) == 'a' || s_m.charAt(j) == 'e' || s_m.charAt(j) == 'i' || s_m.charAt(j) == 'o'
						|| s_m.charAt(j) == 'u') {

					v = v + s_m.charAt(j);

				}

				else {

					constants = constants + s_m.charAt(j);

				}

			}

			m = constants + v;
			constants = "";
			v = "";
			k.add(m);
			m = "";

		}

		for (int l = 0; l <= k.size() - 1; l++) {

			System.out.print(k.get(l) + " ");
		}

	}

}
