package recursion;

public class ReverseArray {
	
	public static void reverseArray(int arr[], int left, int right) {
		if(left >= right) return;
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		reverseArray(arr, left+1, right-1);
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
		int arr[] = {1, 3, 2, 5, 4};
		printArray(arr, 5);
        reverseArray(arr, 0, 4);
        System.out.print("Reversed array is \n");
        printArray(arr, 5); 
		
		
	}

}
