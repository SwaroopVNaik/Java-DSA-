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

        while(leftIndex <= leftIndex)
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
        
        // In Binary Search always we should have sorted array
        int array [] = {10, 20, 30, 40, 50, 60, 70, 80, 90 ,100};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Target : ");
        int target = scanner.nextInt();

        System.out.println(getBinarySearch(array, target));

        scanner.close();

    }

}
