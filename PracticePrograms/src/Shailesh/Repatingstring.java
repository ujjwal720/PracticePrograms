package Shailesh;

public class Repatingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		int count = 0;
		int n = 9;
		StringBuffer r = new StringBuffer(s);
		for (int i = s.length() + 1; i <= n; i++) {
			r.append(r.charAt(count));
			count++;
			if (count == s.length()) {
				count = 0;
			}
		}
		System.out.println(r);
		String d = r.toString();
     

	}

}
