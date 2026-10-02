package LinearSearch;

import java.util.*;

public class LinearSearch {

    public static void linearsearch(int values[], int key)
    {
        Boolean found = false; // key not found (key is searching element)

        for(int index = 0; index <= values.length; index = index + 1)
        {
            if(key == values[index])
            {
                System.out.println(key + " is Found at position : " + index);
                found = true;
                break;
            }

        }

        if(found == false)
        {
            System.out.println("Key is not found : " + key);
        }

    }

    public static int linearsearchV2(int values[], int keyv2)
    {
        for(int index = 0; index <= values.length - 1; index = index + 1)
        {

            if(keyv2 == values[index])
            {
                return 1;
            }
        }

        return - 1;

    }

    public static void main(String[] args) {

        int array[] = {10, 20 , 30, 40, 50};
        int key = 40;

        linearsearch(array, key);

        // using Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array Size");
        int size = scanner.nextInt();

        int arrayv2 [] = new int[size];

        System.out.println("Enter the Elements of the array : ");

        for(int index = 0; index <= arrayv2.length - 1; index = index + 1)
        {

            arrayv2[index] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Enter the Key : ");
        int keyv2 = scanner.nextInt();

        int result = linearsearchV2(arrayv2, keyv2);

        if(result == 1)
        {
            System.out.println( keyv2 + " is found");
        }
        else
        {
            System.out.println(keyv2 + " is not found");
        }

        scanner.close(); 
    }
}
