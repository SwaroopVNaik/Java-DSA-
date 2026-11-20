public class RegularMetaChars 
{
    public static void main(String[] args)
    {
        demoMatchOneDigit();
        demoMatchOneWordChar();
        demoNoNDigitMatching();
        matchesOneWhiteSpaceChar();
        demoNonSpaceChar();
        demoSpecialCharacter();

        // Quantifiers
        demoStarQuant();
        demoPlusQuant();
        demoExactCount();
        // demoInMinAndMaxQuant();
        demoQuestionMarkQuant();
    }

    // 1 \d -- matches one digit

    // matches takes String Regex

    public static void demoMatchOneDigit()
    {
        System.out.println("matches one digit : ");
        System.out.println("8".matches("\\d")); // Valid
    }

    // 2 \w -- matches one word character

    public static void demoMatchOneWordChar()
    {
        System.out.println("matches one word : ");
        System.out.println("A".matches("\\w")); // Valid
        System.out.println("9".matches("\\w")); // Valid 
        System.out.println("@".matches("\\w")); // InValid
        System.out.println("_".matches("\\w")); // Valid
    }

    // 3) \D -- Non - Digit Matching

    public static void demoNoNDigitMatching()
    {
        System.out.println("Matches Non Digit matching : ");
        System.out.println("A".matches("\\D")); // Valid 
        System.out.println("7".matches("\\D")); // InValid
    }

    // 4) \s -- Matches one whitespace charecter

    public static void matchesOneWhiteSpaceChar()
    {
        System.out.println("matches one whitespace Character : ");
        System.out.println(" ".matches("\\s")); // Valid
        System.out.println("S".matches("\\s")); // InValid
    }

    // 5) \S -- matches any no space character

    public static void demoNonSpaceChar()
    {
        System.out.println("matches any no space Character : ");
        System.out.println(" ".matches("\\S")); // InValid
        System.out.println("S".matches("\\S")); // Valid
    }

    // 6) \W -- matches special character(non word charecter)

    public static void demoSpecialCharacter()
    {
        System.out.println("Special Character : ");
        System.out.println("@".matches("\\W")); // valid
        System.out.println("#".matches("\\W")); // Valid
        System.out.println("A".matches("\\W")); // InValid
    }

    // Quantifiers => tells how many chars to match

    // 1) * -> zero or more
    public static void demoStarQuant()
    {
        System.out.println("Quantifiers : ");

        String s1 = "abcbbaaac";
        String s2 = "";
        String s3 = "abc7";

        System.out.println("Star Quantifiers : ");
        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
    }

    // 2) + -> One or more
    public static void demoPlusQuant()
    {
        String s1 = "abc";
        String s2 = "";
        String s3 = "aaabbb";

        System.out.println("plus Quantifiers : ");
        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
    }

    // 3) exact count({n})
    public static void demoExactCount()
    {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = "abcd";

        System.out.println("Exact Count : ");
        System.out.println(s1.matches("[abc]{3}"));
        System.out.println(s2.matches("[abc]{3}"));
        System.out.println(s3.matches("[abc]{3}"));


        // for true case of s3
        System.out.println(s3.matches("[abcd]{4}"));
    }

    // 4) {Min, max} -- check within the range
    public static void demoInMinAndMaxQuant()
    {
        String s1 = "abccba";
        String s2 = "ab";
        String s3 = "abccbaaa";

        System.out.println("Min and max : ");
        System.out.println(s1.matches("[abc]{3, 7}"));
        System.out.println(s2.matches("[abc]{3, 7}"));
        System.out.println(s3.matches("[abc]{3, 7}"));
    }

    // 5) question mark check for 0 or 1
    public static void demoQuestionMarkQuant()
    {
        String s1 = "ac";
        String s2 = "abc";
        String s3 = "abbc";

        System.out.println("Question Mark : ");
        System.out.println(s1.matches("ab?c"));
        System.out.println(s2.matches("ab?c"));
        System.out.println(s3.matches("ab?c"));

        // case
        System.out.println(s3.matches("ab?b?c"));
        System.out.println(s3.matches("abb?c"));
    }

}
