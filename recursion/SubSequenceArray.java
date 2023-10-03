package recursion;

import java.util.ArrayList;

public class SubSequenceArray {
	public static void solve(String str, String output, int index, ArrayList<String> arr) {
		if(index == str.length()) {
			arr.add(output);
			return;
		}
		
		//Not Take
		solve(str, output, index+1, arr);
		
		//Take
		char element = str.charAt(index);
		solve(str, output+element, index+1, arr);
	}
	
	public static ArrayList<String>  subsequences(String str){
		ArrayList<String> arr = new ArrayList<>();
		String output = "";
		solve(str, output, 0, arr);
		return arr;
	}

	public static void main(String[] args) {
		String input = "abs";
		ArrayList<String> result = subsequences(input);
        System.out.println(result);
		

	}

}
