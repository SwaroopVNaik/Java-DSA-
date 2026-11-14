public class StringsNotes{

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