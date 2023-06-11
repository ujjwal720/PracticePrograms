package Shailesh;

public class peogram90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n = 10; // the value of N
	        int count = 0;
	        int num = 1;
	        while (count < n) {
	            int sum = 0;
	            int power = 0;
	            while (sum < num) {
	                sum += Math.pow(7, power);
	                power++;
	                if (sum == num) {
	                    count++;
	                    break;
	                }
	            }
	            num++;
	        }
	        System.out.println("The " + n + "th faithful number is " + (num-1));
	    }
		

	}
	
	
	  




