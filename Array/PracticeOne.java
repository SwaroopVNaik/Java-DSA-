import java.util.Scanner;

public class PracticeOne {

    void centerToTheEnds(int [] values)
    {
        int rightIndex = 0;
        int leftIndex = values.length - 1;

        if((values.length - 1) % 2 == 0)
        {
            rightIndex = (values.length - 1) / 2;
            leftIndex = rightIndex - 1;
        }
        else
        {
            rightIndex = (values.length - 1) / 2;
            leftIndex = rightIndex;
        }

        while(leftIndex >= 0 && rightIndex <= values.length - 1)
        {
            if(rightIndex == leftIndex)
            {
                System.out.print(" ( " + values[leftIndex] + " -> ");
                leftIndex = leftIndex + 1;
                rightIndex = rightIndex - 1;
            }
            else
            {
                System.out.print("(" + values[leftIndex] + " <- " + values[rightIndex] + " ) ");
                leftIndex = leftIndex - 1;
                rightIndex = rightIndex + 1;
            }

        }
    }

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");

        int size = scanner.nextInt();

        int array [] = new int[size];

        System.out.println("Enter the Elements of the Array :");

        int index = 0;
        while(index < size)
        {
            array[index] = scanner.nextInt();

            index = index + 1;
        }

        Practice obj = new Practice();

        obj.centerToTheEnds(array);

    }

}
