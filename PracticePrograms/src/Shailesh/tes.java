package Shailesh;

public class tes {

	public static void main(String[] args) {
		
		int number = 49; // the number to check
	    int sum = 0;
	    int power = 0;
	    boolean isFaithful = true;
	    while (sum < number) {
	        int term = (int) Math.pow(7, power);
	        if (sum + term > number) {
	            isFaithful = false;
	            break;
	        }
	        sum += term;
	        power++;
	    }
	    if (isFaithful && sum == number) {
	        System.out.println(number + " is a faithful number.");
	    } else {
	        System.out.println(number + " is not a faithful number.");
	    }


	}
}


