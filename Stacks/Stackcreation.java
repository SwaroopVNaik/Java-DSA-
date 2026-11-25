package Stacks;

public class Stackcreation 
{
    // Blue - print(Requirments)
    int size = 0; // size
    int top = -1; // top
    int [] Stack;

    Stackcreation(int size)
    {
        this.size = size; // using this to give important to current size
        top = -1;
        Stack = new int[size]; // Array create agherodu
    }

    // isEmpty()
    boolean isEmpty()
    {
        return top == -1;
    }

    // isFull()
    boolean isFull()
    {
        return top == size - 1;
    }

    // push() --> inserting values
    void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack OverFlow !");
            return;
        }
        else
        {
            top++;
            Stack[top] = value;

            // System.out.println(value + " : Inserted Into Stack");
            System.out.println(value);
        }
    }

    //pop() --> deleting element
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty !");
            return -1;
        }
        else
        {
            int value = Stack[top];
            top--;
            return value;
        }
    }

    // stackTop() -> seeing the topmost element
    int stackTop()
    {
        if(isEmpty())
        {
            // System.out.println("Stack is Empty !");
            return -1;
        }
        else
        {
            return Stack[top];
        }
    }

    // peek() --> looking at the index value;
    int peek(int position)
    {
        int index = top - position + 1;

        if(index < 0  || index  > top)
        {
            System.out.println("Invalid Position");
            return -1;
        }
        else
        {
            return Stack[index];
        }
    }

    // display()
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty !");
            return;
        }
        else 
        {
            System.out.println("\nStack elements : ");
            for(int index = size - 1; index >= 0; index = index - 1)
            {
                System.out.println(Stack[index]);
            }
        }
    }

}
