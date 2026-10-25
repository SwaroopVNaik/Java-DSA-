package Sorting;

public class BubbleSort {

    static void swapArrayElements(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return;
        }

        int temp = 0;

        int index = 0;
        while(index < nums.length)
        {
            int jindex = 0;
            while(jindex < nums.length - 1)
            {
                if(nums[jindex] > nums[jindex + 1])
                {
                    temp = nums[jindex];
                    nums[jindex] = nums[jindex + 1];
                    nums[jindex + 1] = temp;
                    
                }

                jindex = jindex + 1;
            }

            index = index + 1;
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
        System.out.print("[");
        for (int index = 0; index < nums.length; index = index + 1)
        {
            System.out.print(nums[index]);

            if(index < nums.length - 1)
            {
                System.out.print("|");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {

        int [] array = {4, 1, 5, 2, 3};

        System.out.println("Before Sorting : ");
        printingArray(array);

        System.out.println("\nAfter Sorting : ");
        swapArrayElements(array);

        // comparisonOfElements(array);
    }

}
