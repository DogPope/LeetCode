// This problem can be found at: https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    // My solution is the following two methods.
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String reversedString = reverse(s);
        return s.equals(reversedString);
    }
    public String reverse(String s){
        String x = "";
        for(int i = s.length() - 1; i >= 0; i--){
            x = x + s.charAt(i);
        }
        return x;
    }

    // Better solution that was posted on LeetCode. Was also done in one method.
    /*
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
    */
    public static void main(String a[]){
        int x = 5678765;
        PalindromeNumber p = new PalindromeNumber();
        boolean result = p.isPalindrome(x);
        System.out.println(result); // True
    }
}