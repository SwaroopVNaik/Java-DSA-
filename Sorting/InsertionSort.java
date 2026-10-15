package Sorting;

public class InsertionSort {

    static int[] sort(int [] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return new int[]{-1};
        }

        for(int index = 1; index < nums.length; index = index + 1)
        {
            int key = nums[index];
            int previousIndex = index - 1;

            while(previousIndex >= 0 && nums[previousIndex] > key)
            {
                if(nums[previousIndex] > key)
                {
                    nums[previousIndex + 1] = nums[previousIndex];
                    previousIndex--;
                }
                nums[previousIndex + 1] = key;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        
        int array [] = {9, 2, 16, 6, 13};

        System.out.println("Before insertiong Sort : ");
        for(int index = 0; index < array.length; index = index + 1)
        {
            System.out.print(array[index] + " ");
        }

        int result [] = sort(array);

        System.out.println();

        System.out.println("After insertiong Sort : ");

        for(int index = 0; index < result.length; index = index + 1)
        {
            System.out.print(result[index] + " ");
        }

    }

}
