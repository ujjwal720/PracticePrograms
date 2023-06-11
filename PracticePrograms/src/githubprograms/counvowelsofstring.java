package githubprograms;

public class counvowelsofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k = "boat";
		String l = k.toLowerCase();
		int count=0;
		for (int i = 0; i <= l.length() - 1; i++) {
			
		if(l.charAt(i)=='a'||l.charAt(i)=='e'||l.charAt(i)=='i'||l.charAt(i)=='o'||l.charAt(i)=='u') {
			
			count++;
		}
		
	
			
		

		}
	int y=k.length()-count;
		
		System.out.println("No of contsnats in string are"+" "+y);

	}

}
