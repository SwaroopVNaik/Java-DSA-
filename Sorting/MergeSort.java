package Sorting;

public class MergeSort {

    static void mergeSort(int [] numbers, int start, int end)
    {
        // Stop case : stop when start >= end
        // continue until start < end
        if(start >= end)
        {
            return;
        }

        // Getting the middle of the Array
        int mid = start + (end - start) / 2;

        // Seprating the leftHalf of the Array
        mergeSort(numbers, start, mid);

        // Seperating the rightHalf of the Array
        mergeSort(numbers, mid + 1, end);

        // Sorting the elements
        merge(numbers, start, mid, end);
    }

    static void merge(int [] numbers, int start, int mid, int end)
    {
        // creating a temporary Array
        int [] tempArray = new int[end - start + 1];
        int tempIndex = 0;

        // initializing two pointers(index , jindex) for temp Array
        int index = start;
        int jndex = mid + 1;

        // Comparing both the sorted arrays using 2 pointers (index , jndex)
        // the small values first goes into the tempArray;
        while(index <= mid && jndex <= end)
        {
            if(numbers[index] <= numbers[jndex])
            {
                tempArray[tempIndex ++ ] = numbers[index ++ ];
            }
            else 
            {
                tempArray[tempIndex ++ ] = numbers[jndex ++];
            }
        }

        // Special Case : when all the elements of the left - half is sorted 
        // then only the lefthalf elements are pushed in temp array 
        // but the right half index wont be pushed int he above loop ! 
        // so to handle case we are going to add another loop ! 
        
        // LeftHalf Special Case ! 
        while(index <= mid)
        {
            tempArray[tempIndex ++ ] = numbers[index];
            index = index + 1;
        }

        // rightHalf Special Case !
        while(jndex <= end)
        {
            tempArray[tempIndex ++] = numbers[jndex];
            jndex = jndex + 1;
        }

        index = 0;
        int orginalIndex = start;
        while (index < tempArray.length) 
        {
            numbers[orginalIndex ++] = tempArray[index];
            
            index = index + 1;
        }
    }

    static void printArray(int [] numbers)
    {
        int index = 0;
        System.out.print("[");
        while(index < numbers.length)
        {
            System.out.print(numbers[index]);
            index = index + 1;

            if(index < numbers.length)
            {
                System.out.print("|");
            }

            if(index == numbers.length)
            {
                System.out.print("]");
            }
        }
    }
    public static void main(String[] args) 
    {
        int [] numbers = {12, 31, 35, 8, 38, 7};

        System.out.println("Array Before Sorting : ");

        // printing the array method 1
        printArray(numbers);

        // Getting start and end Values
        int start = 0;
        int end = numbers.length - 1;

        mergeSort(numbers, start, end);

        System.out.println("\nArray After Sorting : ");

        printArray(numbers);

    }

}