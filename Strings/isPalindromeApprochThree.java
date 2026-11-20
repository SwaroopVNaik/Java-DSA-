// leetcode : 125
// Approach 3 : Best Approch using String and Two Pointers
// Reason : Only traverse from both side, no extra space
// Time complexity : O(n);
// Space Complexity :O(1)

import java.nio.charset.CharacterCodingException;

public class isPalindromeApprochThree {

    public static void main(String[] args) {
        
        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
        testPalindrome("A man, a plan, a canal : Panama");
        testPalindrome("121121");
        testPalindrome("a@1@1@a");

    }

    public static void testPalindrome(String input)
    {
        boolean answer = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Ouput : " + answer);
    }

    public static boolean isPalindrome(String input)
    {
        input = input.toLowerCase();

        boolean result = true;

        int left = 0;
        int right = input.length() - 1;

        // Two Pointers start from here
        while(left < right)
        {
            while(left < right && !Character.isLetterOrDigit(input.charAt(left)))
            {
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(input.charAt(right)))
            {
                right--;
            }

            if(input.charAt(left) != input.charAt(right))
            {
                result = false;
                break;
            }

            left++;
            right--;

        }

        return result;
    }

}
