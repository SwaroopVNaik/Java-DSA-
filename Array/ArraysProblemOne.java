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

    static double getDiscountIfTotalAmountAboveThousand(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        double amount = 0;
        int index = 0;

        while(index < nums.length)
        {

            amount = amount + nums[index];

            index = index + 1;

        }

        double finalAmount = 0;

        if(amount > 1000)
        {
            finalAmount = amount * 0.90;
        }

        if(amount < 1000)
        {
            finalAmount = amount;
        }

        return finalAmount;
    }

    static int getcountTheNumberOfPalindrome(int [] nums)
    {
        if(nums == null ||  nums.length == 0)
        {
            return -1;
        }

        int number = 0;
        int palindromeCount = 0;
        int reversedNumber = 0;
        int lastdigit = 0;
        int index = 0;

        while(index < nums.length)
        {
            number = nums[index];

            while(number > 0)
            {
                lastdigit =  number % 10;
                reversedNumber = (reversedNumber * 10) + lastdigit;
                number = number / 10;
            }

            if(reversedNumber == nums[index])
            {
                palindromeCount = palindromeCount + 1;
            }

            reversedNumber = 0;
            lastdigit = 0;

            index = index + 1;
        }

        return palindromeCount;
    
    }

    static int[] getSumOfDigits(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return new int[]{-1};
        }

        int digit = 0;
        int sum = 0;
        int number = 0;
        int [] newArray = new int[nums.length];
        int writeIndex = 0;

        int index = 0;
        while(index < nums.length)
        {
            number = nums[index];

            // number is negative make it positive
            if(number  < 0)
            {
                number = number * -1;
            }

            while(number > 0)
            {
                digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }

            newArray[writeIndex] = sum;
            writeIndex = writeIndex + 1;

            sum = 0;
            index = index + 1;

        }

        return newArray;

    }

    static int getNumberOfTimesTheSignChanges(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int signCounter = 0;
        int index = 0;

        while(index < nums.length - 1)
        {
            if(nums[index] > 0 && nums[index + 1] < 0)
            {
                signCounter = signCounter + 1;
            }

            if(nums[index] < 0 && nums[index + 1] > 0)
            {
                signCounter = signCounter + 1;
            }

            index = index + 1;
        }

        return signCounter;
    }

    static int getTheOverWithMostRuns(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int max = 0;
        int index = 0;

        while(index < nums.length)
        {
            if(nums[index] > max)
            {
                max = index;
            }

            index = index + 1;
        }

        return max;
    }

    static int getNumberOfSubjectsRaviScoredMoreThanSita(int [] Ravi, int [] Sita)
    {
        if(Ravi == null || Ravi.length == 0)
        {
            return -1;
        }

        if(Sita == null || Sita.length == 0)
        {
            return -1;
        }

        if(Sita.length != Ravi.length)
        {
            return -1;
        }

        int GreaterMarksCounter = 0;
        int RaviIndex = 0;
        int SitaIndex = 0;

        while(RaviIndex < Ravi.length && SitaIndex < Sita.length)
        {
            if(Ravi[RaviIndex] > Sita[SitaIndex])
            {
                GreaterMarksCounter++;
            }

            RaviIndex++;
            SitaIndex++;
        }

        return GreaterMarksCounter;
    }

    static int[] getBiggerNumberInNewArray(int [] numberOne, int [] numberTwo)
    {
        if(numberOne == null || numberOne.length == 0)
        {
            return new int[]{-1};
        }

        if(numberTwo == null || numberTwo.length == 0)
        {
            return new int[]{-1};
        }

        if(numberOne.length != numberTwo.length)
        {
            return new int[]{-1};
        }

        int newArray [] = new int[numberOne.length];
        int index = 0;

        int firstIndex = 0;
        int secondIndex = 0;

        while(firstIndex < numberOne.length && secondIndex < numberTwo.length)
        {
            if(numberOne[firstIndex] > numberTwo[secondIndex])
            {
                newArray[index] = numberOne[firstIndex];
                index = index + 1;
            }

            if(numberTwo[secondIndex] > numberOne[firstIndex])
            {
                newArray[index] = numberTwo[secondIndex];
                index = index + 1;
            }

            firstIndex = firstIndex + 1;
            secondIndex = secondIndex + 1;
        }

        return newArray;
    }

    static int[] getUniqueElements(int [] numOne, int [] numTwo)
    {
        if(numOne == null || numOne.length == 0)
        {
            return new int[]{-1};
        }

        if(numTwo == null || numTwo.length == 0)
        {
            return new int[]{-1};
        }

        int Counter = 0;
        int index = 0;
        Boolean Flag = false;

        while(index < numOne.length)
        {
            int jndex = 0;
            while (jndex < numTwo.length) 
            {
                if(numOne[index] == numTwo[jndex])
                {
                    Flag = true;
                }
                
                jndex = jndex + 1;
            }

            if(Flag == false)
            {
                Counter = Counter + 1;
            }

            Flag = false;

            index = index + 1;
        }


        int [] newArray = new int[Counter];
        int writeIndex = 0;

        Boolean flag = false;
        
        index = 0;
        while(index < numOne.length)
        {
            int jndex = 0;
            while(jndex < numTwo.length)
            {
                if(numOne[index] == numTwo[jndex])
                {
                    flag = true;
                }

                jndex = jndex + 1;
            }

            if(flag == false)
            {
                newArray[writeIndex] = numOne[index];
                writeIndex = writeIndex + 1;
            }

            flag = false;

            index = index + 1;

        }

        return newArray;

    }

    static int savedCostOfShopAandShopB(int [] numsOne, int [] numsTwo)
    {
        if(numsOne == null || numsOne.length == 0)
        {
            return -1;
        }

        if(numsTwo == null || numsTwo.length == 0)
        {
            return -1;
        }

        int firstIndex = 0;
        int secondIndex = 0;
        int sum = 0;
        int minimumSum = 0;
        int saved = 0;

        while(firstIndex < numsOne.length && secondIndex < numsTwo.length)
        {
            if(numsOne[firstIndex] < numsTwo[secondIndex])
            {
                minimumSum = minimumSum + numsOne[firstIndex];
            }

            if(numsTwo[secondIndex] < numsOne[firstIndex])
            {
                minimumSum = minimumSum + numsTwo[secondIndex];
            }

            firstIndex = firstIndex + 1;
            secondIndex = secondIndex + 1;
        }

        firstIndex = 0;
        while(firstIndex < numsOne.length)
        {
            sum = sum + numsOne[firstIndex];

            firstIndex = firstIndex + 1;
        } 

        saved = sum - minimumSum;

        return saved;

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

        // int result = sumOfFirstandLastPosition(array);
        // System.out.println("The sum of last and first is : " + result);

        // ------------------------------- Method 14 -----------------------------------------

        // double result = getDiscountIfTotalAmountAboveThousand(array);
        // System.out.println("The final Amount is  : " + result);

        // ------------------------------- Method 15 -----------------------------------------

        // int result = getcountTheNumberOfPalindrome(array);
        // System.out.println("The Total Number of palindrome is : " + result);

        // ------------------------------- Method 16 -----------------------------------------

        // int [] result = getSumOfDigits(array);
        // printingArray(result);

        // ------------------------------- Method 16 -----------------------------------------

        // extra problem

        // int result = getNumberOfStudentsPassed(array);
        // System.out.println("Number of Students : " + result);

        // ------------------------------- Method 17 -----------------------------------------

        // int result = getNumberOfTimesTheSignChanges(array);
        // System.out.println("Total Number of Times Sign Changed : " + result);

        // ------------------------------- Method 18 -----------------------------------------

        // int result = getTheOverWithMostRuns(array);
        // System.out.println("Max Runs Are : " + result);

        // ------------------------------- Method 19 -----------------------------------------

        // int [] Ravi = {78, 65, 90, 55, 82};
        // int [] Sita = {70, 80, 85, 60, 82};
        // int result = getNumberOfSubjectsRaviScoredMoreThanSita(Ravi, Sita);
        // System.out.println("Number of Marks greater then Sita : " + result);

        // ------------------------------- Method 20 -----------------------------------------
    
        // int [] arrayOne = {10, 70, 50, 100, 200};
        // int [] arrayTwo = {2, 700, 49, 99, 300};

        // int result [] = getBiggerNumberInNewArray(arrayOne, arrayTwo);

        // printingArray(result);

        // ------------------------------- Method 21 -----------------------------------------

        // int [] arrayOne = {1, 4, 6, 8, 10, 90, 700, 90, 5000};
        // int [] arrayTwo = {4, 8, 12};

        // int result [] = getUniqueElements(arrayOne, arrayTwo);
        // printingArray(result);

        // ------------------------------- Method 22 -----------------------------------------

        // int ShopA [] = {100, 250, 80, 40};
        // int ShopB [] = {90, 260, 70, 45};
        // int result = savedCostOfShopAandShopB(ShopA, ShopB);

        // System.out.println("Amount Saved : " + result);

    // scanner.close();
    }
    
}
