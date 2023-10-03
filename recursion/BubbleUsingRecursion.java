package recursion;

public class BubbleUsingRecursion {
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void sortArray(int arr[], int n) {
		//base case
		if(n == 0 || n == 1) {
			return;
		}
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
 			}
		}
		//recursive call
		sortArray(arr, n-1);
	}
	
	public static void main(String[] args) {
		int arr[] = {7, 8, 3, 1, 2};
		int n = arr.length;
		
		sortArray(arr, n);
		printArray(arr);

	}

}
