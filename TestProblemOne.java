public class TestProblemOne {

    static int [] getTwoSum(int values[] , int key)
    {

        if(values.length == 0)
        {
            System.out.println("Array is Empty");
            return new int[]{};
        }
        else
        {
            for(int prev = 0; prev < values.length; prev = prev + 1)
            {
                for(int next = 1; next < values.length; next = next + 1)
                {
                    if((values[prev] + values[next]) == key)
                    {
                        return new int[]{prev, next};
                    }
                }

            }
        }

        return new int[]{};

    }

    static int [] searchInsertPosition(int [] values, int key)
    {
        if(values.length == 0)
        {
            System.out.println("Array is Empty");
            return new int[]{};
        }
        for(int index = 0; index < values.length; index = index + 1)
        {
            if(key == values[index])
            {
                return new int[]{index};
            }
            else if(key != values[index])
            {
                if(key < values[index])
                {
                    return new int[]{index};
                }
            }
        }

        // if key is greater then all elements 
        return new int[]{values.length};
    }

    static int countEvenNumberOfDigits(int [] numbers)
    {
        if(numbers == null || numbers.length == 0)
        {
            return 0;
        }

        int numbersCounter = 0;
        int evenCouter = 0;
        int lastDigit = 0;

        int index = 0;
        while(index < numbers.length)
        {
            if(numbers[index] < 0)
            {
                numbers[index] = numbers[index] * -1;
            }

            while(numbers[index] > 0)
            {
                lastDigit = numbers[index] % 10;

                numbersCounter = numbersCounter + 1;

                numbers[index] = numbers[index] / 10;
            }

            if(numbersCounter % 2 == 0)
            {
                evenCouter = evenCouter + 1;
            }

            index = index + 1;

        }

        return evenCouter;
    }

    static int [] concatinationOfArray(int [] numbers)
    {
        if(numbers == null || numbers.length == 0)
        {
            return new int[]{0, 0};
        }

        int [] newArray = new int[numbers.length * 2];

        int index = 0;
        int firstIndex = 0;
        int secondIndex = numbers.length;
        while (index < numbers.length) 
        {
            newArray[firstIndex ++] = numbers[index];

            newArray[secondIndex ++ ] = numbers[index];

            index = index + 1;
        }

        return newArray;
    }


    public static void main(String[] args) {
        

        int array [] = {2, 7, 11, 15};

        // int arr [] = getTwoSum(array, 9);

        // for(int index = 0; index < arr.length; index = index + 1)
        // {
        //     System.out.print(index + " ");
        // }

        // int arr [] = searchInsertPosition(array, 17);

        // for(int index = 0; index < arr.length; index = index + 1)
        // {
        //     System.out.print(arr[index] + " ");
        // }

        // int Numbersarray [] = {555, 901, 482, 1771};
        // int result = countEvenNumberOfDigits(Numbersarray);
        // System.out.println(result);

        // int numberArray [] = {1};
        // int result [] = concatinationOfArray(numberArray);

        // for(int index = 0; index < result.length ; index ++)
        // {
        //     System.out.print(result[index] + " ");
        // }

    }
}
