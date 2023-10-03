package dP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
	public static List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int hash[] = new int[n];
        Arrays.fill(hash, 1);

        for(int i = 0; i <= n-1; i++){

            hash[i] = i; // Initializing with current index
            for(int prev_ind = 0; prev_ind <= i-1; prev_ind++){
                if(nums[i] % nums[prev_ind] == 0 && 1 + dp[prev_ind] > dp[i]){
                    dp[i] = 1+dp[prev_ind];
                    hash[i] = prev_ind;

                }
            }
        }
        int ans = -1;
        int lastIndex = -1;
        for(int i = 0; i <= n-1; i++){
            if(dp[i] > ans){
                ans = dp[i];
                lastIndex = i;
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(nums[lastIndex]);
        //BackTrach in hash Array to get the LDS till the last
        while(hash[lastIndex] != lastIndex){
            lastIndex = hash[lastIndex];
            temp.add(nums[lastIndex]);
        }
        // Reverse the list
	        List<Integer> result = new ArrayList<>();
	        for (int i = temp.size() - 1; i >= 0; i--) {
	            result.add(temp.get(i));
	        }

	        return result;
        
    }
	

	    public static void main(String[] args) {
	        int[] arr = {1, 16, 7, 8, 4};

	        List<Integer> ans = largestDivisibleSubset(arr);

	        System.out.print("The longest divisible subset elements are: ");
	        for (int i : ans) {
	            System.out.print(i + " ");
	        }
	    }


}
