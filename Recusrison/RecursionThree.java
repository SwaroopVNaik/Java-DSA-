package Recusrison;

public class RecursionThree {

    static void print(int i)
    {
        if(i > 5)
        {
            return;
        }
        System.out.println(i);
        print(i + 1);
    }

     // Print n to 1 using recursion
    static void printV1(int i)
    {
        if(i > 0)
        {
            System.out.print(i + " ");
            printV1(i - 1);
        }
    }

    // 2) count function calls
    static int functionCallsCounter = 0;
    static int printFunctionCalls(int n)
    {
        if(n > 0)
        {
            functionCallsCounter = functionCallsCounter + 1;
            printFunctionCalls(n - 1);
        }

        return functionCallsCounter;
    }

    // 3) sum of n numbers 
    static int sum = 0;
    static int printSumOfNumbers(int n)
    {
        if(n > 0)
        {
            sum = sum + n;
            printSumOfNumbers(n - 1);
        }

        return sum;
    }

    // 4) Factorial
    static int FactorialNumber = 1;
    static int printFactorial(int number)
    {
        if(number > 0)
        {
            FactorialNumber = FactorialNumber * number;
            printFactorial(number - 1);
        }

        return FactorialNumber;
    }

    // 5) Power Of Numbers
    static int result = 1;
    static int printPowerOfNumber(int base, int power)
    {
        if(power > 0)
        {
            result = result * base;
            printPowerOfNumber(base, power - 1);
        }

        return result;
    }

    static int lastDigit = 0;
    static int sumv1 = 0;
    static int printSumOfDigits(int number)
    {
        if(number > 0)
        {
            // getting last Digit
            lastDigit = number % 10;

            // Adding the Digits
            sum = sum + lastDigit;

            // Updating / removing the value from number after finding the sum
            printSumOfDigits(number / 10);

        }

        return sum;
    }

    // 7) Reverse a number
    static int lastDigitV2 = 0;
    static int reverseNumber = 0;

    static int getReverseNumber(int number)
    {
        if(number > 0)
        {
            // Get the last digit from the end
            lastDigitV2 = number % 10;

            // Storing that last Digit
            reverseNumber = reverseNumber * 10 + lastDigitV2;

            // Update the number
            getReverseNumber(number / 10);
        }

        return reverseNumber;
    }

    // Given n = 5, print the numbers in this order.
    static void printNumberBackwardandReverse(int number)
    {
        if(number >= 0)
        {
            System.out.print(number +  " ");

            printNumberBackwardandReverse(number - 1);

            if(number > 0)
            {
                System.out.print(number + " ");
            }
        }
    }

    static boolean status = true;
    static boolean checkIfTheWordIsPalindrome(char [] letters, int index, int indexv2)
    {
        if(index < letters.length && indexv2 >= 0 )
        {
            if(letters[index] == letters[indexv2])
            {
                status = true;
            }
            else
            {
                status = false;
            }

            checkIfTheWordIsPalindrome(letters, index + 1, indexv2 - 1);

        }
    
        return status;
    }

    static int largestNumber = 0;
    static int getTheLargest(int [] number, int index)
    {
        if(index < number.length)
        {
            if(number[index] > largestNumber)
            {
                largestNumber = number[index];
            }

            getTheLargest(number, index + 1);
        }

        return largestNumber;
    }

    static int duplicateCount = 0;
    static int getCountOfDuplicateCharecters(char [] letters, int index)
    {
        if(index < letters.length)
        {
            if(letters[index] == 'a' || letters[index] == 'A')
            {
                duplicateCount = duplicateCount + 1;
            }

            getCountOfDuplicateCharecters(letters, index + 1);
        }

        return duplicateCount;
    }

    static boolean statusv2 = true;
    static boolean checkIfTheArrayIsInAscendingOrder(int [] numbers, int index)
    {
        if(index < numbers.length - 1 && index + 1 < numbers.length)
        {
            if(numbers[index] < numbers[index + 1] && statusv2 == true)
            {
                statusv2 = true;
            }
            else 
            {
                statusv2 = false;
            }

            checkIfTheArrayIsInAscendingOrder(numbers, index + 1);
        }

        return statusv2;
    }

    static int letterCount = 0;
 
    static char [] removeSpecificCharcater(char [] letters, 
                                            char removeletter, 
                                            int index)
    {
        if(index < letters.length)
        {
            if(letters[index] != removeletter)
            {
                letterCount = letterCount + 1;
           }

            removeSpecificCharcater(letters, removeletter, index + 1);

        }

        char [] updatedArray = new char[letterCount];

        index = 0;
        return getFinalArrayOfRemovedSpecificCharacter(removeletter, updatedArray, letters, index, index);
    }

    static char [] getFinalArrayOfRemovedSpecificCharacter(char removeletter ,
                                                            char [] updatedArray, 
                                                            char [] letters, 
                                                            int index, 
                                                            int newIndex)
    {
        if(index < letters.length)
        {
            if(letters[index] != removeletter)
            {
                updatedArray[newIndex] = letters[index];
                newIndex = newIndex + 1;
            }

            getFinalArrayOfRemovedSpecificCharacter(removeletter, updatedArray, letters, index + 1, newIndex);
        }

        return updatedArray;
    }

    public static void main(String[] args) 
    {
        // print(1);

        // Print n to 1 using recursion
        // printV1(100);

        // 2) count function calls
        // int result = printFunctionCalls(10);
        // System.out.println(result);

        // 3) sum of n numbers
        // int result = printSumOfNumbers(10);
        // System.out.println(result);

        // 4) Get Factorial
        // int result = printFactorial(5);
        // System.out.println(result);

        // 5)Power Of Numbers
        // int result = printPowerOfNumber(2, 5);
        // System.out.println(result);

        // 6) Sum Of digits
        // int result = printSumOfDigits(121);
        // System.out.println(result);

        // 7) Reverse a number
        // int result = getReverseNumber(123);
        // System.out.println(result);

        // 8) print numbers in different order
        // printNumberBackwardandReverse(5);

        // 9)Check Weather the String is palindrome
        // char letters [] = {'m', 'a', 'd', 'a', 'm'};
        // char letters [] = {'s', 'w', 'a', 'r', 'o', 'o', 'p'};
        // int index = 0;
        // int indexv2 = letters.length - 1;
        // System.out.println(checkIfTheWordIsPalindrome(letters, index, indexv2));

        // 10) find the largest Elemenet in the array
        // int [] numbers = {12, 500, 7, 89, 34, 21};
        // int index = 0;
        // System.out.println(getTheLargest(numbers, index));

        // 11) count occurance of the Character
        // char [] letters = {'a','b','a','c','a','d','b', 'a'};
        // int index = 0;
        // System.out.println(getCountOfDuplicateCharecters(letters, index));

        // 12) Check weather an array is sorted
        // int [] numbers = {3, 8, 12, 19, 25, 31};
        // int [] numbers = {3, 8, 12, 7, 25, 31};
        // int index = 0;
        // System.out.println(checkIfTheArrayIsInAscendingOrder(numbers, index)); 

        // 13) Remove Specific Character
        char [] letters = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        int index = 0;
        char removeletter = 'r';
        removeSpecificCharcater(letters, removeletter, index);
        char [] result = getFinalArrayOfRemovedSpecificCharacter(removeletter, letters, letters, index, index);

        while (index < result.length) 
        {
            System.out.print(result[index] + " ");

            index = index + 1;
        }
    }

}
