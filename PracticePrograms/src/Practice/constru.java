package Practice;

public class constru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		d a=new d();
		c b=a.m1();
		System.out.println(b);
		

	}

}


class d{

	//emp is method name
	public c m1() {
		
		
		System.out.println("Goo day");
		return new c();
		
		//returning a object so that we can do chaining of all the things.
	}
	
	
	
}


class c{
	
}

class g{
	
}
