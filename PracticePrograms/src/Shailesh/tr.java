package Shailesh;

public class tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ab-cd";
		String result = "";

		String[] i_o = s.split("-");

		for (int i = 0; i <= i_o.length - 1; i++) {

			StringBuilder t_y = new StringBuilder(i_o[i]);
			String p_p = t_y.reverse().toString();
			if (i == i_o.length - 1) {

				result = result + p_p;
				break;
			}
			result = result + p_p + "-";

		}
		
		System.out.println(result);

	}

}
