package recursion;

public class LinearBackTrackNTo1 {
	public static void linearbackTrack1ToN(int i, int n) {
		if(i > n) {
			return;
		}
		linearbackTrack1ToN(i + 1, n);
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		int n = 3;
		linearbackTrack1ToN(1,n);
		

	}

}
