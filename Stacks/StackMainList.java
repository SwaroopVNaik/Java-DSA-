package Stacks;

public class StackMainList
{
    public static void main(String[] args) 
    {
        StackListCreation stack = new StackListCreation();

        System.out.println("-----------");
        System.out.println("Initially");
        System.out.println("------------");

        stack.isDisplay();

        System.out.println();
        System.out.println("Is Empty : " + stack.isEmpty());

        System.out.println("\n---------");
        System.out.println("Push ops");
        System.out.println("-----------");

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();

        stack.isDisplay();

        System.out.println("----------");
        System.out.println("peek by postion()");
        System.out.println("--------------------");

        System.out.println("Pson 1 : " + stack.peek(1));
        System.out.println("Pson 2 : " + stack.peek(2));
        System.out.println("Pson 3 : " + stack.peek(3));
        System.out.println("Pson 4 : " + stack.peek(4));
        System.out.println("Pson 5 : " + stack.peek(5));

        System.out.println("\n---------------");
        System.out.println("Pop Operation");
        System.out.println("-----------------");

        System.out.println("Popped Element : " + stack.pop());

        System.out.println();

        stack.isDisplay();

        System.out.println("\n--------------");
        System.out.println("Top after pop");
        System.out.println("-----------------");

        System.out.println("Top Element : " + stack.peek());

        System.out.println("\n------------------------");
        System.out.println("Top Remaining Element");
        System.out.println("----------------------------");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();

        stack.isDisplay();

        System.out.println();

        System.out.println("Is Empty : " + stack.isEmpty());

        System.out.println();

        System.out.println("Try one more pop");

        System.out.println(stack.pop());

        System.out.println();

        System.out.println("Try peek on empty stack");

        System.out.println(stack.peek());
    }
}