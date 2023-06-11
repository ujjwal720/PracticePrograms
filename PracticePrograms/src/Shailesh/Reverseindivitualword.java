package Shailesh;

public class Reverseindivitualword {
  int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String s="I love my country";
		String[] j=s.split(" ");
		for(int i=0;i<=j.length-1;i++) {
			String h=j[i];
			StringBuilder r=new StringBuilder(h);
			System.out.print(r.reverse().toString()+" ");
		}
		
		

	}
	
	

}
