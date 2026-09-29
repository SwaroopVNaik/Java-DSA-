package Linked_List;

public class SinglyLinkedListF 
{
    
    public static void main(String[] args) 
    {
        
        // Creating head
        Node head = null;

        // function inovcation
        head = insertAtTheStart(100, head);
        head = insertAtTheStart(101, head);
        head = insertAtTheStart(102, head);
        head = insertAtTheStart(103, head);
        head = insertAtTheStart(104, head);
        head = insertAtTheStart(105, head);
        printList(head);
    }

    // Function definition
    public static Node insertAtTheStart(int value, Node currentHead)
    {
        // Creation of new Node and set the values
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        /*if(currentHead == null)
        {
            return newNode;
        }
        else
        {
            newNode.next = currentHead;
            return newNode;
        }*/

        // testCase 1 : head == null || list is empty
        // testCase 2 : list is not empty or there are one or more node 
        if(currentHead != null)
        {
            newNode.next = currentHead;
        }

        return newNode;
    }

    public static void printList(Node head)
    {
        Node monkey = head;

        System.out.print("head -> ");
        while(monkey != null)
        {
            System.out.print(monkey.data);
            System.out.print(" -> ");
            monkey = monkey.next;
        }
        System.out.print("null");

    }

}
