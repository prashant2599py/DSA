package Arrays;

import java.util.ArrayList;

public class LeaderInArray {
	
	//BRUTE FORCE APPROACH
//	public static ArrayList<Integer> generateLeaders(int arr[]) {
//		int n = arr.length;
//		ArrayList<Integer> ans = new ArrayList<>();
//		for(int i = 0; i < n; i++) {
//			boolean leader = true;
//			for(int j = i+1; j < n; j++) {
//				if(arr[j] > arr[i]) {
//					leader = false;
//					break;
//				}
//			}
//			if(leader == true) ans.add(arr[i]);
//		}
//		return ans;
//	}
	
	//OPTIMAL APPROACH
	public static ArrayList<Integer> generateLeaders(int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int n = arr.length;
		
		for(int i = n -1; i >= 0; i--) {
			if(arr[i] > max ) {
				list.add(arr[i]);
			}
			max = Math.max(max, arr[i]);
		}
		return list;
	}

	public static void main(String[] args) {
		
		int arr[] = {10, 22, 12, 3, 0, 6};
		ArrayList<Integer> ans = generateLeaders(arr);
//		Collections.sort(ans, Collections.reverseOrder());  In order to get ans in reverse order in optimal Solution
		
		for(int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	}

}
