public class ExtraProblems {

    static int getDifferenceOfLargestAndSmallest(int [] nums)
    {
        // edgeCase
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

    static double getTheHighestProfit(double [] prices)
    {
        double totalProfit = Double.MIN_VALUE;
        double currentProfit = 0;
        // double lowProfit = 0;
        int index = 0;

        while(index < prices.length)
        {
            int secondIndex = 0;
            currentProfit = prices[index] - prices[secondIndex];
            while(secondIndex < prices.length - 1)
            {
                if(currentProfit > 0 && currentProfit > totalProfit)
                {
                    totalProfit = currentProfit;
                }

                secondIndex = secondIndex + 1;
            }

            index = index + 1;
        }

        return totalProfit;
    }

    static double getTheHighestProfitV2(double [] prices)
    {
        double currentProfit = Double.MIN_VALUE;
        double totalProfit = 0;
        double buy = prices[0];

        int sell = 1;
        while(sell < prices.length - 1)
        {
            if(prices[sell] < buy)
            {
                buy = prices[sell];
            }

            currentProfit = prices[sell] - buy;

            if(totalProfit < currentProfit && currentProfit > 0)
            {
                totalProfit = currentProfit;
            }

            sell = sell + 1;
        }

        return totalProfit;
    }

    public static void main(String[] args) {

        // int [] array = {-1, 0, 5, 8, -10};
        // int result = getDifferenceOfLargestAndSmallest(array);
        // System.out.println(result);
 
        // ------------------ Method 1 (using two loop) ------------------

        // double [] prices = {1.2, 1.5, 6.4, 3.2, 0.5, 5.7};
        // double result = getTheHighestProfit(prices);
        // System.out.println(result);

        double [] prices = {1.2, 1.5, 6.4, 3.2, 0.5, 5.7};
        double result = getTheHighestProfitV2(prices);
        System.out.println(result);
        

        
    }
}