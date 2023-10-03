package recursion;

import java.util.Scanner;

public class Linearly1ToN {
	
	public static void fun1ToN(int i, int n) {
		if(i > n) {
			return;
		}
		System.out.println(i);
		fun1ToN(i+1,n);
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		fun1ToN(1, n);
		

	}

}
