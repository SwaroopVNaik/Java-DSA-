import java.util.Arrays;
import java.util.Scanner;

public class StringsNotes
{

    static void demo()
    {
        // Task 1 = create char array size 5;
        // don't initialise the values leave as it is
        // print default values

        char ch [] = new char[5];
        System.out.println("Demo one Declatration : ");
        for(int index = 0; index < ch.length; index = index + 1)
        {
            System.out.println((int) ch[index] + " ");
        }

        System.out.println();

    }

    static void demo2()
    {
        // T2 = create and initialise the char Array
        // print those char

        char ch [] = {'S', 'W', 'A', 'R', 'O', 'O', 'P'};
        System.out.println("Demo Two Declaration :");
        for(int index = 0; index < ch.length ; index = index + 1)
        {
            System.out.println(ch[index]);
        }
        System.out.println();

    }

    static void demo3()
    {
        // T3 = Find length of char array
        // create and get the length

        char ch[] = {'S', 'W', 'A', 'R', 'O', 'O', 'P'};
        System.out.println("Demo Three Declaration : ");
        
        System.out.println(ch.length);
    }

    static void demo4()
    {
        // T4 = Demonstrate ASCII values stored as characters
        // char[] temp = { 65, 66 , 67, 68 };
        //print temp[i]

        char ch [] = {65, 66, 67, 68};
        System.out.println("Demo Four ASCII :");

        for(int index = 0; index < ch.length; index = index + 1)
        {
            System.out.println(ch[index] + " ");
        }

        System.out.println();

    }

    static void demo5()
    {
        // Demonstrate Partial initialization
        // declare array of size 5
        // put values only int 0th and 1st index
        // print {'a','b',0,0,0};

        char ch [] = new char[5];
        ch[0] = 'A';
        ch[1] = 'B';

        System.out.println("Demo 5 partial Declaration");
        for(int index = 0; index < ch.length; index = index + 1)
        {
            System.out.println(ch[index]);
        }
    }

    static void printCharArrayAsString()
    {
        char [] name = {'S', 'V', 'N'};

        // prints array as text
        System.out.println(name);
    }

    static void printArrayWithoutLoops()
    {
        int [] num = {'1', '2', '3'};
        System.out.println(num);
    }

    static void printEmojilength()
    {
        // uniform transform code 
        // The Emoji length give 2 => no of UTF - 16 code is printed

        // UTF -> 8 : every english letter ASSCII 

        // 1 char value = 2 bytes (16)
        // 1 emoji  = 4 bytes (32)
        String emoji = "🔥";
        System.out.println("length of emoji : " + emoji.length());
    }

    static void printingTheUserInputV1()
    {
        // getting the input form user single character Each time and storing in the array each interation 
        Scanner scanner = new Scanner(System.in);

        char [] message = new char[5];

        System.out.println("Enter the message : " );

        for(int index = 0; index < message.length; index = index + 1)
        {
            message[index] = scanner.next().charAt(0);
        }

        System.out.println("message : " +  String.valueOf(message));

        scanner.close();
    }

    static void printingTheUserInputV2()
    {
        Scanner scanner = new Scanner(System.in);

        // getting the input from the user at once as String and stroing it in an array as character 

        System.out.println("Enter the message : ");

        String MSG = scanner.next();

        char [] Message = MSG.toCharArray();

        System.out.println("Message : " + String.valueOf(Message));

        scanner.close();
    }

    static void printingTheUserInputV3()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Message : ");

        String MSG = scanner.next();

        char [] message = new char[MSG.length()];

        for(int index = 0; index < message.length; index = index + 1)
        {
            message[index] = MSG.charAt(index);
        }

        System.out.println("Message : " + String.valueOf(message));

        scanner.close();
    }

    static void convertingbetweencharandstring()
    {
        char [] word = {'S', 'W', 'A', 'R', 'O', 'O', 'P'};

        String name = "SWAROOP.V.Naik";

        // String To char
        System.out.println("Converting The String : "+ name + " : To char");
        char [] message = name.toCharArray();
        for(char letter : message)
        {
            System.out.print(letter + " ");
        }

        // char to string

        System.out.println("\nconverting char to string : ");
        System.out.println(String.valueOf(message));

        // Part of char to string
        System.out.println("\nPrinting part of char to string : ");
        System.out.println(String.valueOf(word, 0 , 6));
    }

    static void changeValues()
    {
        String name = "swaroop";

        char [] newname = name.toCharArray();

        newname[0] = 'p';

        System.out.println(Arrays.toString(newname));

        // string value does not change so it is immutable !
        System.out.println(name);
    }



    public static void main(String[] args) 
    {
        // demo();
        // demo2();
        // demo3();
        // demo4();
        // demo5();

        printCharArrayAsString();

        // String also prints Text as Object
        String name = "Swaroop.V.Naik";

        System.out.println(name);

        printArrayWithoutLoops();

        printEmojilength();

    }

}