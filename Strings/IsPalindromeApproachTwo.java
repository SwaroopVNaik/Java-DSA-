// leetcode 125

// Approach 2 : build clean String using String builder.
// Reason : Avoid creating mutliple String Objects while cleaning.
// Time Complexity : 
// Space Complexity :

public class IsPalindromeApproachTwo
{
    public static void main(String[] args) 
    {
        // Diffrent inputs to test :
        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
        testPalindrome("A man, a plan, a canal : Panama");
        testPalindrome("121121");
        testPalindrome("a@1@1@a");

    }

    public static void testPalindrome(String input)
    {
        boolean answer = IsPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Output : " + answer);

    }

    // write logic here 
    public static boolean IsPalindrome(String input)
    {
        // Step 1 : converting everythig to lowercase
        // bcoz --> A and a must be treated same

        // Using string builder as it has append() method and to avoid new string objects

        StringBuilder cleaned = new StringBuilder();

        for(int index = 0; index < input.length(); index = index + 1)
        {
            // pick one character at a time
            char currentCharacter = input.charAt(index); 

            // checking if current character is letter or digit
            if(Character.isLetterOrDigit(currentCharacter))
            {
                cleaned.append(currentCharacter);
            }
        }

        StringBuilder reversed = new StringBuilder(cleaned);

        // Reversing the String 
        reversed.reverse();

        return cleaned.toString().equals(reversed.toString());

    }
}
