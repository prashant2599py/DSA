package recursion;

public class FactorialOfN {
	
	public static int factorialN(int i) {
		if(i == 0)
			return 1;
		return i * factorialN(i-1);
	}

	public static void main(String[] args) {
		
		int n = 4;
		System.out.println(factorialN(n));

	}

}
