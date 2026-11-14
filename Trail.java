import java.lang.classfile.instruction.ConvertInstruction;
import java.util.*;
public class Trail {

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
        char [] array = {'J', 'a', 'v', 'a'};

        // array[array.length - 1] = 'P'; // mutable 

        // for(char c : array)
        // {
        //     System.out.print(c + " ");
        // }

        // for(int index = array.length - 1; index >= 0; index = index - 1)
        // {
        //     System.out.println(array[index]);
        // }

        // System.out.println(array);
        // System.out.println("Name : " + array);

        // System.out.println(Arrays.toString(array));

        // System.out.println(String.valueOf(array));

        // System.out.println("Name : " + String.valueOf(array));

        convertingbetweencharandstring();

        changeValues();

        // Arrays fill method
        char [] arr = new char[5];
        Arrays.fill(arr, '*');

        System.out.println(arr);

        Arrays.fill(arr, 1, 3, '#');

        System.out.println(arr);
    }
    
}
