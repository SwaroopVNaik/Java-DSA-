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
                evenCount = evenCount + 1;
            }
            else
            {
                oddCount = oddCount + 1;
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
        double average = 0;

        int index = 0;
        while(index < nums.length)
        {
            // Sum of the numbers
            sum = sum + nums[index];

            index = index + 1;
        }

        average = (double) sum / nums.length;

        return average;
    }

    static int[] getNumbersAboveFiftyBelowHunderd(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return new int[]{-1};
        }

        int count = 0;

        for(int index = 0; index < nums.length; index = index + 1)
        {
            if(nums[index] > 50 && nums[index] < 100)
            {
                count = count + 1;
            }
        }

        int updatedNum [] = new int[count];
        int resultIndex = 0;

        for(int index = 0; index < nums.length; index = index + 1)
        {
            if(nums[index] > 50 && nums[index] < 100)
            {
                updatedNum[resultIndex] = nums[index];
                resultIndex = resultIndex + 1;
            }
        }

        return updatedNum;
    }

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

    static int getNumberOfStudentsPassed(int [] nums)
    {
        // testCases
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int studentsPassedCount = 0;
        int index = 0;

        while(index < nums.length)
        {
            if(nums[index] >= 35)
            {
                studentsPassedCount = studentsPassedCount + 1;
            }

            index = index + 1;
        }

        return studentsPassedCount;
    }

    int getSumOfNumbersAtPosition(int [] nums)
    {
        // edge cases
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int sum = 0;
        int index = 0;

        while(index < nums.length)
        {
                if(index % 2 == 0)
                {
                    sum = sum + nums[index];
                }

            index = index + 1;
        }

        return sum;
    }

    static int getHotterDaysInAWeek(int [] nums)
    {
        if(nums == null || nums.length == 0 || nums.length == 1)
        {
            return -1;
        }

        int previousDay = 0;
        int currentDay = 1;
        int count = 0;

        while(previousDay <  nums.length - 1 && currentDay < nums.length)
        {
            if(nums[currentDay] > nums[previousDay])
            {
                count = count + 1;
            }

            previousDay = previousDay + 1;
            currentDay = currentDay + 1;
        }

        return count;
    }

    static int[] getDoubledOddNumberAndHalvedEvenNumbers(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return new int[]{-1};
        }

        int [] newArray = new int[nums.length];
        int newIndex = 0;

        int index = 0;
        while(index < nums.length)
        {
            if(nums[index] % 2 == 0)
            {
                newArray[newIndex] = nums[index] / 2;
                newIndex = newIndex + 1;
            }

            if(nums[index] % 2 != 0)
            {
                newArray[newIndex] = nums[index] * 2;
                newIndex = newIndex + 1;
            }

            index = index + 1;
        }

        return newArray;

    }

    static int getNumberOfNumberDivisibleByThreeAndFive(int nums [])
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int numberCounter = 0;

        int index = 0;
        while(index < nums.length)
        {
            if(nums[index] % 3 == 0 && nums[index] % 5 == 0)
            {
                numberCounter = numberCounter + 1;
            }

            index = index + 1;
        }

        return numberCounter;
    }

    static int [] getTheDaysWithMoreNumberOfSteps(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return new int[]{-1};
        }

        int moreNumberSteps = 0;
        int count = 0;

        int index = 0;

        while(index < nums.length)
        {
            if(nums[index] >= 10000)
            {
                count = count + 1;
            }

            if(nums[index] > moreNumberSteps)
            {
                moreNumberSteps = nums[index];
            }

            index = index + 1;
        }
        return new int[]{count, moreNumberSteps};
    }

    static int[] getNonNegativeArray(int nums[])
    {
        if(nums == null || nums.length == 0)
        {
            return new int[]{-1};
        }

        int index = 0;

        while(index < nums.length)
        {
            if(nums[index] < 0)
            {
                nums[index] = 0;
            }

            index = index + 1;
        }

        return nums;
    }

    static Boolean checkIfArrayIsInIncreasingOrder(int [] nums)
    {
        Boolean Increase = false;

        if(nums == null || nums.length == 0 || nums.length == 1)
        {
            return false;
        }

        int index = 0;
        int nextIndex = 1;
        while(index < nums.length - 1 && nextIndex < nums.length)
        {
            if(nums[nextIndex] > nums[index])
            {
                Increase = true;
            }

            if(nums[nextIndex] == nums[index])
            {
                Increase = false;
                break;
            }

            if(nums[nextIndex] < nums[index])
            {
                Increase = false;
                break;
            }

            index = index + 1;
            nextIndex = nextIndex + 1;
        }

        return Increase;

    }

    static int getclosestToAverage(int arr[])
    {
        if(arr == null || arr.length == 0)
        {
            return -1;
        }

        double avg = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        avg = (double) sum  / arr.length;

        int closest = arr[0];
        double minDistance = closest - avg;

        if (minDistance < 0)
        {
            minDistance = -minDistance;
        }

        for (int i = 0; i < arr.length; i++)
        {
            double difference = arr[i] - avg;

            if (difference < 0)
            {
                difference = -difference;
            }

            if (difference < minDistance)
            {
                minDistance = difference;
                closest = arr[i];
            }
        }
        return closest;
    }

    static int getNumberOfStudentsPassedV2(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int studentCount = 0;
        int index = 0;
        while (index < nums.length ) 
        {
            if(nums[index] >= 35 )
            {
                studentCount = studentCount + 1;
            }

            index = index + 1;

        }

        return studentCount;
    }

    static int sumOfFirstandLastPosition(int [] nums)
    {
        if(nums == null || nums.length == 0 || nums.length == 1)
        {
            return -1;
        }

        int firstPosition = nums[0];
        int lastPosition = nums[nums.length - 1];

        // edge case if value is negative converting it to positive
        if(firstPosition < 0)
        {
            firstPosition = firstPosition * -1;
        }

        if(lastPosition < 0)
        {
            lastPosition = lastPosition * -1;
        }

        int result = firstPosition + lastPosition;

        return result;
    }

    static void printingArray(int [] nums)
    {
        System.out.print("[ ");
        for(int index = 0; index < nums.length; index = index + 1)
        {
            System.out.print(nums[index]);

            if(index < nums.length - 1)
            {
                System.out.print(" , ");
            }
        }
        System.out.print( " ]");
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
        // printingArray(arrayv2);

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

        // int result = getDifferenceFromMaxAndMin(array);

        // System.out.println("The difference is : " + result);

        // -------------------------------- Method 5 ----------------------------------------

        // System.out.println("Number of Students Passed : " + getNumberOfStudentsPassed(array));
        
        // ------------------------------- Method 6 -----------------------------------------

        // ArraysProblemOne obj = new ArraysProblemOne();

        // System.out.println("The Sum is : " + obj.getSumOfNumbersAtPosition(array));

        // ------------------------------- Method 7 -----------------------------------------

        // System.out.println("The Number of days Hot : " + getHotterDaysInAWeek(array));

        // ------------------------------- Method 8 -----------------------------------------

        // int [] result = getDoubledOddNumberAndHalvedEvenNumbers(array);
        // printingArray(result);

        // ------------------------------- Method 9 -----------------------------------------

        // System.out.println("result : " + getNumberOfNumberDivisibleByThreeAndFive(array));

        // ------------------------------- Method 11 -----------------------------------------

        // int result[] = getTheDaysWithMoreNumberOfSteps(array);
        // printingArray(result);

        // ------------------------------ Method 10 ------------------------------------------

        // int result = getclosestToAverage(array);
        // System.out.println(result);

        // ------------------------------- Method 12 -----------------------------------------

        // int result [] = getNonNegativeArray(array);
        // printingArray(result);

        // ------------------------------- Method 12 -----------------------------------------

        // Boolean result = checkIfArrayIsInIncreasingOrder(array);
        // System.out.println("Array In Increasing Order : " + result);

        // ------------------------------- Method 13 -----------------------------------------

        int result = sumOfFirstandLastPosition(array);
        System.out.println("The sum of last and first is : " + result);

        // extra problem

        // int result = getNumberOfStudentsPassed(array);
        // System.out.println("Number of Students : " + result);

    scanner.close();
    }
    
}