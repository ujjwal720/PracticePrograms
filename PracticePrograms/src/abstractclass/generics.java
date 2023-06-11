package abstractclass;

public class generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		t<String> a=new t<String>();
		
		 a.a="Ujjwal";
		 
		 a.getmethod();

	}

}


class t<T>{
	
	public  T a;
	
	public void getmethod() {
		
		System.out.println(a + "This a is coming from the generic method");
	}
	
	
}