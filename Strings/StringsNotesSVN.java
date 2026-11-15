import java.util.*;
public class StringsNotesSVN {

    void printResultOfStringComparisons()
    {
        // == Operator when used to compare the string it compares the Reference Addresss of the string.
        // equals() -> used to compare strings Actual content.
        // intern() -> returns the pool version of the string (adds it to the string pool if not present).

        String s1 = "java";
        String s2 = "java";

        String s3 = new String("java");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s3));

        System.out.println(s1 == s3.intern());
    }

    public static void main(String[] args) 
    {
        StringsNotesSVN obj = new StringsNotesSVN();

        // String comparsion Examples :
        obj.printResultOfStringComparisons();

        // Group A - Basic Information Methods 

        /*
            1) length() = Returns the number of charcaters in the string, for an empty string it returns 0.

            2) charAt() = Returns the character at the given index. Throws stringIndexOutOfBounds,
                          if the index is negative or >= length().
            
            3) isEmpty() => returns true when string length() is 0.

            4) isBlank() => returns true when the string is blank, ie only whitespaces.
        */

        // Example program of Group A : 

        // 1) length

        String message = "Hello";

        System.out.println(message.length()); // 5
        System.out.println("".length()); // 0 (returns zero when string is empty)

        // 2) charAt()

        String name = "Swaroop";

        System.out.println(name.charAt(6)); // p
        // System.out.println(name.charAt(8)); // StringIndexOutOfBounds Error !

        for(int index = 0; index < name.length(); index = index + 1)
        {
            System.out.print(name.charAt(index) + " "); // standard traversal loop
        }

        // 3) isEmpty() and isBlank()

        System.out.println("".isEmpty()); // returns true as string is empty.
        System.out.println("  ".isEmpty()); // returns False as String has 2 blank Spaces.
        System.out.println("  ".isBlank()); // returns true as there is no char in the string only blank spaces.
        System.out.println("s".isEmpty()); // returns false as there is charcter in the string.
        System.out.println("s ".isBlank()); // returns false as there is char in the string.

        // Group B -> Extracting parts of the string

        /* 
            1) substring() = Returns the part of the string from begin (inclusive) upto end (exclusive).

            2) indexOf() and lastindexOf() = indexOf() returns the index of first Occurance of given char.
                                             lastindexOf() returns the index of last Occurance of given char.

                                             both method returns -1 if char is not found.

            3) contains(), startWith(), endsWith() = These methods checks whether the string contains the given piece of text.

            4) toCharArray = converts the strings to new char array.

        */

        // Example Program of Group B

        // 1) substring()

        String messageV1 = "HelloWorld";

        System.out.println(messageV1.substring(0 , 5)); // begin : 0 and // end : 5 o/p : Hello
        System.out.println(messageV1.substring(5, 10)); // begin : 5 and // end : 10 o/p : world
        System.out.println(messageV1.substring(1)); // begin : 1 // o/p : elloWorld
        // System.out.println(messageV1.substring(12)); StringIndexOutOfBounds Error !

        // 2) indexOf() and lastIndexOf()

        String fruit = "banana";

        System.out.println(fruit.indexOf('b')); // 0
        System.out.println(fruit.indexOf('b', 4)); 
        // start search from index 4 we get -1 no b char after index 4

        System.out.println(fruit.lastIndexOf('a')); // give last occurance of a in word banana ie 5

        System.out.println(fruit.lastIndexOf("an")); // 3

        // 3) contains(), startsWith(), endsWith()

        String word = "interview";

        System.out.println(word.contains("inter")); // contain the word inter -> true
        System.out.println(word.contains("Swa")); // does not contain word Swa -> false

        System.out.println(word.startsWith("inter")); // word starts with inter -> true
        System.out.println(word.startsWith("InTer")); // word does not start with InTer -> false

        System.out.println(word.endsWith("view")); // word ends with view -> true
        System.out.println(word.endsWith("SVN")); // word does not end with SVN -> false

        // 4) toCharArray()

        char [] wordV1 = word.toCharArray();

        wordV1[0] = 'S';

        System.out.println(Arrays.toString(wordV1));

        // Group C - Comparing the Strings

        /* 

            1) equals() and equalsIgnoreCase() = equals() case checks the exact content with case sensitivity.
                                    = equalsIgnoreCase() case checks the content without case sensitivity.

            2) compareTo() and compareToIgnoreCase() = 
                
                compareTo() = Compares two string lexicographically. considering even case - sensitivity

                Lexicographically means comparing the strings in dictionary order.

                compareToIgnoreCase() = compares two string lexicographically, does not consider case - sensitivity


        */

        // Examples program of Group C

        // 1) equals() and equalsToIgnoreCase()
        
        System.out.println("java".equals("Java")); // false
        System.out.println("java".equals("java")); // true

        System.out.println("Java".equalsIgnoreCase("java")); // true

        String x = null;
        // System.out.println(x.equalsIgnoreCase("java"));  Null Pointer Exception
        // System.out.println(x.equals("java"));  Null Pointer Exception

        // 2)  compareTo() and compareToIgnoreCase()

        System.out.println("apple".compareTo("banana")); // -1 
        System.out.println("banana".compareTo("apple")); // 1
        System.out.println("apple".compareTo("apple")); // 0

        System.out.println("app".compareTo("apple")); // -2
        System.out.println("Swaroop".compareTo("swaroop")); // -32

        System.out.println("Swaroop".compareToIgnoreCase("swaroop")); // 0

        // Group D - Changing / Transforming (always returns new string)

        /*  
        
            1) toUpperCase() and toLowerCase() = returns a string with letters converted, with non - letters stay as they are.

            2) trim() and strip() = trim() handles basic whitespaces, 
                                    strip() handles unicode whitespaces, was introduced in java 11.

            3) replace() and replaceAll() = replace() a character with another Character()
                                            replaceAll() replaces all matching text using Regular Expression.

            replace(oldchar, newchar)
            replaceAll(old String, newString)

            regular Expression (REGEX) = it is a pattern that we create to identify particular characters or group of characters.

            4) concat() and the + operator = joins two Strings and returns new String
                                          '+' : operator is more flexible converts numbers and chars to text.
            
            5) repeat() = Returns the String repeated count times. count must not be negative.
        */

        // Example program of Group D 

        // 1) toUpperCase() and toLowerCase()

        String wordV4 = "Hello World 777";

        System.out.println(wordV4.toUpperCase()); // HELLO WORLD 123

        System.out.println(wordV4.toLowerCase()); // hello world 123

        System.out.println(wordV4); // orginal string remain unchanged cause strings are immutable

        // 2) trim() and strip() 

        String wordV7 = "   hello world    ";

        System.out.println("[" + wordV7 + "]");
        System.out.println("[" + wordV7.trim() + "]");
        System.out.println("[" + wordV7.strip() + "]");

        // 3) replace() and replaceAll()

        System.out.println("banana".replace('a', 'o')); // bonono
        System.out.println("banana".replace("an", "AN")); // bANANa

        System.out.println("a1b2c3".replaceAll("[0-9]", "")); // abc

        System.out.println("abc   ".replace(' ', '*')); // abc****

        // 4) concat() and the + operator

        String WordAA = "Hello"; String WordBB = "World";

        System.out.println(WordAA.concat(WordBB)); // HelloWorld
        System.out.println(WordAA.concat(" ").concat(WordBB)); // Hello World
        System.out.println("Score : " + 95); // Score : 95

        System.out.println(1 + 2 + 'A'); // 1 + 2 = 3 + A(65) => 68 (in case of char ascii value get added)

        System.out.println(1 + 2 + "A"); // 1 + 2 = 3 => 3A (in case of string numbers get add and string get concat)

        // 5) repeat()

        System.out.println("Swaroop".repeat(5)); // SwaroopSwaroopSwaroopSwaroopSwaroop -> 5 times

        System.out.println("->".repeat(10)); // ->->->->->->->->->->

        System.out.println("X".repeat(0).isEmpty()); // true

        // System.out.println("S".repeat(-1)); illegalArgumentException

        
    }

}
