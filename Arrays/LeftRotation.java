package Arrays;


// OPTIMAL SOLUTION

public class LeftRotation {
	
	static void reverse(int arr[], int start, int end) {
		
		while(start <= end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
	}
	
	static void leftRotation(int arr[], int n, int d) {
		
		if(n == 0) return;
		
		d = d% n;
		
		if(d == 0) return;
		
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		
	}

	public static void main(String[] args) {
		
		int n = 7;
		int arr[] = {1,2,3,4,5,6,7};
		int d = 3;
		
		System.out.println("before Left Rotation: ");
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		leftRotation(arr,n,d);
		System.out.println("After Left Rotation:");
		for(int i = 0;i < n; i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();

	}

}
