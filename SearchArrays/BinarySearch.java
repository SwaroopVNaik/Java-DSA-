package SearchArrays;
import java.util.Scanner;

public class BinarySearch {

    public static int getBinarySearch(int values[], int target)
    {
        // testCase 1 
        if(values == null)
        {
            return -1;
        }

        // testCase 2
        if(values.length == 0)
        {
            return -1;
        }

        // Binary Search Logic

        int leftIndex = 0;
        int rightIndex = values.length - 1;
        int midIndex = 0;

        while(leftIndex <= rightIndex)
        {
            midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            // condition 1
            if(values[midIndex] == target)
            {
                return midIndex;
            }

            // conditon 2
            if(values[midIndex] > target)
            {
                rightIndex = midIndex - 1;
            }

            // condtion 3
            if(values[midIndex] < target)
            {
                leftIndex = midIndex + 1;
            }

        }

        return midIndex;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();

        int array [] = new int[size];

        // In Binary Search always we should have sorted array
        System.out.print("Enter the elements in sorted format for performing binary search : ");

        for(int index = 0; index < array.length; index = index + 1)
        {
            array[index] = scanner.nextInt();
        }

        System.out.println("Enter the Target : ");
        int target = scanner.nextInt();

        System.out.println("The Target is at Position : " + getBinarySearch(array, target));

        scanner.close();

    }

}
