package Arrays;
import java.util.*;

// Better Approach by HAshing

public class MajorityElement {
	
	public static int majorityElement(int[] v) {
		int n = v.length;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		// Storing the element with its occurance
		for(int i = 0; i < n; i++) {
			int value = map.getOrDefault(v[i], 0);
			map.put(v[i], value + 1);
		}
		
		//Searching for majority Element
		for(Map.Entry<Integer, Integer> it : map.entrySet()) {
			if(it.getValue() > (n/2)) {
				return it.getKey();
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2, 2, 1, 1, 1, 2, 2};
		int ans = majorityElement(arr);
		System.out.println("majority Elements are : " + ans);

	}

}
