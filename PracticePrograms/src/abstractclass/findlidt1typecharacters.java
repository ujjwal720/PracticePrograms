package abstractclass;

public class findlidt1typecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] word_dict = { "THEIR:THEIR", "BUSINESS:BISINESS", "WINDOWS:WINDMILL", "WERE:WEAR", "SAMPLE:SAMPLE" };
		int count = 0;

		/*
		 * write how many coutn represent as an list1;
		 * 
		 */

	

		for (int i = 0; i <= word_dict.length - 1; i++) {

			String[] o = word_dict[i].split(":");

			if (o[0].length() == o[1].length()) {

				String k = o[0];
				String l = o[1];

				if (k.equals(l)) {
					
					count++;

				}

			}

		}
		
		System.out.println(count);

	}

}
