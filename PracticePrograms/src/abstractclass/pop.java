package abstractclass;

public abstract class pop {
	int a = 100;
	static int b = 100;
	private int xc=10;
	final int y=90;

	public abstract void start();

	public pop() {
		System.out.println("This is an abstract class constructor");
	}

	{
		System.out.println("This is an instance class");
	}

	static {
		System.out.println("This is an static class");
	}
	
	public void start(int b) {
		System.out.println("This is an abstract construct 2");
	}

	public int getXc() {
		return xc;
	}

	public void setXc(int xc) {
		this.xc = xc;
	}
	
	public void yu() {
		System.out.println(super.getClass().getSimpleName());
	}
	
	
}