package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSeq {
	
	public static int consecutiveSequence(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int value : nums) {
			hashSet.add(value);
		}
		int longest = 0;
		for(int value : nums) {
			if(!hashSet.contains(value - 1)) {
				int currentNum = value;
				int currentCount = 1;
				
				while(hashSet.contains(currentNum + 1)) {
					currentNum += 1;
					currentCount += 1;
				}
				longest = Math.max(longest, currentCount);
			}
			
		}
		return longest;
		
	}

	public static void main(String[] args) {
		int arr[] = {102,4,100,1,101,3,2,1,1};
		int ans = consecutiveSequence(arr);
		System.out.println("The Longest consecutive Sequence is of lenght : " + ans );

	}

}
