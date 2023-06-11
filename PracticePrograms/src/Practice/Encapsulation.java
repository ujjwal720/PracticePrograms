package Practice;

public abstract class Encapsulation {
     
	private int a;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public abstract void eight();
	
	
	
	//Constructor
	public Encapsulation(int a) {
		this.a=a;
		
	}
	

}


