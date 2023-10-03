package recursion;

public class MergeSortUsingRecursion {
	
	public static void merge(int arr[], int start, int end) {
		int mid = start + (end-start)/2;
		
		int len1 = mid - start + 1;
		int len2 = end - mid;
		
		int arr1[] =new int[len1];
		int arr2[] = new int[len2];
		 
		//Copy Values
		int mainArrayIndex = start;
		for(int i = 0; i < len1; i++) {
			arr1[i] = arr[mainArrayIndex++];
		}
		
		mainArrayIndex = mid + 1;
		for(int i = 0; i < len2; i++) {
			arr2[i] = arr[mainArrayIndex++];
		}
		
		//merge 2 Sorted arrays
		int index1 = 0;
		int index2 = 0;
		mainArrayIndex = start;
		while(index1 < len1 && index2 < len2) {
			if(arr1[index1] < arr2[index2]) {
				arr[mainArrayIndex++] = arr1[index1++];
				
			}else {
				arr[mainArrayIndex++] = arr2[index2++];
			}
		}
		while(index1 < len1) {
			arr[mainArrayIndex++] = arr1[index1++];
		}
		while(index2 < len2) {
			arr[mainArrayIndex++] = arr2[index2++];
		}
		
	}
	
	public static void mergeSort(int arr[], int start, int end) {
		
		//base case
		if(start >= end) {
			return;
		}
		
		//Find mid
		int mid = start + (end-start)/2;
		
		//Recursive call
		//Left part sort krne ke liye
		mergeSort(arr, start, mid);
		
		//Right Part sort krne ke liye 
		mergeSort(arr, mid+1, end);
		
		merge(arr, start, end);
		
	}
	
	
	
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {23, 2, 90, 4, 67, 1, 0, 56};
		int n = 8;
		
		mergeSort(arr, 0, n-1);
		
		printArray(arr);

	}

}
