import java.util.*;

public class Assignment
{

    int getLargestElement(int [] values)
    {
        System.out.println();

        int largestValue = values[0];

        int index = 0;
        while(index <= values.length - 1)
        {
            if(values[index] > largestValue)
            {
                largestValue = values[index];
            }

            index = index + 1;
        }

        return largestValue;

    }

    int getSmallestElement(int [] values)
    {
        System.out.println();

        int smallestValue = values[0];

        int index = 0;
        while(index <= values.length - 1)
        {
            if(values[index] < smallestValue)
            {
                smallestValue = values[index];
            }

            index = index + 1;

        }

        return smallestValue;
    }

    int getSecondLargestElement(int [] values)
    {
        System.out.println();

        int largestValue = values[0];
        int secondLargest = values[1];

        int index = 0;

        while(index <= values.length - 1)
        {
         
            if(values[index] > largestValue)
            {
                secondLargest = largestValue;
                largestValue = values[index];
            }
            else if(values[index] > secondLargest && values[index] != largestValue)
            {
                secondLargest = values[index];
            }
            
            index = index + 1;

        }
        return secondLargest;
    }

    void ReverseArray(int [] values)
    {
        System.out.println();
        System.out.println("Reversing Array ");

        int index = values.length - 1;
        while(index <= values.length - 1 && index >= 0)
        {
            System.out.print(values[index]);

            if(index > 0)
            {
                System.out.print(" -> ");
            }


            index = index - 1;
        }
    }

    void searchElement(int [] values)
    {
        System.out.println();
        int key = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter the key : ");
        key = scanner.nextInt();

        int index = 0;
        while(index <= values.length - 1)
        {
            if(key == values[index])
            {
                System.out.println(key + " is found at Position " + index);
                break;
            }
            else if(index == values.length - 1)
            {
                System.out.println(key + " key is not Found");
            }
            index = index + 1;
        }
        scanner.close();
    }

    void removeDuplicateValues(int [] values)
    {
        
    }

    void countOfRepeatedNumber(int [] values)
    {
        int firstIndex = 0;
        int count = 1;
        int secondIndex = 1;

        while(firstIndex <= values.length - 1)
        {
            secondIndex = 1;
            while(secondIndex < values.length)
            {

                if(values[secondIndex] == values[firstIndex])
                {
                    count = count + 1;
                }
                secondIndex = secondIndex + 1;
            }

            System.out.println(values[secondIndex] + " is Repeated : " + count);

            firstIndex = firstIndex + 1;

        }
    }



    public static void main(String[] args)
    {

        int arrayV1 [] = {42, 17, 89, 42, 63, 89, 5, 76, 31, 63, 94, 17, 94, 28, 76};

        int arrayV2 [] = {10, 20, 30, 40, 50};

        int arrayV3 [] = {10, 20, 10, 30, 20, 10};

        Assignment obj = new Assignment();

        // Level 1 : 

        // Printing Largest Value :
        // System.out.println("Largest Value is : " + obj.getLargestElement(arrayV1));

        // // Printing Smallest Value :
        // System.out.println("Smallest Value is : " + obj.getSmallestElement(arrayV1));

        // // Printing Second Largest Value :
        // System.out.println("Second Largest Value is : " + obj.getSecondLargestElement(arrayV1));

        // // Reversing Array
        // obj.ReverseArray(arrayV2);

        // // Searching the key Element
        // obj.searchElement(arrayV1);

        // Level 2 : 

        // obj.removeDuplicateValues(arrayV3);

        obj.countOfRepeatedNumber(arrayV3);




    }

}
