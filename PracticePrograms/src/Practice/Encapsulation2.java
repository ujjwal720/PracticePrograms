package Practice;

public class Encapsulation2 extends Encapsulation{

	public Encapsulation2(int a) {
		super(a);
		
	}

	@Override
	public void eight() {
		
		int x=getA();
		System.out.println(x);
		int y=x*10;
		System.out.println(y);
		
		
	}
	
	

}
