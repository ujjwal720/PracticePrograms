package Shailesh;

public class Absolutediffrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 13;
		String d=Integer.toString(x);
		String y = "";
		String[] z = Integer.toString(x).toString().split("");
        
		for (int i = 0; i <= z.length - 1; i++) {
			y = y + z[i];
			StringBuffer t = new StringBuffer(y);
			int c = Integer.parseInt(y);
			while (z.length != t.length()) {
				c++;
				t.append(c);

			}
			System.out.println(t);
			if (t.toString().equals(d)) {
                   System.out.println("The starting number is"+" "+y); 
                   break;
				
			}
			

		}

	}

}
