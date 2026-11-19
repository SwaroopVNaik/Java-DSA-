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

    }    
}
