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

    public void insertAtAnyPosition(int position, int value)
    {
        // Edge Cases 
        if(rightIndex == length)
        {
            System.out.println("The Array is Full");
            return;
        }
        else if(position < 0 || position > rightIndex)  // debug important
        {
            System.out.println("invalid position");
            return;
        }

        // shift and insert
        for(int index = rightIndex - 1; index >= position; index = index - 1)
        {
           array[index + 1] = array[index];
        }

        array[position] = value;
        rightIndex = rightIndex + 1;
    }

    // ------------------------------- Deletion --------------------------------- //

    public void deleteFromEnd()
    {
        // Edge Case
        if(rightIndex == 0)
        {
            System.out.println("Array is Empty");
            return; 
        }
        else
        {
            array[rightIndex - 1] = 0;
            rightIndex = rightIndex - 1;
        }
    }

    public void deleteAtStart()
    {
        if(rightIndex == 0)
        {
            System.out.println("Arrays is Empty");
            return; // go back to caller main() method
        }
        else
        {
            // shifiting elements from index = 0;
            for(int index = 0; index < rightIndex; index = index + 1)
            {
                // deleting logic
                array[index] = array[index + 1];
            }

            // outside loop so thing about size.

            rightIndex = rightIndex - 1; // rightIndex is a size we are reducing size
            array[rightIndex] = 0;

        }
    }

    public void deleteAtAnyPosition(int position)
    {
        // edge cases
        if(rightIndex == 0)
        {
            System.out.println("Array is Empty");
            return; // go back to the caller main() method
        }
        else if(position < 0 || position >= rightIndex)
        {
            System.out.println("Invalid Postion");
            return;
        }
        else
        {
            for(int index = position; index < rightIndex; index = index + 1)
            {
                array[index] = array[index + 1];
            }
            rightIndex = rightIndex - 1;
            array[rightIndex] = 0;       
        }
    }

    // printElements 

    public void Printelements()
    {
        System.out.println("index \t value"); // prints like columnn

        for(int index = 0; index < array.length; index = index + 1)
        {
            System.out.println(index + "\t" + array[index]);
        }

        System.out.println();
        System.out.println("Size : " + rightIndex);
        System.out.println();

    }

}