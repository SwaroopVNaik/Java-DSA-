package Sorting;

public class BubbleSort {

    static void swapArrayElements(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return;
        }

        int temp = 0;

        // Just for number of interations
        for(int index = 0; index < nums.length; index = index + 1)
        {
            for(int jindex = 0; jindex < nums.length - 1; jindex = jindex + 1)
            {
                // comparisonn logic
                if(nums[jindex] > nums[jindex + 1])
                {
                    // swapping
                    temp = nums[jindex + 1];
                    nums[jindex + 1] = nums[jindex];
                    nums[jindex] = temp;

                }
            }
        }

        printingArray(nums);
    }

    static void comparisonOfElements(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return;
        }

        for(int index = 0; index < nums.length; index = index + 1)
        {
            for(int j = 0; j < nums.length; j = j + 1)
            {
                if(nums[j] == nums[index])
                {
                    System.out.println(nums[j] + "==" + nums[index]);
                }
                else if(nums[j] > nums[index])
                {
                    System.out.println(nums[j] + ">" + nums[index]);
                }
                else if(nums[j] < nums[index])
                {
                    System.out.println(nums[j] + "<" + nums[index]);
                }
            }
        }
    }

    // print Method
    static void printingArray(int [] nums)
    {
        for (int values : nums)
        {
            System.out.print(values + " , ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int [] array = {5, 4, 3, 2, 1};

        // System.out.println("Before Sorting : ");
        // printingArray(array);

        // System.out.println("After Sorting : ");
        // swapArrayElements(array);

        comparisonOfElements(array);
    }

}
