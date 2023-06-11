package Shailesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class perfectnumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * print the biggest string iftwo string length is same the print first one
		 */

		String s = "India is a good country Deforestation AAAAAAAAAAAAA";

		String[] arr1 = s.split(" ");
		List<String> x = new ArrayList<String>();
		List<Integer> v = new ArrayList<Integer>();
		List<Integer> z = new ArrayList<Integer>();

		for (int i = 0; i <= arr1.length - 1; i++) {

			x.add(arr1[i]);
			String j = arr1[i];
			v.add(j.length());

		}

		for (int i = 0; i <= v.size() - 1; i++) {

			z.add(v.get(i));

		}

		Collections.sort(z);

		for (int i = 0; i <= v.size() - 1; i++) {

			if (z.get(z.size()-1) == v.get(i)) {

				System.out.println(x.get(i) +" "+"is the biggest string");
				break;

			}
		}

	}

}
