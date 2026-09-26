public class Assignment
{

    int getLargestElement(int [] values)
    {
        int largestValue = values[0];

        int index = 0;
        while(index <= values.length - 1)
        {
            if(values[index] > largestValue)
            {
                largestValue = values[index];
            }

            index = index + 1;
        }

        return largestValue;

    }

    int getSmallestElement(int [] values)
    {
        int smallestValue = values[0];

        int index = 0;
        while(index <= values.length - 1)
        {
            if(values[index] < smallestValue)
            {
                smallestValue = values[index];
            }

            index = index + 1;

        }

        return smallestValue;
    }

    int getSecondLargestElement(int [] values)
    {

        int largestValue = values[0];
        int secondLargest = values[1];

        int index = 0;

        while(index <= values.length - 1)
        {
         
            if(values[index] > largestValue)
            {
                secondLargest = largestValue;
                largestValue = values[index];
            }
            else if(values[index] > secondLargest && values[index] != largestValue)
            {
                secondLargest = values[index];
            }
            
            index = index + 1;

        }
        return secondLargest;
    }

    public static void main(String[] args)
    {

        int arrayV1 [] = {42, 17, 89, 42, 63, 89, 5, 76, 31, 63, 94, 17, 94, 28, 76};

        int arrayV2 [] = {10, 20, 30, 40, 50};

        Assignment obj = new Assignment();

        System.out.println("Largest Value is : " + obj.getLargestElement(arrayV1));

        System.out.println("Smallest Value is : " + obj.getSmallestElement(arrayV1));

        System.out.println("Second Largest Value is : " + obj.getSecondLargestElement(arrayV1));

        

    }
}