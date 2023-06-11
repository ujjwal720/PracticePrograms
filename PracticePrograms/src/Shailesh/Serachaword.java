package Shailesh;

public class Serachaword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="I like the word India";
		String t="India";
		String[] d=s.split(" ");
		for(int i=0;i<=d.length-1;i++) {
		if(d[i].equalsIgnoreCase(t)) {
			System.out.println("The target word is here in the sentence");
			break;
		}
		
		}

	}

}
