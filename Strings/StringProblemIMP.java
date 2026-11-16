import java.util.*;

public class StringProblemIMP 
{
    static void convertingLetterAtoB(char letter)
    {

        // A -> B
        System.out.println("Converting A -> B : ");
        System.out.println((char) (letter + 1));

        // B -> A
        char ch = 'B';
        System.out.println("Converting B -> A : ");
        System.out.println((char) (ch - 1));

    }    

    static void convertingCapsToSmall(char letter)
    {
        System.out.println("Converting Caps to Small : ");
        System.out.println((char) (letter + 32));
    }

    static void convertingsmallToCaps(char letter)
    {
        System.out.println("Converting Small to Caps : ");
        System.out.println((char) (letter - 32));
    }

    static boolean checkingUpperOrLower(char letter)
    {
        Boolean result = true;

        if(letter >= 'A' && letter <= 'Z')
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }

    static void printCharAtEvenIndices()
    {
        char [] letters = {'J', 'A', 'V', 'A'};

        System.out.println("printing Char Array Even Indices : ");

        int index = 0;
        while(index < letters.length)
        {
            if(index % 2 == 0)
            {
                System.out.print(letters[index] + " ");
            }

            index = index + 1;
        }
    }

    static void printStringAtEvenIndices()
    {
        String name = "Java";

        System.out.println("Printing last Character : ");

        System.out.println("\nPrinting String Even Indices : ");
        
        for(int index = 0; index < name.length(); index = index + 1)
        {
            if(index % 2 == 0)
            {
                System.out.print(name.charAt(index) + " ");
            }
        }

    }

    static void printMiddleCharacterOfString()
    {
        String name = "Swaroop";

        if(name.length() % 2 == 0)
        {
            System.out.println("\nThe String is Even :");
            System.out.print(name.charAt(name.length() / 2 - 1) + " ");
            System.out.print(name.charAt(name.length() / 2 + 1));
        }
        else
        {
            System.out.println("\nThe String is Odd :");
            System.out.println(name.charAt(name.length() / 2));
        }

    }

    static void printMiddleElementsOfChar()
    {
        char letter [] = {'j', 'a', 'v', 'a'};

        if(letter.length % 2 == 0)
        {
            System.out.println("\nThe Character Array is Even : ");
            System.out.print("Middle : " + letter[letter.length / 2 - 1] + " ");
            System.out.println(letter[letter.length / 2]);
        }
        else
        {
            System.out.println("\nThe Character Array is Odd : ");
            System.out.println("Middle : " + letter[letter.length / 2]);
        }


    }

    static void printCharAtOddIndices()
    {
        char [] letter = {'s', 'w', 'a', 'r', 'o', 'o', 'p'};

        for(int index = 0; index < letter.length; index = index + 1)
        {
            if(index % 2 != 0)
            {
                System.out.println(letter[index]);
            }
        }
    }

    static void printStringAtOddIndices()
    {
        String name = "Swaroop.V.Naik";

        for(int index = 0; index < name.length(); index = index + 1)
        {
            if(index % 2 != 0)
            {
                System.out.println("\n" + name.charAt(index));
            }
        }
    }

    static void printASCIIValuesOfDigits()
    {
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for(int index = 0; index < digits.length; index = index + 1)
        {
            System.out.println(digits[index] + " => " + (int) digits[index]);
        }
    }

    static void printASCIIValuesOfDigitsInString()
    {
        String digits = "0123456789";

        for(int index = 0; index < digits.length(); index = index + 1)
        {
            System.out.println((int) digits.charAt(index));
        }
    }

    static int getCountOfVowelsInCharacter()
    {
        char [] letters = {'s', 'w', 'a', 'r','o', 'o', 'p'};
        
        int vowelsCount = 0;

        for(int index = 0; index < letters.length; index = index + 1)
        {
            if(letters[index] == 'A' || letters[index] == 'a'  ||
                letters[index] == 'E' || letters[index] == 'e' ||
                letters[index] == 'I' || letters[index] == 'i' ||
                letters[index] == 'O' || letters[index] == 'o' ||
                letters[index] == 'U' || letters[index] == 'u' )
            {
                vowelsCount = vowelsCount + 1;
            }
        }

        return vowelsCount;
    }

    static int getCountOfVowelsInString()
    {
        String name = "Swaroop.V.Naik";

        int vowelsCount = 0;

        for(int index = 0; index < name.length(); index = index + 1)
        {
            if(name.charAt(index) == 'A' || name.charAt(index) == 'a'  ||
                name.charAt(index) == 'E' || name.charAt(index) == 'e' ||
                name.charAt(index) == 'I' || name.charAt(index) == 'i' ||
                name.charAt(index) == 'O' || name.charAt(index) == 'o' ||
                name.charAt(index) == 'U' || name.charAt(index) == 'u' )
            {
                vowelsCount = vowelsCount + 1;
            }
        }

        return vowelsCount;
    }

    static int getCountOfUpperCaseLettersInChar()
    {
        char [] letters = {'A', 'a', 'e', 'Z', 'Y', 'o', 'P'};

        int upperCaseCount = 0;

        for(int index = 0; index < letters.length; index = index + 1)
        {
            if(letters[index] >= 'A' && letters[index] <= 'Z')
            {
                upperCaseCount = upperCaseCount + 1;
            }
        }

        return upperCaseCount;
    }

    static int getCountOfUpperCaseLettersInString()
    {
        String name = "Swaroop.V.Naik";

        int upperCaseCount = 0;

        for(int index = 0; index < name.length(); index = index + 1)
        {
            if(name.charAt(index) >= 'A' && name.charAt(index) <= 'Z')
            {
                upperCaseCount = upperCaseCount + 1;
            }
        }

        return upperCaseCount;
    }

    static int getCountOfDigitsInString()
    {
        String input = "A1B2";

        int digitCount = 0;

        for(int index = 0; index < input.length(); index = index + 1)
        {
            if(input.charAt(index) >= '0' && input.charAt(index) <= '9')
            {
                digitCount = digitCount + 1;
            }
        }

        return digitCount;
    }

    static int getCountOfSpecialCharectersInChar()
    {
        char [] name = {'A', '&', 'B', 'C', '$', '2'};

        int specialCharcaterCounter = 0;

        for(int index = 0; index < name.length; index = index + 1)
        {
            if(!((name[index] >= 'A' && name[index] <= 'Z') ||
               (name[index] >= 'a' && name[index] <= 'z') ||
               (name[index] >= '0' && name[index] <= '9')))
               {

                specialCharcaterCounter = specialCharcaterCounter + 1;

               }

        }

        return specialCharcaterCounter;
    }

    static int getCountOfSpecialCharectersInString()
    {
        String name = "S@wa&roop*";

        int specialCharcaterCounter = 0;

        for(int index = 0; index < name.length(); index = index + 1)
        {
            if(!((name.charAt(index) >= 'A' && name.charAt(index) <= 'Z') ||
               (name.charAt(index) >= 'a' && name.charAt(index) <= 'z') ||
               (name.charAt(index) >= '0' && name.charAt(index) <= '9')))
               {

                specialCharcaterCounter = specialCharcaterCounter + 1;

               }
        }

        return specialCharcaterCounter;
    }

    static void countOccuranceOfCharecter()
    {
        char [] name = {'J', 'a', 'v', 'a'};

        int charOccuranceCounter = 0;

        char key = 'a';

        for(int index = 0; index < name.length; index = index + 1)
        {
            if(key == (char) name[index])
            {
                charOccuranceCounter = charOccuranceCounter + 1;
            }
        }

        System.out.println("The occurance of Character is " + key + " is : " + charOccuranceCounter);
        
    }

    static void countOccuranceOfCharcaterInString()
    {
        String name = "SanthoshSir";

        int charOccuranceCounter = 0;

        char key = 'S';

        for(int index = 0; index < name.length(); index = index + 1)
        {
            if(key == (char) name.charAt(index))
            {
                charOccuranceCounter = charOccuranceCounter + 1;
            }
        }

        System.out.println("The occurance of charecter in string is " + key + " is : " + charOccuranceCounter);
        
    }

    static void getLargestCharacter()
    {
        char [] name = {'S', 'W', 'A', 'R', 'O', 'O', 'P'};

        char largestCharecter = name[0];

        for(int index = 1; index < name.length; index = index + 1)
        {
            if(largestCharecter < (char) name[index])
            {
                largestCharecter = name[index];
            }
        }

        System.out.println("The Largest Character is : " + largestCharecter);

    }

    static void getLargestCharacterInString()
    {
        String name = "SwaroopVNaik";

        char largestCharcter = name.charAt(0);

        for(int index = 1; index < name.length(); index = index + 1)
        {
            if(largestCharcter < (char) name.charAt(index))
            {
                largestCharcter = name.charAt(index);
            }
        }

         System.out.println("The Largest Character in String is : " + largestCharcter);

    }

    static void replaceTheVowelsWithStarInCharcacter()
    {
        char [] name = {'S', 'W', 'A', 'R', 'O', 'O', 'P'};

        for(int index = 0; index < name.length; index = index + 1)
        {
            if(name[index] == 'A' || name[index] == 'a'  ||
                name[index] == 'E' || name[index] == 'e' ||
                name[index] == 'I' || name[index] == 'i' ||
                name[index] == 'O' || name[index] == 'o' ||
                name[index] == 'U' || name[index] == 'u' )
            {
                name[index] = '*';
            }
        }

        for(char ch : name)
        {
            System.out.print(ch + " ");
        }
    }
    
    static void replaceTheVowelsWithStarInString()
    {
        String name = "SwaroopVNaik";

        String result = "";

        for(int index = 0; index < name.length(); index = index + 1)
        {
            if(name.charAt(index) == 'A' || name.charAt(index) == 'a'  ||
                name.charAt(index) == 'E' || name.charAt(index) == 'e' ||
                name.charAt(index) == 'I' || name.charAt(index) == 'i' ||
                name.charAt(index) == 'O' || name.charAt(index) == 'o' ||
                name.charAt(index) == 'U' || name.charAt(index) == 'u' )
            {
                result += "*";
            }
            else
            {
                result += name.charAt(index);
            }
        }

        System.out.println("\nThe vowels with star in string : " + result);
    }

    static void ReverseCharacterArray()
    {
        char [] sentence = {'L', 'e', 't', '\'', 's', ' ', 't', 'a', 'k', 'e', ' ', 'l', 'e', 'e', 't', 'c', 'o', 'd', 'e'};

        int start = 0;

        for(int end = 0; end < sentence.length; end = end + 1)
        {
            if(end == sentence.length - 1 || sentence[end] == ' ')
            {
                int left = start;
                
                int right = 0;

                if(end == sentence.length - 1)
                {
                    right = end;
                }
                else
                {
                    right = end - 1;
                }

                while(left < right)
                {
                    char temp = sentence[right];
                    sentence[right] = sentence[left];
                    sentence[left] = temp;

                    left++;
                    right--;
                }

                start = end + 1;
            }
        }

        System.out.println();
        for(char New : sentence)
        {
            System.out.print(New + " ");
        }

    }

    static void ReverseString()
    {
        String name = "Swaroop V Naik";

        String reversedName = "";
        String temp = "";

        for(int index = 0; index < name.length(); index = index + 1)
        {
            if(name.charAt(index) != ' ')
            {
                temp = name.charAt(index) + temp;
            }
            else
            {
                reversedName = reversedName + temp + ' ';
                temp = "";
            }
        }

        reversedName += temp;

        System.out.println("\nThe Reversed String : " + reversedName);
    }

    static int getLengthOfLastWord()
    {
        String message = "Hello World Siddharth                           ";

        int index = message.length() - 1;
        while(index >= 0 && message.charAt(index) == ' ')
        {
            index = index - 1;
        }

        int LastSentenceWordCounter = 0;

        while(index >= 0 && message.charAt(index) != ' ')
        {
            LastSentenceWordCounter = LastSentenceWordCounter + 1;

            index = index - 1;
        }

        return LastSentenceWordCounter;

    }

    public static void main(String[] args) 
    {
        char letter = 'A';

        char smallletter = 'a';

        convertingLetterAtoB(letter);

        convertingCapsToSmall(letter);

        convertingsmallToCaps(smallletter);

        Boolean result = checkingUpperOrLower(letter);

        if(result == true)
        {
            System.out.println("caps");
        }
        else
        {
            System.out.println("small");
        }

        printCharAtEvenIndices();

        printStringAtEvenIndices();

        // print middle character if string length is odd 
        // otherwise print two middle charcters
        printMiddleCharacterOfString();

        printMiddleElementsOfChar();

        printCharAtOddIndices();

        printStringAtOddIndices();

        printASCIIValuesOfDigits();

        printASCIIValuesOfDigitsInString();

        int resultV1 = getCountOfVowelsInCharacter();

        System.out.println("The Number of Vowels in the character : " + resultV1);

        int resultV2 = getCountOfVowelsInString();

        System.out.println("The Number of Vowels in the String : " + resultV2);

        int resultV3 = getCountOfUpperCaseLettersInChar();
        
        System.out.println("The Upper Case Letter Count In Character is : " + resultV3);

        int resultV4 = getCountOfUpperCaseLettersInString();

        System.out.println("The Upper Case Letter Count In String is : " + resultV4);

        int resultV5 = getCountOfDigitsInString();

        System.out.println("The count of digits in String is : " + resultV5);

        int resultV6 = getCountOfSpecialCharectersInChar();

        System.out.println("The count of special Charecter is : " + resultV6);

        int resultV7 = getCountOfSpecialCharectersInString();

        System.out.println("The count of special character in strings : " + resultV7);
        
        countOccuranceOfCharecter();

        countOccuranceOfCharcaterInString();

        getLargestCharacter();

        replaceTheVowelsWithStarInCharcacter();

        replaceTheVowelsWithStarInString();

        ReverseCharacterArray();

        ReverseString();

        int resultV8 = getLengthOfLastWord();

        System.out.println("\nThe Number length of last word is : " + resultV8);
    }

}
