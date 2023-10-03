package Strings;

public class Palindrome{

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j) {
        	if(str.charAt(i) != str.charAt(j))
        		return false;
        	i++;
        	j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "raceacar";
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
