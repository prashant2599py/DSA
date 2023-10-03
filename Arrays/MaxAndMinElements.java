package Arrays;

public class MaxAndMinElements {

	public static void main(String[] args) {
		
		int arr[] = {0,12,91,23,34,1,90};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int j = 0; j < arr.length;j++) {
			if(arr[j] < min) {
				min = arr[j];
			}
		}
		
		System.out.println(min + " " + max);

	}

}
