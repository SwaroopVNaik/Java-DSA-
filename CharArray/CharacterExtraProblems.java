package CharArray;

public class CharacterExtraProblems {

    static void printletters(char [] letters)
    {

        if(letters == null || letters.length == 0)
        {
            System.out.println("The Array is Empty");
        }
        
        int index = 0;
        while(index < letters.length)
        {
            System.out.print(letters[index]);
            index = index + 1;
        }
    }

    static char[] miniEncryption(char [] letters)
    {
        if(letters == null || letters.length == 0)
        {
            System.out.println("The Array is Empty");
        }

        int index = 0;
        while(index < letters.length)
        {
            if((letters[index] == 'a' || letters[index] == 'A') ||
                (letters[index] == 'e' || letters[index] == 'E')||
                (letters[index] == 'i' || letters[index] == 'I')||
                (letters[index] == 'u' || letters[index] == 'U')||
                (letters[index] == 'o' || letters[index] == 'O')
            )
            {
                letters[index] = '*';
            }

            index = index + 1;
        }

        return letters;
    }

    static char[] miniEncryptionV2(char [] letters)
    {
        int index = 0;
        while (index < letters.length) 
        {
            int fixedIndex = 2;
            letters[index] = (char) (letters[index] + fixedIndex + index);
            index = index + 1;
        }

        return letters;
    }

    static char[] miniDecryption(char [] letters)
    {
        int index = 0;
        int fixedIndex = 2;
        while (index < letters.length)
        {
            letters[index] = (char) (letters[index] - fixedIndex - index);
            index = index + 1;
        }

        return letters;

    }

    public static void main(String[] args) 
    {
        String msg = "Hi Hamza ! How are You ?";
        char [] message = msg.toCharArray();
        printletters(message);

        // System.out.println();

        // char result [] = miniEncryption(message);
        // printletters(result);

        // System.out.println();
        char resultV2 [] = miniEncryptionV2(message);
        System.out.println("\n After Encryption : ");
        printletters(resultV2);

        // System.out.println();
        
        char DresultV3 [] = miniDecryption(message);
        System.out.println("\n After Decryption : ");
        printletters(DresultV3);

        
                            
    }

}
