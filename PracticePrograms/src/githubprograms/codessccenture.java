package githubprograms;

public class codessccenture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A apple a day keeps the doctor away";
		char target1 = 'a';
		int count = 0;
		char target = Character.toLowerCase(target1);
		String target2 = Character.toString(target);
		String[] arrays = s.split(" ");
		int count1 = 0;
		int ft = 1;
		for (int i = 0; i <= arrays.length - 1; i++) {

			String k = arrays[i];

			for (int j = 0; j <= k.length() - 1; j++) {

				if (target2.equalsIgnoreCase(Character.toString(k.charAt(0)))) {

					ft = 1;

					count1++;

					count = count + 2;
					break;

				}

				else {

					ft = 0;

					break;
				}

			}

			if (ft == 0) {

				break;
			}

		}
		
		
System.out.println(count);
		if (count1 == 3) {
			System.out.println("You got a score");
		} else {
			System.out.println("No score");
		}

	}

}
