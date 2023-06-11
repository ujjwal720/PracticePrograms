package abstractclass;

import java.lang.reflect.Method;

public class reflectionapisexample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println(xc.class.getName());
		System.out.println(xc.class.getSimpleName());
		
		Class<?> c=Class.forName("xc");
		
		System.out.println(c.getSimpleName());
		
		Method[] x=c.getDeclaredMethods();
		
		for(int i=0;i<=x.length-1;i++) {
			
			System.out.println(x[i].getName());
		}
		
	}

}


 class xc{
	
	
	public void display() {
		
		
		
		System.out.println("Hello");
	}
}