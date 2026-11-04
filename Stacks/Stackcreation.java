package Stacks;

public class Stackcreation 
{
    int size = 0;
    int top = -1;
    int [] values = new int[size];

    public Stackcreation(int stacksize)
    {
        this.values = new int[stacksize];
        this.size = stacksize;
    }

    public void push(int val)
    {
        if(this.top == size - 1)
        {
            System.out.println("The stack is full !");
            return;
        }

        this.top++;
        this.values[this.top] = val;
    }

    public int peek()
    {
        if(this.top == -1)
        {
            System.out.println("The Stack is Empty !");
            return -1000;
        }

        return this.values[this.top];
    }

    public int pop()
    {
        if(this.top == -1)
        {
            System.out.println("The Stack is Empty");
            return -1000;
        }

    int index = this.top;
    this.top--;
    return this.values[index];

    }
}
