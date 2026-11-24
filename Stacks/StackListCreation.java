package Stacks;

class Node
{
    // Blue Print
    int data;
    Node next;

    // constructor
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
    public class StackListCreation
    {
        Node top; // head

        StackListCreation()
        {
            top = null; // no node is created 
        }

        // push() -> operation
        public void push(int value)
        {
            Node newNode = new Node(value); // created Node that should be inserted.

            newNode.next = top; // its holding heads Address.

            top = newNode; // head is now pointing to newNode head - 40 - 30 - 20 - 10 - null.

        }
    

        // pop()
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty : ");
                return -1;
            }

            int value = top.data; // store values before deleting the node.

            top = top.next; // this deletes first value.

            return value; // temporarily v had stored value in value variable which was deleted.
        }

        // peek(top element)
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty");
                return -1;
            }

            return top.data; // 30 is here because 40 was deleted.
        }

        // peek at positon
        // positon starts from 1 (top == posn 1)
        public int peek(int positon)
        {
            if(positon <= 0)
            {
                System.out.println("Invalid Positon");
                return -1;
            }

            // assign the head address to temp
            Node temp = top;

            // counts the number of position's of temp 
            int count = 1;

            while(temp != null && count < positon)
            {
                temp = temp.next;
                count = count + 1;
            }

            if(temp == null)
            {
                System.out.println("Position does not exist");
                return -1;
            }

            // returning the data from that position
            return temp.data;
        }

        // isEmpty()
        public boolean isEmpty()
        {
            return top == null;
        }

        // isDisplay()
        public void isDisplay()
        {
            Node temp = top;

            if(isEmpty())
            {
                System.out.println("stack is empty");
                return;
            }
            else
            {
                while(temp != null)
                {
                    System.out.println(temp.data);
                    System.out.println("------");
                    temp = temp.next;
                }
            }
        }

    }
