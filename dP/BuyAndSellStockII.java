package dP;
import java.util.Arrays;

public class BuyAndSellStockII {

    static long f(int index, int buy, long arr[], long dp[][]) {
        if (index == arr.length)
            return 0;

        if (dp[index][buy] != -1)
            return dp[index][buy];

        long profit = 0;
        if (buy == 1) {
            profit = Math.max(-arr[index] + f(index + 1, 0, arr, dp),
                                0 + f(index + 1, 1, arr, dp));
        } else {
            profit = Math.max(arr[index] + f(index + 1, 1, arr, dp),
                                0 + f(index + 1, 0, arr, dp));
        }
        return dp[index][buy] = profit;
    }

//    public static long getMaximumProfit(int n, long[] values) {
//        long dp[][] = new long[n][2];
//        for (long row[] : dp) {
//            Arrays.fill(row, -1);
//        }
//        return f(0, 1, values, dp);
//    }

    public static void main(String[] args) {
        int n = 6; // Replace with your desired array size
        long[] values = { 7, 1, 5, 3, 6, 4 }; // Replace with your array values
        long dp[][] = new long[n][2];
        for (long row[] : dp) {
            Arrays.fill(row, -1);
        }
        long result = f(0, 1, values, dp);
        System.out.println(result);

        // Print the dp array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
