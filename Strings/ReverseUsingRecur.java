package Strings;

public class ReverseUsingRecur {
//    public static String reverseString(String input) {
//        char[] charArray = input.toCharArray();
//        reverseHelper(charArray, 0, charArray.length - 1);
//        return new String(charArray);
//    }
//
//    private static void reverseHelper(char[] charArray, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//        
//        char temp = charArray[left];
//        charArray[left] = charArray[right];
//        charArray[right] = temp;
//
//        reverseHelper(charArray, left + 1, right - 1);
//    }
//
//    public static void main(String[] args) {
//        String inputStr = "Prashant";
//        String reversedStr = reverseString(inputStr);
//        System.out.println(reversedStr); // Outputs: "!dlroW ,olleH"
//    }
	
	public static void reverseString(StringBuilder str,int i, int j) {
		if(i > j) {
			return;
		}
		char frontChar = str.charAt(i);
		char backChar = str.charAt(j);
		
		str.setCharAt(i, backChar);
		str.setCharAt(j, frontChar);
		
		reverseString(str,i+1,j-1);
		
		
	}
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		reverseString(str, 0, str.length()-1);
		System.out.println(str);
	}
}

