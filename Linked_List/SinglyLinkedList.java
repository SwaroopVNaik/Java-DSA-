public class SinglyLinkedList
{

    public static void main(String[] args)
    {
        // Node => DataType (user - defined)
        // newNode => reference Variable
        // new => Keyword (to create object)
        // Node() = constructor

        Node newNode = new Node(); // Object Created -> newNode

        Node head = newNode;

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

        // System.out.print(newNode.data + " -> "); // 101
        // System.out.print(newNode.next.data + " -> "); // 102
        // System.out.print(newNode.next.next.data + " -> "); // 103
        // System.out.print(newNode.next.next.next + " -> "); // null 

        // Creating an initialNode 

        Node initialNode = new Node();
        initialNode.data = 100;
        initialNode.next = null;

        // joining the inital node with Linked list

        initialNode = newNode;
        head = initialNode;

        System.out.println("The inserting of Node at the beginning \n");

        System.out.print(head.data + " -> ");
        System.out.print(head.next.data + " -> ");
        System.out.print(head.next.next.data + " -> ");
        System.out.print(head.next.next.next);

        // creating the lastNode 

        Node lastNode = new Node();
        lastNode.data = 300;
        lastNode.next = null;

        // Creating a temp node to traverse

        Node temp = new Node();

        temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = lastNode;

        System.out.println();
        System.out.println("Inserting the Node at the end of List : \n");

        System.out.print(head.data + " -> ");
        System.out.print(head.next.data + " -> ");
        System.out.print(head.next.next.data + " -> ");
        System.out.print(head.next.next.next.data + " -> ");
        System.out.print(head.next.next.next.next);

        // Inserting the data at the middle

        
    }
}

