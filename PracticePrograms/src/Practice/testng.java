package Practice;

public class testng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Pepecoding algo is this  */
		String s = "abc";
		int a = s.length();
		int fact = 1;
		for (int i = s.length(); i >= 1; i--) {
			fact = fact * i;
		}
		int i = 0;
		while (i <= fact - 1) {
			String l = "";
			StringBuilder n = new StringBuilder(s);
			for (int j = s.length(); j >= 1; j--) {
				int m = i % j;
				l = l + n.charAt(m);
				n.deleteCharAt(m);
				

			}
			i++;
			System.out.println(l);
		}

	}

}
