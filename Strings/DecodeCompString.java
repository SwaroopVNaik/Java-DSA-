// Problem : Decode Compressed String
// Input : a3b4c2
// output : aaabbbbcc
// Assumptions : Every Char is followed by single digit
// Use String Builder : Because we don't know size of the output.
// Time Complexity : 
// Space Complexity :

public class DecodeCompString 
{

    public static void main(String[] args) 
    {
        testDecode("a3b4c2");       
        testDecode("x1y5");
        testDecode("m2n3");      
    }    

    // Test method
    public static void testDecode(String input)
    {
        System.out.println("Input : " + input);
        System.out.println("Ouput : " + decode(input));
    }

    // Decode method
    public static String decode(String input)
    {
        StringBuilder answer = new StringBuilder();

        for(int index = 0; index < input.length(); index = index + 2)
        {
            // READ Chars
            char currentCharacter = input.charAt(index);

            // Read Digit
            int number = input.charAt(index + 1) - '0'; // Parsing -- converting one format to other.

            // int number = '3' - '0' --> 51 - 48 = 3

            // append
            for(int count = 1; count <= number; count = count + 1)
            {
                answer.append(currentCharacter);
            }
        }

        return answer.toString();
    }
}
