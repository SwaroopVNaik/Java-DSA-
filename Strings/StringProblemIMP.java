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
        


    }

}
