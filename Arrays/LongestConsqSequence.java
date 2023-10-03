package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsqSequence {
	
	//BRUTE FORCE APPROACH
//	public static int longestConsecutive(int[] arr) {
//		if(arr.length == 0 || arr == null) {
//			return 0;
//		}
//		Arrays.sort(arr);
//		
//		int longest = 1;
//		int previous = arr[0];
//		int count = 1;
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i] == previous + 1) {
//				count++;
//			}
//			else if(arr[i] != previous) {
//				count = 1;
//				
//			}
//			previous = arr[i];
//			longest = Math.max(longest, count);
//		}
//		
//		
//		
//		return longest;
//	}
	
	// OPTIMAL SOLUTION
	
	public static int longestConsecutive(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int values : arr) {
			set.add(values);
		}
		int longest = 0;
		for(int num : arr) {
			if(!set.contains(num-1)) {
				int currNum = num;
				int currentCount = 1;
				
				while(set.contains(currNum + 1)) {
					currNum += 1;
					currentCount += 1;
				}
				longest = Math.max(currentCount, longest);
			}
		}
		
		return longest;
	}
	
	public static void main(String[] args) {
		int arr[]={100,200,1,2,3,4};
        int lon=longestConsecutive(arr);
        System.out.println("The longest consecutive sequence is "+lon);
	}

		

}
