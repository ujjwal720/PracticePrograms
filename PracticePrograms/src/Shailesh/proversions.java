package Shailesh;

public class proversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String version1 = "12.0.1";
		String version2 = "12.0.2";
		String[] m = version1.split("\\.");
		String[] n = version2.split("\\.");
		String result = "";
		if (m.length == n.length) {
			for (int i = 0; i <= m.length - 1; i++) {

				if (m[i] != n[i]) {

					if (Integer.parseInt(m[i]) > Integer.parseInt(n[i])) {

						result = version1;

					}

					else {

						result = version2;

					}

				}

			}

			System.out.println(result);

		}

		else {
			
			System.out.println("Since length is not equal so the version cannot be compared");

		}

	}

}
