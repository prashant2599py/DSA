package Arrays;


// BRUTE FORCE APPROACH
public class RightRotate {
	
	static void rightRotate(int arr[],int n, int d) {
		
		if(n == 0) return;
		
		d = d % n;
		
		if(d == 0) return;
		
		int temp[] = new int[d];
		
		for(int i = n-d; i < n; i++) {
			temp[i-(n-d)] = arr[i];
		}
		
		for(int i = n-d-1; i >= 0; i--) {
			arr[i+d] = arr[i];
		}
		
		for(int i = 0; i < d; i++) {
			arr[i] = temp[i];
		}
		
		
	}

	public static void main(String[] args) {
		
		int n = 7;
		int arr[] = {1,2,3,4,5,6,7};
		int d = 3;
				
		
		System.out.println("Before Left Rotation: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		
		rightRotate(arr,n,d);
		System.out.println("After Right Rotation: " );
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		

	}

}
