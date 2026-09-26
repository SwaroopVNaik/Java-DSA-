public class ArrayPattern {

    void printLeftToRight(int [] values)
    {
        System.out.println("Printing Numbers from Left to Right : \n");

        for(int index = 0; index <= values.length - 1; index = index + 1)
        {
            System.out.print(values[index]);

            if(index < values.length - 1)
            {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    void printRightToLeft(int [] values)
    {
        System.out.println();
        System.out.println("Printing Numbers from Right to Left : \n");

        for(int index = values.length - 1; index > -1; index = index - 1)
        {
            System.out.print(values[index]);

            if(values[index] > values[0])
            {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    void twoPointersMeetAtCenter(int [] values)
    {
        System.out.println();
        System.out.println("Bringing two Pointers from end to center : \n");

        int leftIndex = 0;
        int rightIndex = values.length - 1;

        while(leftIndex <= rightIndex)
        {
            System.out.print(" ( " + values[rightIndex] + " -> ");
            rightIndex = rightIndex - 1;

            System.out.print(values[leftIndex] + " ) ");
            leftIndex = leftIndex + 1;

        }

        System.out.println();
    }

    void twoPointersMoveCentreToEnd(int [] values)
    {
        System.out.println();
        System.out.println("Two Pointers Move from center to end : \n");

        int leftIndex = 0;
        int rightIndex = values.length - 1;

        if((values.length - 1) % 2 == 0 )
        {
            rightIndex = (values.length - 1 ) / 2; 
            leftIndex = rightIndex - 1; 
        }
        else
        {
            leftIndex = (values.length - 1) / 2;
            rightIndex = leftIndex + 1;
        }

        while(leftIndex >= 0 && rightIndex <= (values.length - 1))
        {
            System.out.print(" ( " + values[leftIndex] + " -> ");
            leftIndex = leftIndex - 1;

            System.out.print(values[rightIndex] + " )");
            rightIndex = rightIndex + 1;
        }
    }
    
    public static void main(String[] args) 
    {
        int elements [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        ArrayPattern obj = new ArrayPattern();

        // obj.printLeftToRight(elements);
        // obj.printRightToLeft(elements);
        obj.twoPointersMeetAtCenter(elements);
        // obj.twoPointersMoveCentreToEnd(elements);
    }

}