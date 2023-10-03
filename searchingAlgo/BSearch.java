package searchingAlgo;

public class BSearch {
	
	// WithOut Recursion
	public static int binarySearch(int arr[], int size, int key) {
		
		int start = 0;
		int end = arr.length -1;
		
//		int mid = (start + end) / 2;
		int mid = start + (end - start)/2;
		
		while( start <= end) {
			if(arr[mid] == key) {
				return mid;
			}
			if(key > arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid -1;
			}
			mid = start + (end - start)/2;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int evenArr[] = {2, 4, 6, 8, 12, 16}; 
		int oddArr[] =  {3, 5, 11, 15, 17};
		
		int evenIndex = binarySearch(evenArr, 6, 8);
		int oddIndex = binarySearch(oddArr, 5, 8);
		
		System.out.println("Index of 8 is : " + evenIndex);
		System.out.println("Index of 5 is : " + oddIndex);

	}

}
