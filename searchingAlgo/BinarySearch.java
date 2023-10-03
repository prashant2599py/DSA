package searchingAlgo;

public class BinarySearch {
	
	// Using Recursion
	public static int binarySearch(int arr[], int start, int end, int ele) {
		if(end >= start) {
			
			int mid  = start + (end - start)/2;
			
			if(arr[mid] == ele)
				return mid;
			
			if(arr[mid] > ele)
				return binarySearch(arr, start, mid-1, ele);
			
			return binarySearch(arr, mid+1, end, ele);
		
	}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int arr[] = {1,2,3,10,20};
		int n = arr.length;
		int ele = 10;
		
		// Didn't made the method as static so made an object of it.
//		int result = ob.binarySearch(arr, 0, n-1, ele);
		
//		if(result == -1) {
//			System.out.println("Element not Found");
//		}else {
//			System.out.println("Element Found At index " + "-> " + result);
//		}
		
		System.out.println("Element Found At index " + "-> " + binarySearch(arr, 0, n-1, ele));
		

	}

}
