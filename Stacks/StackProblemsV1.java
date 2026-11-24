package Stacks;

import java.util.Scanner;

public class StackProblemsV1 
{
   static int temp = 50;
    // time complexity : O(n)
    static void addingElementInBottom(int value, Stackcreation StackPV1)
    {
        int index = StackPV1.size - 1;
        while(index >= 0)
        {
            if(StackPV1.Stack[index] != 0)
            {
                index = index + 1;
                break;
            }

            index = index - 1;
        }

        while(StackPV1.stackTop() >= 0)
        {
            StackPV1.Stack[index] = StackPV1.stackTop();

            if(StackPV1.top < StackPV1.size)
            {
                StackPV1.top--;
            }
            index = index - 1;

            if(StackPV1.stackTop() < 1)
            {
                StackPV1.push(value);
                break;
            }
        }

        System.out.println("\nAfter Inserting the ELement in the bottom : ");
        StackPV1.display();

    }

    // Time Complexity : O(n)
    static void reversingTheStack(Stackcreation StackPV)
    {
        int Lastindex = StackPV.top;

        int FirstIndex = StackPV.Stack.length - 1;

        while(Lastindex < FirstIndex)
        {
            if(StackPV.Stack[FirstIndex] == 0)
            {
                FirstIndex = FirstIndex - 1;
            }
            else
            {
                int temp = StackPV.Stack[FirstIndex];
                StackPV.Stack[FirstIndex] = StackPV.Stack[Lastindex];
                StackPV.Stack[Lastindex] = temp;

                FirstIndex--;

                Lastindex++;
            }
        }

        System.out.println("\nAfter Reversing the Stack :");
        StackPV.display();
    }

    // Time Complexity : O(n^2)
    static void sortingTheStack(Stackcreation StackPV, Stackcreation StackPV2)
    {
        for(int index = StackPV.Stack.length - 1; index >= 0; index = index - 1)
        {
            for(int j = StackPV.Stack.length - 1; j >= 0; j = j - 1)
            {
                if(j - 1 == -1)
                {
                    break;
                }

                if(StackPV.Stack[j] > StackPV.Stack[j - 1])
                {
                    int temp = StackPV.Stack[j];
                    StackPV.Stack[j] = StackPV.Stack[j - 1];
                    StackPV.Stack[j - 1] = temp;
                }
            }
        }

        for(int index = StackPV.Stack.length - 1; index >= 0; index = index - 1)
        {
            StackPV2.push(StackPV.Stack[index]);
        }

        System.out.println("\nAfter Sorting Stack : ");
        StackPV2.display();

    }

    // Time Complexity : O(n)
    static void dynamicStack(Stackcreation StackPV)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDyanmic Stack : ");
        System.out.println("\nEnter the Elements In the Stack : ");
        // int index = StackPV.Stack.length - 1;
        while(true)
        {
            int value = scanner.nextInt();
            if(StackPV.top < StackPV.size)
            {
                StackPV.push(value);
            }

            if(StackPV.top == StackPV.size - 1)
            {
                int [] newStack = new int[StackPV.size * 2];
                int newIndex = 0;

                for(int indexV = 0; indexV <= StackPV.size - 1; indexV = indexV + 1)
                {
                    newStack[newIndex++] = StackPV.Stack[indexV];
                }

                // Changing the oldStack varibale reference to newStack
                StackPV.Stack = newStack;
                StackPV.size = newStack.length;
                
            }

            // index = index - 1;
        }
    }

    static void isStackPalindrome(Stackcreation StackPV)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Five Values to check palindrome : ");
        int index = 0;
        while(index < StackPV.size)
        {
            int value = scanner.nextInt();
            StackPV.push(value);

            index = index + 1;
        }

    }

    static void removeEvenNumber(Stackcreation StackPV)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter the 5 values in stack :");
        for(int index = 0; index < StackPV.size; index = index + 1)
        {
            int value = scanner.nextInt();
            StackPV.push(value);
        }

        Stackcreation temp = new Stackcreation(StackPV.size);

        for(int index = StackPV.size - 1; index >= 0; index = index - 1)
        {
            if(StackPV.Stack[index] % 2 == 0)
            {
                int value = StackPV.Stack[index];
                temp.push(value);
            }
        }
        
        temp.display();

    }

    static void removeMiddleElement(Stackcreation StackPV)
    {
        Stackcreation temp = new Stackcreation(StackPV.size);

        int firstIndex = 0;
        int LastIndex = StackPV.size - 1;
        
            while(firstIndex <= LastIndex)
            {
                firstIndex = firstIndex + 1;
                LastIndex = LastIndex - 1;
            }
    }
    

    public static void main(String[] args)
    {
        Stackcreation StackPV = new Stackcreation(5);

        System.out.println(temp);

        System.out.println("Before inserting the element in the bottom of the stack :");
        StackPV.push(10);
        StackPV.push(20);
        StackPV.push(30);

        // System.out.println("\nAfter Inserting The Element in the bottom of the stack :");

        // 1) Inserting An Element in the Bottom Of Stack.
        addingElementInBottom(7777, StackPV);

        // 2) Reverse Entire Stack
        reversingTheStack(StackPV);

        // Creating New Stack
        Stackcreation StackPV2 = new Stackcreation(StackPV.size);

        // 3) Sorting the Stack 
        sortingTheStack(StackPV, StackPV2);
        

        // Creating New Stack;
        Stackcreation StackPV3 = new Stackcreation(3);

        // 4)Implementing Dynamic Stack
        // dynamicStack(StackPV3);

        // 5) Check if Stack is a Palindrome

        // isStackPalindrome(StackPV4);

        // 6) Remove all even numbers from stack

        Stackcreation StackPV4 = new Stackcreation(5);
        removeEvenNumber(StackPV4);

        // 7) Remove middle elements in the stack
        Stackcreation StackPV5 = new Stackcreation(5);

        System.out.println();

        StackPV5.push(12);
        StackPV5.push(20);
        StackPV5.push(15);
        StackPV5.push(12);
        StackPV5.push(12);

        removeMiddleElement(StackPV5);

    }
}
