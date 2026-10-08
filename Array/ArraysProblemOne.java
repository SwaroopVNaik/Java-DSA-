import java.util.*;

public class ArraysProblemOne 
{

    static int[] getCountOfOddOrEven(int [] nums)
    {
        // Test Cases
        if(nums == null || nums.length == 0)
        {
            return new int[]{-1};
        }

        int oddCount = 0;
        int evenCount = 0;

        for(int index = 0; index < nums.length; index = index + 1)
        {
            // Even Case 
            if(nums[index] % 2 == 0)
            {
                oddCount = oddCount + 1;
            }
            else
            {
                evenCount = evenCount + 1;
            }
        }

        return new int[]{oddCount, evenCount};
    }

    static double getAverageOfMarks(int [] nums)
    {

        // Test Cases
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int sum = 0;
        int average = 0;

        int index = 0;
        while(index < nums.length)
        {
            // Sum of the numbers
            sum = sum + nums[index];

            index = index + 1;
        }

        average = sum / nums.length;

        return average;
    }

    // static int[] getNumbersAboveFiftyBelowHunderd(int [] nums)
    // {
    //     if(nums == null || nums.length == 0)
    //     {
    //         return new int[]{-1};
    //     }

    //     int count = 0;

    //     for(int index = 0; index < nums.length; index = index + 1)
    //     {
    //         if(nums[index] > 50 && nums[index] < 100)
    //         {
    //             count = count + 1;
    //         }
    //     }

    //     int array[] = new int[count];

    //     // pending
    // }

    static int getDifferenceFromMaxAndMin(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int max = nums[0];
        int min = nums[0];
        int index = 0;

        while(index < nums.length)
        {
            if(nums[index] > max)
            {
                max = nums[index];
            }
            else if(nums[index] < max && nums[index] < min)
            {
                min = nums[index];
            }

            index = index + 1;
        }

        return max - min;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int array [] = new int[size];

        // Input validation
        if(size > 0)
        {

            System.out.println("Enter the Elements of the Array : ");

            for(int index = 0; index < array.length; index = index + 1 )
            {
                array[index] = scanner.nextInt();
            }

        }

        // ------------------------------ Method 1 --------------------------------------

        // int [] arrayv2 = getCountOfOddOrEven(array);

        // System.out.print("[ ");
        // for(int indexv2 = 0; indexv2 < arrayv2.length; indexv2 = indexv2 + 1)
        // {
        //     System.out.print(arrayv2[indexv2]);

        //     if(indexv2 < arrayv2.length - 1)
        //     {
        //         System.out.print(" , ");
        //     }
        // }
        // System.out.print( " ]");

        // ------------------------------- Method 2 ---------------------------------------

        // double result = getAverageOfMarks(array);

        // if(result == -1)
        // {
        //     System.out.println("Please check the array length or check weather array is created");
        // }
        // else
        // {
        //     System.out.println("The Average is : " + result);
        // }

        // ------------------------------- Method 3 ----------------------------------------

        // int [] arrayv3 = getNumbersAboveFiftyBelowHunderd(array);

        // System.out.print("[ ");
        // for(int index = 0; index < arrayv3.length; index = index + 1)
        // {
        //     System.out.print(arrayv3[index]);

        //     if(index < arrayv3.length - 1)
        //     {
        //         System.out.print(",");
        //     }
        // }
        // System.out.print(" ]");

        // --------------------------------- Method 4 --------------------------------------

        int result = getDifferenceFromMaxAndMin(array);

        System.out.println("The difference is : " + result);

        // -------------------------------- Method 5 ----------------------------------------

        

        

    scanner.close();
    }
    
}