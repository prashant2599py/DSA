package recursion;

import java.util.Scanner;

public class Main {
	public static void fun(int i, int n) {
		if(i > n) {
			return;
		}
		System.out.println("Raj");
		fun(i+1, n);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fun(1, n);

	}

}
