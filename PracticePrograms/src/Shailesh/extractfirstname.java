package Shailesh;

public class extractfirstname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fullname = "Ujjwal Shrivastava";
		String firstname = "";
		for (int i = 0; i <= fullname.length() - 1; i++) {

			if (fullname.charAt(i) == ' ') {

				break;
			}

			firstname = firstname + fullname.charAt(i);

		}
		
		System.out.println(firstname + " "+"Thi is the extracted firstname");

	}

}
