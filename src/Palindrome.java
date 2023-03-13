//public class PalindromeUsingRecursion {
//

public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true; // base case: a string with 0 or 1 character is always a palindrome
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if (firstChar != lastChar) {
                return false; // the string is not a palindrome if the first and last characters don't match
            } else {
                String remainingStr = str.substring(1, str.length() - 1);
                return isPalindrome(remainingStr); // recursively check if the remaining string is a palindrome
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }

        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome.");
        } else {
            System.out.println(str2 + " is not a palindrome.");
        }
    }
}
