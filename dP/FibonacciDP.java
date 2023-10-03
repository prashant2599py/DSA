package dP;

public class FibonacciDP {

	public static void main(String[] args) {
	
		//Tabulation
//		int n = 5;
//		int dp[] = new int[n+1];
//		
//		dp[0] = 0;
//		dp[1] = 1;
//		for(int i = 2; i <= n; i++) {
//			dp[i] = dp[i-1] + dp[i-2]; 
//		}
//		System.out.println(dp[n]);
		
		//Space Complexion
		
		int n = 1;
		int prev = 1;
		int prev2 = 0;
		for(int i = 2; i <= n; i++) {
			int currI = prev + prev2;
			prev2 = prev;
			prev = currI;
		}
		System.out.println(prev);
		

	}

}
