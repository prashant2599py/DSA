package dP;

import java.util.*;

public class FrogJump {
//	static int f(int ind, int arr[], int dp[]) {
//		if(ind == 0) return 0;
//		if(dp[ind] != -1) return dp[ind];
//		int left = f(ind-1, arr, dp) + Math.abs(arr[ind] - arr[ind-1]);
//		int right = Integer.MAX_VALUE;
//		if(ind > 1) right = f(ind-2, arr, dp) + Math.abs(arr[ind] - arr[ind-2]);
//		
//		return dp[ind] = Math.min(left, right);
//	}
	
	
	public static void main(String[] args) {
		int arr[] = {30, 10, 60, 10, 60, 50};
		int n = arr.length;
		
		int prev = 0;
		int prev2 = 0;
		for(int ind = 1; ind < n; ind++) {
			int left = prev + Math.abs(arr[ind] - arr[ind-1]);
			int right = Integer.MAX_VALUE;
			if(ind > 1) right = prev2 + Math.abs(arr[ind] - arr[ind-2]);
			int curr = Math.min(left, right);
			prev2 = prev;
			prev = curr;
			
			
		}
		int mini = prev;
		System.out.println(mini);
	}

}
