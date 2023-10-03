package recursion;

public class ReverseArray1Pointer {
	
	public static void swap(int arr[], int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void reverseArray(int arr[], int i, int n) {
		if(i >= n/2) return;
		swap(arr, arr[i], arr[n-i-1]);
		reverseArray(arr, i+1, n);
		
	}
	/* Utility that prints out an array on a line */
    static void printArray(int arr[], 
                            int size)
    {
        for (int i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
           
         System.out.println();
    } 

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6); 

	}

}
