package abstractclass;

import java.io.FileNotFoundException;

public class exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class takes{
	
	public void given()  {
		System.out.println("Hello this is exception");
	}
	
}

class w extends takes{
	
	@Override
	public void given() throws FileNotFoundException {
		System.out.println("Hello this is exception");
	}
}
