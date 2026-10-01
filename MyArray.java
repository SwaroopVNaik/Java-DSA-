public class MyArray 
{

    int [] array; // place to store elements
    int length; // total size of the array 
    int rightIndex; // Pointing at empty Box

    // public so we can access in main method file.

    public MyArray()
    {
        length = 5;
        array = new int[length]; // Array i =s created [0][0][0][0][0] --> initial array
        rightIndex = 0;
    }

    // implementation of all logic

    // insert at end 
    public void insertAtEnd(int value)
    {
        // edge case
        if(rightIndex == length)
        {
            System.out.println("Array is Full");
            return; // go back to the caller which is in main
        }

        // if array is not full we are inserting the element 
        // (since rightIndex will always be pointing to empty box in array )
        array[rightIndex] = value;
        
        // after inserting element we hv to increse the size of rightIndex = (r + 1);
        rightIndex = rightIndex + 1;

    }

    // insert at start
    public void insertAtStart(int value)
    {
            if(rightIndex == length)
            {
                System.out.println("Array is Full");
                return; // go back to caller in main method
            }
            else
            {
                // Shifting elements one position to right
                for(int index = rightIndex - 1; index >= 0; index = index - 1)
                {
                    // main logic to move elements 
                    array[index + 1] = array[index];
                }

                // inserting
                array[0] = value;

                rightIndex = rightIndex + 1;
            }
    }

    public void insertAtAnyPosition(int value, int position)
    {
        // Edge Cases 
        if(rightIndex == length)
        {
            System.out.println("The Array is Full");
            return;
        }
        else if(position < 0 || position > rightIndex)
        {
            System.out.println("invalid position");
            return;
        }

        // pending
    }

}