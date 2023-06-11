package Shailesh;

public class RemovecharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h = "";
		String s = "computer";
		StringBuilder j = new StringBuilder(s);
		String k = "cat";
		
		for (int i = 0; i <= k.length() - 1; i++) {
			
		}

		String[] q = s.split("");

		for (int i = 0; i <= q.length - 1; i++) {
			if (!q[i].equals(",")) {
				h = h + q[i];
			}
		}

	}

}
