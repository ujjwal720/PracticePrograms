package abstractclass;

public class tocountspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="My name                        is ujjwaal";
		
		 char[] o=      s.toCharArray();
		 
		 int count=0;
		 
		 for(int i=0;i<=o.length-1;i++) {
			 
			 if(o[i]==' ') {
				 
				 count++;
				 
			 }
			 
			 
		 }
		 
		 
		 System.out.println("This is the count of spaces"+ " "+ count);
		
		
		

	}

}
