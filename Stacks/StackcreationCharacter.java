package Stacks;

public class StackcreationCharacter 
{
    int size = 0;
    int top = -1;
    char [] Stack;

    public StackcreationCharacter(int stackSize)
    {
        size = stackSize;
        Stack = new char[stackSize];
    }

    public void push(char val)
    {
        if(top == size - 1)
        {
            // System.out.println("The Stack is Full");
            return;
        }

        top++;
        Stack[top] = val;
    }

    public char peek()
    {
        if(top == -1)
        {
            // System.out.println("The Stack is Empty");
            return '*';
        }

        return Stack[top];
    }

    public char pop()
    {
        if(top == -1)
        {
            // System.out.println("The Stack is Empty");
            return '*';
        }

        // we use a index variable to store the value of top before decreementing the top so we do
        // not loose the top value
        int index = top;
        top--;
        return Stack[index];
    }

}
