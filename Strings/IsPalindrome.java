public class IsPalindrome 
{
    // leetcode 125
    // problem 1 : Reverse String
    // Approach 1 : Reverse String
    // class used : StringBuilder
    // Reason : string builder provides reverse() method;
    // Reason 2 : easy to understand logic
    // Reason 3 : good starting approach 

    // Time Complexity : O(n)
    // Space Complexity : O(n)

    public static void main(String[] args) 
    {
        // Diffrent inputs to test :
        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
        testPalindrome("A man, a plan, a canal : Panama");
        testPalindrome("121121");
        testPalindrome("a@1@1@a");
        testPalindrome("");
    }

    public static void testPalindrome(String input)
    {
        boolean answer = IsPalindrome(input);

        System.out.println("input :" + input); // print input
        System.out.println("output : " + answer); // print result
    }

    // write logic here
    public static boolean IsPalindrome(String input) // Madam
    {
        // step 1 -> convert everything to lowercase
        // bcoz --> A and a should be treated same

        input = input.toLowerCase(); // madam

        // step 2 --> keep only letters and digits
        // ignore : spaces, comma, full stop, colon etc

        // each time a new letter comes new object is getting created
        String cleaned = "";

        for(int index = 0; index < input.length(); index = index + 1)
        {
            char currentCharacter = input.charAt(index); // current character = m

            // Character is inBuilt class that has isLetterOrDigit method
            if(Character.isLetterOrDigit(currentCharacter))
            {
                cleaned = cleaned + currentCharacter;
            }

        }

        // step 3) reverse the cleaned string (using string builder cause reverse belongs to String builder)

        StringBuilder builder = new StringBuilder(cleaned);

        // after reversing we used toString cause equals belongs to string.
        String reversed = builder.reverse().toString();

        // step 4) compare

        return cleaned.equals(reversed);

    }


}
