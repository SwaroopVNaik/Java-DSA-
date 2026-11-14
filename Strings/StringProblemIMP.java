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
    }

}
