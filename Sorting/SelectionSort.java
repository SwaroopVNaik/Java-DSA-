package Sorting;

import java.util.Arrays;

public class SelectionSort {
    
    static void selectionSort(int[] numbers)
    {
        int size = numbers.length;

        // Read one position at a time
        for(int i = 0; i < size - 1; i++)
        {
            int minValue = numbers[i];
            int minIndex = i;

            // Compare with remaining elements
            for(int j = i + 1; j < size; j++)
            {
                if(numbers[j] < minValue)
                {
                    minValue = numbers[j];
                    minIndex = j;
                }
            }

            // Swap only once
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] numbers = {9,2,16,6,13};

        System.out.println("Before : " + Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println("After  : " + Arrays.toString(numbers));
    }
}