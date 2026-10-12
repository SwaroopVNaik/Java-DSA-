public class ExtraProblems {

    static int getDifferenceOfLargestAndSmallest(int [] nums)
    {
        if(nums == null || nums.length == 0 || nums.length == 1)
        {
            return -1;
        }

        int maxValue = nums[0];
        int minValue = nums[0];

        int index = 0;
        while(index < nums.length)
        {
            if(nums[index] > maxValue)
            {
                maxValue = nums[index];
            }

            if(nums[index] < minValue && minValue < maxValue)
            {
                minValue = nums[index];
            }

            index = index + 1;
        }

        int difference = maxValue - minValue;

        return difference;

        
    }

    public static void main(String[] args) {

        int [] array = {-1, 0, 5, 8, -10};
        int result = getDifferenceOfLargestAndSmallest(array);
        System.out.println(result);

    }
}