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
        int result = getReverseNumber(123);
        System.out.println(result);


    }

}
