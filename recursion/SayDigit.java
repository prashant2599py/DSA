package recursion;

public class SayDigit {
	public static void digitSay(int number, String arr[]) {
		
		//Base Case
		if(number == 0)
			return;
		
		//Processing
		int digit = number % 10;
		number = number / 10;
		
		//Recursive call
		digitSay(number,arr);
		System.out.print(arr[digit]+ " ");
	}

	public static void main(String[] args) {
		String arr[] = {"Zero", "One", "Two", "Three",
						"Four", "Five", "Six","Seven", "Eight","Nine"};
		
		int n = 234;
		System.out.println(n + " " + "In Digits :");
		digitSay(n,arr);
		

	}

}
