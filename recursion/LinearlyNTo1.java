package recursion;

import java.util.Scanner;

public class LinearlyNTo1 {
	public static void funNTo1(int i, int n) {
		if( i == 0) {
			return;
		}
		System.out.println(i);
		funNTo1(i - 1, n);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		funNTo1(n,1);

	}

}
