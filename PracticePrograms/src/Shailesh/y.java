package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> hl = new ArrayList<Character>();
		hl.add('a');    // Index 0
		hl.add('b');    // Index 1
		hl.add('c');    // Index 2

		hl.add(2, 'x'); // Insert 'x' at index 1

		System.out.println(hl);  // Output: [a, x, b, c]
		
		StringBuilder po=new StringBuilder("pol");
		
	po.setCharAt(0, 'l');
	
	po.insert(0, 'm');
	
	
		


	}

}
