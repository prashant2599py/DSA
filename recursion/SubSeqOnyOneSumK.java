package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeqOnyOneSumK {

	private static boolean solve(int[] nums, List<Integer> output, int index, int sum, int targetSum) {
		if(index == nums.length) {
			if(sum == targetSum) {
				System.out.println(output);
				return true;
			}
			else return false;
		}
		output.add(nums[index]);
		
		//Take
		if(solve(nums, output, index+1, sum + nums[index], targetSum) == true) return true;
		
		//Not Take
		output.remove(output.size()-1);
		if(solve(nums,output, index+1, sum, targetSum) == true) return true;
		
		return false;
		
	
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,1};
		
		List<Integer> output = new ArrayList<>();
		int targetSum = 2;
		solve(arr, output, 0, 0, targetSum);
	}

}
