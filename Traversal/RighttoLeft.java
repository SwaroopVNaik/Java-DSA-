package Traversal;

public class RighttoLeft 
{
    static int getCountOfEvenNumbersFromRight(int [] numbers)
    {
        if(numbers == null || numbers.length == 0)
        {
            return 0;
        }

        int evenCounter = 0;
        int index = numbers.length - 1;
        while(index >= 0)
        {
            if(numbers[index] % 2 == 0)
            {
                evenCounter = evenCounter + 1;
            }

            index = index - 1;
        }

        return  evenCounter;
    }

    static int getFirstNegativeNumberFromRight(int [] numbers)
    {
        if(numbers == null || numbers.length == 0)
        {
            return 0;
        }

        int getfirstNegativeNumber = 0;
        int index = numbers.length - 1;
        while(index >= 0)
        {
            if(numbers[index] < 0)
            {
                getfirstNegativeNumber = numbers[index];
                break;
            }

            index = index - 1;
        }

        return getfirstNegativeNumber;

    }

    static int getLastPositveNumberFormRight(int [] numbers)
    {
        if(numbers == null || numbers.length == 0)
        {
            return 0;
        }

        int getLastPositveNumber = 0;
        int index = numbers.length - 1;
        while(index >= 0)
        {
            if(numbers[index] > 0)
            {
                getLastPositveNumber = numbers[index];
            }

            index = index - 1;
        }

        return getLastPositveNumber;

    }

    static int getLastOcuurance(int [] numbers, int search)
    {
        if(numbers == null || numbers.length == 0)
        {
            return 0;
        }

        int found = 0;
        int index = numbers.length - 1;
        while(index >= 0)
        {
            if(numbers[index] == search)
            {
                found = index;
            }

            index = index - 1;
        }

        return found;
    }

    static int [] getFirstElementgreaterthenValue(int numbers [], int bigNumber)
    {
        if(numbers == null || numbers.length == 0)
        {
            return new int[]{0, 0};
        }

        int bigNumberCounter = 0;
        int index = numbers.length - 1;
        while(index >= 0)
        {
            if(numbers[index] > bigNumber)
            {
                bigNumberCounter = bigNumberCounter + 1;
            }

            index = index - 1;
        }

        int [] newArray = new int[bigNumberCounter];
        int newIndex = 0;

        index = numbers.length - 1;
        while(index >= 0)
        {
            if(numbers[index] > bigNumber)
            {
                newArray[newIndex ++] = numbers[index];
            }

            index = index - 1;
        }

        return newArray;
    }

    static int [] getReverseCopy(int [] number)
    {
        if(number == null || number.length == 0)
        {
            return new int[]{0, 0};
        }
        
        int [] newArray = new int[number.length];
        int newIndex = 0;
        int index = number.length - 1;
        while (index >= 0) 
        {
            newArray[newIndex ++] = number[index];

            index = index - 1;
        }

        return newArray;
    }

    public static void main(String[] args) 
    {
        // int numbers [] = {3, 8, 5, 12, 7, 4, 9, 6};

        // int result = getCountOfEvenNumbersFromRight(numbers);
        // System.out.println("The number of Even Numbers : " + result);

        // int numbers [] = {5, -3, 8, 12, -7, 4, -2, 6};

        // int result = getFirstNegativeNumberFromRight(numbers);
        // System.out.println("The First Negative Number from right is : " + result);

        // int numbers [] = {5, -3, 8, 12, -7, 4, -2, 6};

        // int result = getLastPositveNumberFormRight(numbers);
        // System.out.println("the last Positive number from right : " + result);

        // int number [] = {4, 7, 2, 9, 7, 3, 7, 5, 2};
        // int search = 7;
        // int result = getLastOcuurance(number, search);

        // System.out.println("The last Ocurance of Given Element is : " + result);

        // int number[] = {4, 7, 2, 9, 7, 3, 7, 5, 2};
        // int bigNumber = 4;
        // int result [] = getFirstElementgreaterthenValue(number, bigNumber);

        // int index = 0;
        // while (index < result.length) 
        // {
        //     System.out.print(result[index] + " ");

        //     index = index + 1;
        // }

        // int number[] = {4, 7, 2, 9, 7, 3, 7, 5, 2};
        // int [] result = getReverseCopy(number);

        // int index = 0;
        // while (index < result.length) 
        // {
        //     System.out.print(result[index] + " ");

        //     index = index + 1;
        // }

        

    }
}