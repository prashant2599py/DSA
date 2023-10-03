package recursion;

import java.util.ArrayList;
import java.util.List;

public class CountNoOfSubSeq {

	private static int solve(int[] nums, int index, int sum, int targetSum) {
		if(index == nums.length) {
			if(sum == targetSum) {

				return 1;
			}
			else return 0;
		}
		
		//Take
		int l = solve(nums, index+1, sum + nums[index], targetSum);;
		
		//Not Take
		int r = solve(nums, index+1, sum, targetSum);
		
		return l+r;
		
	
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,1};
		int targetSum = 2;
		System.out.println(solve(arr, 0, 0, targetSum));
	}
}
