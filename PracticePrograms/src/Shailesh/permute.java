package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class permute {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());

		for (int k = 0; k < nums.length; k++) {
			int num = nums[k];
			List<List<Integer>> newResult = new ArrayList<>();

			for (int i = 0; i < result.size(); i++) {
				List<Integer> perm = result.get(i);
				for (int j = 0; j <= perm.size(); j++) {
					List<Integer> newPerm = new ArrayList<>(perm);
					newPerm.add(j, num);
					newResult.add(newPerm);
				}
			}

			result = newResult;
		}

		for (int i = 0; i < result.size(); i++) {
			List<Integer> permutation = result.get(i);
			System.out.println(permutation);
		}

	}
}
