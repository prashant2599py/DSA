package recursion;

public class SumFirstNnumbers {
	
	public static int sum(int i) {
		if(i == 0) return 0;
		return i + sum(i-1);
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(sum(n));

	}

}
