package Practice;

import java.util.HashMap;
import java.util.Map;

public class constructorchaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"u","j","j","w","a","l"};
		Map<String,Integer> x=new HashMap<String,Integer>();
		
		   for(int i=0;i<=s.length-1;i++) {
			if(x.containsKey(s[i])) {
				x.put(s[i], x.get(s[i])+1);
			}
			else {
				x.put(s[i],1);
			}
		   }
		   
		   
		   System.out.println(x);
		   Map<String,Integer> z=new HashMap<String,Integer>();
		   z.put("ujjwal", 1);
		   z.put("shrivastava", 2);
		   
		 
		  
		   

	}

}


