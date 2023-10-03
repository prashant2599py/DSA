package Arrays;

public class OptimizeMajorityElement {
	
	public static int majorityElement(int []nums) {
		
		int n = nums.length;
		int cnt =0;
		int el = 0;
		
		// Applying algorithm
		for(int i = 0; i < n; i++) {
			if(cnt == 0) {
				cnt =1;
				el = nums[i];
			}else if(el == nums[i]) cnt++;
			else cnt--;
		}
		
		// Checking if the stored element is the majority element
		int cnt1 = 0;
		for(int i = 0; i < n; i++) {
			if(nums[i] == el) cnt1++;
		}
		
		if(cnt1 > (n / 2)) return el;
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {7, 7, 5, 7, 5, 1, 5, 7, 5 , 5, 7, 7, 5, 5, 5, 5};
		int ans = majorityElement(arr);
		System.out.println("majority Element is : "+ ans);

	}

}
