import java.util.*;

public class ArraysProblem 
{

    static void getComparisonOfNumber(int [] array, int key)
    {
    
        // testCase 1 -> array is empty
        if(array.length == 0)
        {
            System.out.println("The Array is Empty");
            return; 
        }
        else
        {
            for(int index = 0; index < array.length; index = index + 1)
            {
                if(key > array[index])
                {
                    System.out.println(key + " > " + array[index]);
                }
                else if(key == array[index])
                {
                    System.out.println(key + " == " + array[index]);
                }
                else if(key < array[index])
                {
                    System.out.println(key + " < " + array[index]);
                }

            }
        }


    }

    static Boolean isKeyPresent(int values[], int keyv2)
    {

        if(values == null || values.length == 0)
        {
            return false;
        }

        for(int index = 0; index <= values.length - 1; index = index + 1)
        {

            if(keyv2 == values[index])
            {
                return true;
            }
        }

        return false;

    }

    static int getCountOfEvenNumbers(int values[])
    {
        if(values == null || values.length == 0)
        {
            return -1;
        }

        int index = 0;
        int count = 0;
        while(index < values.length)
        {
            if(values[index] % 2 == 0)
            {
                count = count + 1;
            }

            index = index + 1;
        }

        return count;
    }

    static double getAverageValue(int values[])
    {
        if(values == null || values.length == 0)
        {
            return -1;
        }

        int sum = 0;
        double average = 0;

        int index = 0;
        while(index < values.length)
        {
            // getting the total of all the numbers
            sum = sum + values[index];

            index = index + 1;
        }

        // gettting the average of the sum

        // values.length --> given total length of the array

        average = sum / values.length;

        return average;

    }

    static void swapElements(int values[])
    {
        if(values == null || values.length == 0)
        {
            return;
        }

        int leftIndex = 0;
        int rightIndex = values.length - 1;
        int temp = 0;

        while(leftIndex < rightIndex)
        {

            temp = values[rightIndex];
            values[rightIndex] = values[leftIndex];
            values[leftIndex] = temp;

            System.out.println("leftIndex : " + values[leftIndex] + " " + "rightIndex : " + values[rightIndex]);

            leftIndex = leftIndex + 1;
            rightIndex = rightIndex - 1;

        }
    }

    static void swapEvenElements(int values[])
    {

        // Test Cases 
        if(values == null || values.length == 0)
        {
            return; // go back to main caller
    
        }

        int index = 0;

        while(index < values.length)
        {
            if(values[index] % 2 == 0)
            {
                // even case
                values[index] = 0;
            }
            else
            {
                // odd case
                values[index] = 1;
            }

            index = index + 1;

        }

        System.out.println("\nThe Result After Swapping the Even Elements to 0 and odd ELements to 1  : ");
        
        for(int indexV1 = 0; indexV1 < values.length; indexV1 = indexV1 + 1)
        {
            System.out.print(values[indexV1] + " ");
        }

    }
public static void main(String[] args) 
{

    Scanner scanner = new Scanner(System.in);

    // ------------------------------------ Problem 1 ---------------------------------------------

    // System.out.println("Enter the Array Size : ");
    // int size = scanner.nextInt();

    // int array [] = new int[size];

    // System.out.println("Enter the Elements of the Array : ");

    // for(int index = 0; index < array.length; index = index + 1)
    // {
    //     array[index] = scanner.nextInt();
    // }

    // System.out.println("Enter the key to get comparison : ");
    // int key = scanner.nextInt();

    // getComparisonOfNumber(array, key);

    // ---------------------------- Problem 2 ---------------------------------------------------

    // System.out.println("Enter the Array Size : ");
    // int sizeV1 = scanner.nextInt();

    // int arrayV2 [] = new int[sizeV1];

    // System.out.println("Enter the Elements of the Array : ");

    // for(int index = 0; index < arrayV2.length; index = index + 1)
    // {
    //     arrayV2[index] = scanner.nextInt();
    // }

    // System.out.println("Enter the key to search : ");
    // int keyV2 = scanner.nextInt();

    // System.out.println("The Key is Present : " + isKeyPresent(arrayV2, keyV2));

    // ---------------------------------- Problem 3 -------------------------------------------------

    // System.out.println("Enter the Array Size : ");
    // int sizeV3 = scanner.nextInt();

    // int arrayV3 [] = new int[sizeV3];

    // System.out.println("Enter the Elements of the Array : ");

    // for(int index = 0; index < arrayV3.length; index = index + 1)
    // {
    //     arrayV3[index] = scanner.nextInt();
    // }

    // System.out.println("The Count of Even Numbers is : " + getCountOfEvenNumbers(arrayV3));

    // ------------------------------- problem 4 --------------------------------------------------

    // System.out.println("Enter the Array Size : ");
    // int sizeV4 = scanner.nextInt();

    // int arrayV4 [] = new int[sizeV4];

    // System.out.println("Enter the Elements of the Array : ");

    // for(int index = 0; index < arrayV4.length; index = index + 1)
    // {
    //     arrayV4[index] = scanner.nextInt();
    // }

    // System.out.println("The Average of the sum is : " + getAverageValue(arrayV4));

    // ------------------------------- problem 5 --------------------------------------------------

    // System.out.println("Enter the Array Size : ");
    // int sizeV5 = scanner.nextInt();

    // int arrayV5 [] = new int[sizeV5];

    // System.out.println("Enter the Elements of the Array : ");

    // for(int index = 0; index < arrayV5.length; index = index + 1)
    // {
    //     arrayV5[index] = scanner.nextInt();
    // }

    // swapElements(arrayV5);

    // ------------------------------------- problem 6 -------------------------------------------

    System.out.println("Enter the Array Size : ");
    int sizeV6 = scanner.nextInt();

    int arrayV6 [] = new int[sizeV6];

    System.out.println("Enter the Elements of the Array : ");

    for(int index = 0; index < arrayV6.length; index = index + 1)
    {
        arrayV6[index] = scanner.nextInt();
    }

    swapEvenElements(arrayV6);

    scanner.close();
    
    }

}
