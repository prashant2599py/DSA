package Arrays;



public class ZeroesToEnd {
	
	public static void swap(int[] arr,int start, int end) {
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void moveZeroes(int[] arr) {
		int size = arr.length;
		
		if(size == 0 || size == 1) {
			return;
		}
		
		int i = 0, j = 0;
		while(j < size) {
			if(arr[j] != 0) {
				swap(arr,i,j);
				j++;
				i++;
			}else {
				j++;
			}
		}
	}

	public static void main(String[] args) {
		// BRUTE FORCE APPROACH
//		int arr[] = {1,0,2,3,2,0,0,4,5,1};
//		int n = arr.length;
//		
//		int temp[] = new int[n];
//		int k = 0;
//		
//		for (int i = 0; i < n; i++) {
//			if(arr[i] != 0) {
//				temp[k] = arr[i];
//				k++;
//			}
//		}
//		
//		while(k<n) {
//			temp[k] = 0;
//			k++;
//		}
//		
//		for(int i=0;i<n;i++)
//			System.out.print(temp[i]+ " ");
		
		// BRUTE FORCE APPROACH
		
// ----------------------------------------------------------------------------------------
		// OPTIMAL SOLUTION
		
		int arr[] = {1,0,2,3,2,0,0,4,5,1};
		int n = arr.length;
		moveZeroes(arr);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
