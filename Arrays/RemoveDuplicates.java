package Arrays;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] arr) {
		int i = 0;
		int n = arr.length;
		for(int j = 1; j < n; j++) {
			if(arr[j] != arr[i]) {
				arr[i+1] = arr[j];
				i++;
			}
			
		}
		return i+1;
	}

	public static void main(String[] args) {
	       int arr[] = {1,1,2,2,2,3,3};
	        int k = removeDuplicates(arr);
	        System.out.println("The array after removing duplicate elements is ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
}
