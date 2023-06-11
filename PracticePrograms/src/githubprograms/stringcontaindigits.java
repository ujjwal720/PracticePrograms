package githubprograms;

public class stringcontaindigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s = "abc123";
		char[] d = s.toCharArray();
		int flag=0;

		for (int i = 0; i <= s.length() - 1; i++) {
			
			if(Character.isDigit(d[i])) {
				flag=1;
			}

		}
		
		if(flag==0) {
			System.out.println("The string do not contain digits");
		}
		
		else {
			System.out.println("The string contain digits");
		}

	}

}
