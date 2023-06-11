package Practice;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ujjwal";
		String[] f = s.split("");
		String n = "";

		for (int i = 0; i <= f.length - 1; i++) {
			for (int j = i; j <= f.length - 1; j++) {
				for (int k = i; k <= j; k++) {
					n = n + f[k];
					
					
				}
				System.out.println(n);
				n="";
			}

		}

	}

}
