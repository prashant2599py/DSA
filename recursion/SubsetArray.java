package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetArray {
	
	public static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
		
		//base case
		if(index >= nums.length) {
			ans.add(new ArrayList<>(output));
			return;
		}
		
		//recursive call
		//Not take
		solve(nums, output, index+1, ans);
		
		//Take
		int element = nums[index];
		output.add(element);
		solve(nums, output, index+1, ans);
		
		//BackTrack by removing the last addedd element
		output.remove(output.size()-1);
	}
	
	public static List<List<Integer>> subset(int nums[]){
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> output = new ArrayList<>();
		solve(nums,output, 0, ans);
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		List<List<Integer> >arr1 = subset(arr);
		System.out.println(arr1);
	}

}
