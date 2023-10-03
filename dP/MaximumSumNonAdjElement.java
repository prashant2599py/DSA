package dP;

// import java.util.Arrays;
public class MaximumSumNonAdjElement {

//	static int f(int ind, int arr[], int dp[]) {
//		if(ind == 0) return arr[ind];
//		if(ind < 0) return 0;
//		if(dp[ind] != -1) return dp[ind];
//		int pick = arr[ind] + f(ind-2, arr, dp);
//		int notPick = 0 + f(ind-1, arr, dp);
//		return dp[ind] =  Math.max(pick,  notPick);
//	}
	public static void main(String[] args) {

		int arr[] = {2, 1, 4, 9};
		int n = arr.length;
//		int dp[] = new int[n];
//		
//		dp[0] = arr[0];
//		for(int ind = 1; ind < n; ind++) {
//			int pick = arr[ind];
//			if(ind > 1) pick += dp[ind-2];
//			int notPick = 0 + dp[ind-1];
//			dp[ind] =  Math.max(pick,  notPick);
//		}
//		int maxi = dp[n-1];
//		System.out.println(maxi);
		
		int prev = arr[0];
		int prev2 = 0;
		for(int ind = 1; ind < n; ind++) {
			int pick = arr[ind];
			if(ind > 1) pick += prev2;
			int notPick = 0 + prev;
			int curr =  Math.max(pick,  notPick);
			prev2 = prev;
			prev = curr;
		}
		int maxi = prev;
		System.out.println(maxi);

	}

}
