package Practice;

public class recursion {
       int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		recursion a=new recursion();
		a.ks();
		
		
		
		
		
	}
	
	public void ks() {
		
	  while(i!=6) {
		  if(i<=5) {
			  i++;
			  System.out.println("Ujjwal");
			  
		  }
		  
		  else {
			  break;
		  }
		 
		  }
	  
	  this.ks();
	  
	  

	  
	  
		
		
		
	}

}


