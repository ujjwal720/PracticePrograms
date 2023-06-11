package githubprograms;

public class occuranceofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "BABCDBABODBABDFBAB";
		s = s.replace("BA", "?");
		int count = 0;
		String[] h = s.split("");
		for (int i = 0; i <= h.length - 1; i++) {
			if (h[i].equals("?")) {
				count++;
			}
		}

		System.out.println(count);
		
		

	}

}
