import java.util.Arrays;

public class StringsAssigments 
{
    static void extractEmail()
    {
        String email = "swaroop.v.naik@gmail.com";

        int positon = email.indexOf("@");

        int domainPostion = email.lastIndexOf(".");

        String username = email.substring(0, positon);

        String domian = email.substring(domainPostion);

        System.out.println("The Username extracted from email : " + username);
        System.out.println("The domain extracted from email : " + domian);

    }

    static void checkTheStringIsHexaOrBinary()
    {
        String Binarynumber = "10101";

        String HexaDecimalNumber = "abc123";

        System.out.println(Binarynumber + " is the number Binary : " + Binarynumber.matches("^[01]+"));
        System.out.println(HexaDecimalNumber + " is the number HexaDecimal : " + HexaDecimalNumber.matches("^[0-9A-Fa-f]+"));
    }

    static void removespecialCharacter()
    {
        String sentence = "java@python#C++&lessgo$lessGo";

        System.out.println(sentence + " After Removing special Characters From String : " + sentence.replaceAll("[^0-9A-Za-z]+", ""));
    }

    static void removeExtraSpace()
    {
        String sentence = "Java is very    powerful, oops      dsa              development   ai";

        System.out.println("After Removing Extra Space : " + sentence.replaceAll("\\s+" , " "));
    }

    static void getCountOfWord()
    {
        String sentence = "Builder is fast but not thread safety";

        int count = 0;

        if(sentence.length() != 0)
        {
            String [] array = sentence.split(" ");

            for(String word : array)
            {
                count = count + 1;
            }
        }

        System.out.println("Number of words in sentence : " + count);
    }

    static void ValidDateFormat()
    {
        String date = "01/12/2000";

        System.out.println("The Valid Date Format is : ");
    }

    public static void main(String[] args) 
    {
        // 1) Extract userName and domain from email.

        extractEmail();

        // 2) Check weather the given string String is Hexa Decimal (or) Binary.

        checkTheStringIsHexaOrBinary();

        // 3) Remove all the special Character

        removespecialCharacter();

        // 4) remove extra spaces 

        removeExtraSpace();

        // 5) Count the number of word in the string

        getCountOfWord();

        // 6) check weather the given string is valid date format string;
        ValidDateFormat();
    }    
}
