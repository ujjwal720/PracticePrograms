package githubprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class passingthe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number in an array");
		Scanner kl = new Scanner(System.in);
		List<Integer> stuids = new ArrayList<Integer>();
		for (int i = 0; i <= 4; i++) {

			stuids.add(kl.nextInt());
		}
		System.out.println("Enter the number in an array for choclates");
		Scanner klm = new Scanner(System.in);
		List<Integer> choclates = new ArrayList<Integer>();
		for (int j = 0; j <= 4; j++) {
			

			choclates.add(klm.nextInt());
		}

		int rewardchildid = 30;
		int rewardcholcates = 2;

		for (int k = 0; k <= stuids.size() - 1; k++) {

			if (stuids.get(k) == rewardchildid) {
				
				int h=choclates.get(k);
				
				int z=h+rewardcholcates;

				choclates.set(k, z);
				
				break;

			}

		}
		
		
		System.out.println(choclates);

	}

}
