package recursion;

public class LinearbackTrack1ToN {
	
	public static void linearBackTrack1ToN(int i, int n) {
		if(i < 1) {
			return;
		}
		linearBackTrack1ToN(i-1, n);
		System.out.println(i);
	}

	public static void main(String[] args) {


		int n = 3;
		linearBackTrack1ToN(n, n);

	}

}
