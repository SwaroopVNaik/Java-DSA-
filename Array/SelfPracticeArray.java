public class SelfPracticeArray 
{

    public static void printLeftToRight(int [] values)
    {
        System.out.println("printing left to right");

        for(int index = 0; index <= values.length - 1; index = index + 1)
        {
            System.out.print(values[index]);

            if(index < values.length - 1)
            {
                System.out.print(" -> ");
            }

        }
    }

    public static void printRightToLeft(int [] values)
    {
        System.out.println();
        System.out.println("Printing right to left : ");

        for(int index = values.length - 1; index >= 0; index = index - 1)
        {
            System.out.print(values[index]);

            if(index > 0)
            {
                System.out.print(" <- ");
            }
        }
    }

    public static void printBothEndsToCentre(int [] values)
    {
        int leftIndex = 0;
        int rightIndex = values.length - 1;

        System.out.println();
        System.out.println("Printing End to Centre : ");

        while(leftIndex <= rightIndex && rightIndex >= (values.length - 1) / 2)
        {
            System.out.print("( " + values[leftIndex] + " -> ");
            leftIndex = leftIndex + 1;

            System.out.print(values[rightIndex] + " )");
            rightIndex = rightIndex - 1;
        }
    }

    public static void printCenterToBothEnds(int [] values)
    {

        System.out.println();
        System.out.println("Printing Center to both ends : ");

        int rightIndex = values.length - 1;
        int leftIndex = 0;

        if((values.length) % 2 == 0)
        {
            rightIndex = (values.length) / 2;
            leftIndex = rightIndex - 1;
        }
        else
        {
            rightIndex = (values.length) / 2;
            leftIndex = rightIndex;
        }

        while(leftIndex >= 0 && rightIndex <= values.length)
        {
            if(leftIndex == rightIndex)
            {
                System.out.print("(" + values[leftIndex] + ")" + " -> ");
                leftIndex = leftIndex - 1;
                rightIndex = rightIndex + 1;
            }
            else
            {
                System.out.print("(" + values[leftIndex] + " -> ");
                leftIndex = leftIndex - 1;

                System.out.print(values[rightIndex] + ") ");
                rightIndex = rightIndex + 1;
            }
        }
    }

    public static void main(String[] args) 
    {
        int array[] = {57, 60, 80, 100, 20};

        printLeftToRight(array);
        printRightToLeft(array); 
        printBothEndsToCentre(array);
        printCenterToBothEnds(array);
    }

}
