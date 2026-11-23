package Stacks;

public class StackMain 
{
    public static void main(String[] args) 
    {
        Stackcreation stack = new Stackcreation(5);

        System.out.println("Is Empty : " + stack.isEmpty());

        System.out.println();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();

        stack.display();

        System.out.println();

        System.out.println("Top Element : " + stack.stackTop());

        System.out.println();

        System.out.println("Element at Position 1 : " + stack.peek(1));
        System.out.println("Element at Position 2 : " + stack.peek(2));
        System.out.println("Element at Position 3 : " + stack.peek(3));
        System.out.println("Element at Position 4 : " + stack.peek(4));
        System.out.println("Element at Position 5 : " + stack.peek(5));
    
       System.out.println();

        System.out.println("Deleted : " + stack.pop());
        System.out.println("Deleted : " +  stack.pop());

        System.out.println();

        stack.display();

        System.out.println();

        System.out.println("Empty :" + stack.isEmpty());
        System.out.println("Full :" + stack.isFull());

    }
}
