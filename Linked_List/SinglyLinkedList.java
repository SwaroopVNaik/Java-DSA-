package Linked_List;

public class SinglyLinkedList
{
    public static void main(String[] args)
    {
        // Node => DataType (user - defined)
        // newNode => reference Variable
        // new => Keyword (to create object)
        // Node() = constructor

        Node newNode = new Node(); // Object Created -> newNode

        // Initialising the newNode : 

        newNode.data = 101;
        newNode.next = null;

        // System.out.println(newNode.data); // 101
        // System.out.println(newNode.next); // null
        // System.out.println(newNode); // address of Reference Variable

        // Initialising secondNode : 

        Node secondNode = new Node(); // Object created -> secondNode 

        secondNode.data = 102;
        secondNode.next = null;

        // joining NewNode and secondNode : 

        newNode.next = secondNode;

        // Initialising thirdNode 

        Node thirdNode = new Node();

        thirdNode.data = 103;
        thirdNode.next = null;

        // Connecting secondNode and thirdNode

        secondNode.next = thirdNode;

        // checking if nodes are connected : 

        System.out.print(newNode.data + " -> "); // 101
        System.out.print(newNode.next.data + " -> "); // 102
        System.out.print(newNode.next.next.data + " -> "); // 103
        System.out.print(newNode.next.next.next + " -> "); // null 

        
    }
}

