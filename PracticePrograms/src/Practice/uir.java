package Practice;

public class uir {

	public static void main(String[] args) {
		// TODO Auto-generated method stubuir.
		
		boolean rm=uir.endswith("Hiabc", "abc");
		System.out.println(rm);

	}

	public static boolean endswith(String s, String m) {

		boolean flag = false;

		String r1 = s.toLowerCase();
		String r2 = s.toLowerCase();

		if (r1.endsWith(r2)) {
			
			flag=true;

		}
		
		if(r2.endsWith(r1)) {
			
			flag=true;
		}
		
		return flag;

	}

}
