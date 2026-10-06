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

    public static void main(String[] args) {
        

        int array [] = {2, 7, 11, 15};

        // int arr [] = getTwoSum(array, 9);

        // for(int index = 0; index < arr.length; index = index + 1)
        // {
        //     System.out.print(index + " ");
        // }

        int arr [] = searchInsertPosition(array, 17);

        for(int index = 0; index < arr.length; index = index + 1)
        {
            System.out.print(arr[index] + " ");
        }

    }

}
