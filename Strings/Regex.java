public class Regex 
{

    static void regexFirst(String text)
    {
        // dot contains all the charecter !
        // dot matches any character except new line !
        // example : 'a' is matched with regex '.' -> o/p = true

        System.out.println("The Regex One .");
        System.out.println(text.matches("."));
    }

    static void regexTwo(String text)
    {
        // [abc] -> matches exactly only one character from given set.
        // example : 'a' -> [abc] -> o/p = true;
        // example : 'd' -> [abc] -> o/p = false;
        // example : 'ab' -> [abc] -> o/p = false; (matches only one char at time)

        System.out.println("The Regex Two [abc] : ");
        System.out.println(text.matches("[abc]"));
    }

    static void regexThree(String text)
    {
        // [abc][vz] -> First char must be a or b or c
        //           -> Second char must be v or z

        // combinations of true possibality

        // True => av, az, bv, bz, cv, cz

        // Combinations of false possibality

        // False => aa, caa, abb, ccc

        System.out.println("The Regex Three [abc][vz]");
        System.out.println(text.matches("[abc][vz]"));
    }

    static void regexFour(String text)
    {
        // [^abc] -> not abc (except abc everything)
        
        // matching possibality

        // d - z, D - Z, 0 - 9 (all charcters and all special characters except abc)

        // not matching possibality 

        // a, b, c

        System.out.println("The Regex Four [^abc]");
        System.out.println(text.matches("[^abc]"));
    }

    static void regexFive(String text)
    {
        // [a - z1 - 7] 
        // matches -> any lower case letter
        //         -> Any Digit 1 to 7

        System.out.println("The Regex Five [a - z1 - 7]");
        System.out.println(text.matches("[a - z1 - 7]"));
    }

    static void regexSix(String text)
    {
        // A/B

        // Matches 'A' or 'B'
        // Does not matche 'C' and etc

        System.out.println("The Regex Six A/B");
        System.out.println(text.matches("A/B"));
    }

    static void regexSeven(String text)
    {
        // XZ => matches exact Sequenece
        // Does not match ZX

        System.out.println("The Regex Seven XZ");
        System.out.println(text.matches("XZ"));
    }

    public static void main(String[] args) 
    {
        String text = "a";

        // Regex => 1;
        regexFirst(text);

        // Regex => 2;
        regexTwo(text);

        // Regex => 3;
        regexThree(text);

        // Regex => 4:
        regexFour(text);

        // Regex => 5:
        regexFive(text);

        // Regex => 6: 
        regexSix(text);

        // Regex => 7: 
        regexSeven(text);

    }
}
