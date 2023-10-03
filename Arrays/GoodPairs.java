package Arrays;

public class GoodPairs {

	
	public static int numIdenticalPairs(int[] nums) {
        int count  = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(i<j){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,1,1,3};
		
//		int nums2[] = {1,1,1,1};
//		int count = 0;
//		for(int i = 0; i< nums2.length; i++){
//          for(int j = 1; j < nums2.length; j++){
//              if(i<j){
//                  if(nums2[i] == nums2[j]){
//                      count++;
//                  }
//              }
//          }
//      }
//		System.out.println("Size of good pairs : " + count);
		
		System.out.println("Number of Good pairs are : " + numIdenticalPairs(nums));

	}

}
