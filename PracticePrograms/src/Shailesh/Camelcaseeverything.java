package Shailesh;

public class Camelcaseeverything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d = "";
		String s = "hello is the day";
		String[] k = s.split(" ");
		for (int i = 0; i <= k.length - 1; i++) {

			char[] p = k[i].toCharArray();

			for (int j = 0; j <= p.length - 1; j++) {
				char o = Character.toUpperCase(p[j]);
				d = d + o;
			}

		}
		
		System.out.println(d);

	}

}
