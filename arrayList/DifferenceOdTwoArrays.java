package arrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import dataStructure.Set;
public class DifferenceOdTwoArrays {
	
	public static List<List<Integer>> differenceOfArrays(int[] nums1, int nums2[]) {
		 List<List<Integer>> ans = new ArrayList<List<Integer>>();

	        List<Integer> list1 = new ArrayList<Integer>();
	        List<Integer> list2 = new ArrayList<Integer>();
	        HashSet<Integer> set1 = new HashSet<Integer>();
	        HashSet<Integer> set2 = new HashSet<Integer>();

	        for(int val : nums1) set1.add(val);
	        for(int val : nums2) set2.add(val);

	        for(int val : nums1){
	            if(set2.contains(val) == false){
	                list1.add(val);
	            }
	        }
	        for(int val : nums2){
	            if(set1.contains(val) == false){
	                list2.add(val);
	            }
	        }
	        ans.add(list1);
	        ans.add(list2);
	        return ans;
		
	}

	public static void main(String[] args) {
		int str1[] = {1, 2,3, 4,5 };
		int str2[] = {1, 2, 6, 7};
		
		
		
	}

}
