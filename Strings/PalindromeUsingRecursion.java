package Strings;

public class PalindromeUsingRecursion {
	 public static Boolean isPalindrome(String str, int i, int j){
		 
		 //base case
		 if(i > j) {
			 return true;
		 }
		 
	        	if(str.charAt(i) != str.charAt(j))
	        		return false;
	        	//recursive call
	        	return isPalindrome(str, i+1, j-1);
	        }
	        

	public static void main(String[] args) {
		
		String str = "Prashant";
		Boolean palindrome = isPalindrome(str, 0, str.length()-1);
		if(palindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
	}

}
