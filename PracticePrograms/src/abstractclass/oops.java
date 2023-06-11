package abstractclass;

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a a=new a();
		a.method1("A");

	}

}


class a{
	
	
	public void method1(StringBuilder r) {
		System.out.println(r+"builder");
	}
	public void method1(String r) {
		System.out.println(r);
	}
}