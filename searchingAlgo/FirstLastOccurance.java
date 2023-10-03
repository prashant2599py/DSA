package searchingAlgo;

public class FirstLastOccurance {
	
public static int firstOccurance(int arr[], int size, int key) {
		
		int start = 0;
		int end = arr.length -1;
		int ans = -1;
		

		int mid = start + (end - start)/2;
		
		while( start <= end) {
			
			if(arr[mid] == key) {
				ans = mid;
				end = mid - 1;
			}
			if(key > arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid -1;
			}
			mid = start + (end - start)/2;
		}
		return ans;
	}

public static int lastOccurance(int arr[], int size, int key) {
	
	int start = 0;
	int end = arr.length -1;
	int ans = -1;

	
	int mid = start + (end - start)/2;
	
	while(start <= end) {
		
		if(arr[mid] == key) {
			ans = mid;
			start = mid + 1;
		}
		else if(key > arr[mid]) {
			start = mid+1;
		}
		else{
			end = mid - 1;
		}
		mid = start + (end - start)/2;
	}
	return ans;
}


	public static void main(String[] args) {

		int evenArr[] = {2, 3, 3, 3, 9, 16}; 
				
		System.out.println("First Occurance of 3  is : " + firstOccurance(evenArr, 6, 3));
		System.out.println("Last Occurance of 3  is : " + lastOccurance(evenArr, 6, 3));
		
		
	}

}
