package abstractclass;

public class ty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vmware a = new vmware();
		String y = a.takes().op();
		System.out.println(y);
		System.out.println(a instanceof vmware);

	}

}

class vmware {

	public vmware takes() {

		return this;
	}

	public String op() {

		return "hello";
	}
}