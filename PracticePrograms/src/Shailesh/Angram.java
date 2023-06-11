package Shailesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Angram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "LISTEN";
		String d = "SILENT";
		String[] a = s.split("");
		String[] b = d.split("");
		if (d.length() == s.length()) {
			int count = 0;
			Arrays.sort(a);
			Arrays.sort(b);
			for (int i = 0; i <= d.length() - 1; i++) {
				if (a[i].equals(b[i])) {
					count++;
				}
			}
			if (a.length == count) {
				System.out.println("This word is the angram");
			}
			else {
				System.out.println("The number is not angram");
			}
		} 
		else {
			System.out.println("The numbe is not angram");
		}

	}

}
