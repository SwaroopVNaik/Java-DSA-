package Stacks;

public class StackcreationCharacter 
{
    int size = 0;
    int top = -1;
    char [] values = new char[size];

    public StackcreationCharacter(int stackSize)
    {
        this.size = stackSize;
        this.values = new char[stackSize];
    }

    public void push(char val)
    {
        if(this.top == size - 1)
        {
            System.out.println("The Stack is Full");
            return;
        }

        this.top++;
        this.values[this.top] = val;
    }

    public char peek()
    {
        if(this.top == -1)
        {
            System.out.println("The Stack is Empty");
            return '*';
        }

        return this.values[this.top];
    }

    public char pop()
    {
        if(this.top == -1)
        {
            System.out.println("The Stack is Empty");
            return '*';
        }

        // we use a index variable to store the value of top before decreementing the top so we do
        // not loose the top value
        int index = this.top;
        this.top--;
        return this.values[index];
    }

}
