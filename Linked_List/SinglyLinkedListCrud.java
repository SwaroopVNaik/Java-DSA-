public class SinglyLinkedListCrud 
{

    static public Node insertAtStart(int value, Node currentHead)
    {

        // Creating a node
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        // test cases
        //  1) head == null ; 
        // 2) head != null (it may have one more or node)

        if(currentHead == null)
        {
            return newNode;
        }
        else
        {
            newNode.next = currentHead;
            return newNode;
        }
        
    }

    static public Node insertAtEnd(int value, Node currentHeadLastNode)
    {
        // creating a temp and giving head reference to it (copy of head)
        Node head = currentHeadLastNode;

        // Create a newNode
        Node lastNode = new Node();
        lastNode.data = value;
        lastNode.next = null;

        while (currentHeadLastNode.next != null) {

            // System.out.print(currentHeadLastNode.data + " -> ");
            currentHeadLastNode =  currentHeadLastNode.next;
        }
        currentHeadLastNode.next = lastNode;

        return head;


    }

    static public void insertAfterkey(int value, int key, Node head)
    {
        // Creating new Node
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(head == null)
        {
            return;
        }

        if(head.next == null)
        {
            head.next = newNode;
        }

        Node keyNode = head;

        while(keyNode.next != null && keyNode.data != key)
        {
            keyNode = keyNode.next;
        }
        newNode.next = keyNode.next;
        keyNode.next = newNode;
    }

    public static void printList(Node currentHead)
    {
        // we need to traverse the linkedlist so we use temp
        Node temp = currentHead;

        System.out.print("Head ->");
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    // ------------------------------ Delete Operations -------------------------------------------!

    public static Node deleteAtStart(Node head)
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            return head.next;
        }
    }

    public static Node deleteAtLast(Node head)
    {
        Node lastButOne = head;

        if(head == null || head.next == null)
        {
            return null;
        }
        else{

            while (lastButOne.next.next != null) 
            {
                lastButOne = lastButOne.next;
            }

            lastButOne.next = null;
            return head;

        }
    }

    public static Node deleteAtPostion(Node head, int key)
    {
        // List is Empty (test case 1)
        if(head == null)
        {
            System.out.println("The List is Empty");
            return null;
        }
        
        // List has only one node and key is present (testcase 2)
        if(head.data == key)
        {
            return head.next;
        }
        else if(head.next == null)
        {
            return head;
        }

        Node prevNode = head;
        Node keyNode = head.next;

        // many nodes key is present and not present (test case 4)
        while(keyNode != null)
        {
            // handels if second node is equal to key (test case 3)
            if(keyNode.data == key)
            {
                break;
            }

            prevNode = keyNode;
            keyNode = keyNode.next;

        }

        if(keyNode != null && keyNode.data == key)
        {
            prevNode.next = keyNode.next;
        }

        return head;
    }

    public static void allTestCase()
    {
        Node head = null;

        // Test Matrix

        // 1) TestCases 1 -> List is Empty !
        System.out.println();
        System.out.println("List is Empty");
        printList(head);
        
        System.out.println();
        System.out.println("\nInserting Single Node");
        head = insertAtStart(100, head);
        printList(head);

        // TestCase 2 -> List has Single Node (key Present)
        System.out.println();
        System.out.println("\nSingle Node (key is Present)");
        head = deleteAtPostion(head, 100);
        printList(head);

        // TestCase 3 - List has Single Node (key is not present)
        System.out.println();
        System.out.println();
        System.out.println("Single Node (key is not Present)");
        head = insertAtStart(100, head);
        printList(head);

        System.out.println();
        System.out.println();
        System.out.println("After Deleting Single Node (key is not present)");
        head = deleteAtPostion(head, 200);
        printList(head);

        // 3) twoNode , Key first
        System.out.println();
        System.out.println("\nTwo Nodes, Key is First");
        head = insertAtEnd(200, head);
        printList(head);
        System.out.println();

        System.out.println("\nAfter Deleting Two Nodes, Key is First");
        head = deleteAtPostion(head, 100);
        printList(head);

        // 4) Two Node , key Second
        System.out.println();
        System.out.println("\nTwo Nodes, Key is Second");
        head = insertAtEnd(300, head);
        printList(head);
        System.out.println();

        System.out.println("\nAfter Deleting , Key is Second");
        head = deleteAtPostion(head, 300);
        printList(head);

        // 5) twoNode , key is not present
        System.out.println();
        System.out.println("\nTwo Nodes, Key is not present");
        head = insertAtEnd(300, head);
        printList(head);
        System.out.println();

        System.out.println("\nAfter Deleting, Two Nodes Key is not Present");
        head = deleteAtPostion(head, 400);
        printList(head);

        // 5) Many Nodes , key first

        System.out.println();
        System.out.println("\nMany Nodes , Key is Present");
        head = insertAtEnd(400, head);
        head = insertAtEnd(500, head);
        head = insertAtEnd(600, head);
        head = insertAtEnd(700, head);

        printList(head);

        System.out.println();
        System.out.println("\nAfter Deleting Many Nodes , Key is first");
        head = deleteAtPostion(head, 200);
        printList(head);

        // 6) Many Nodes , key is Last

        System.out.println();
        System.out.println("\nMany Nodes , Key is Last");
        printList(head);

        System.out.println();

        System.out.println("\nAfter Deleting Many Node, Key is Last");
        head = deleteAtPostion(head, 700);
        printList(head);

        // 7) Many Nodes , Key Not Present

        System.out.println();
        System.out.println("\nMany Nodes , Key is Not Present");
        printList(head);

        System.out.println();

        System.out.println("\nAfter Deleting Many Nodes, Key is not Present");
        head = deleteAtPostion(head, 1000);
        printList(head);

    }

    public static void main(String[] args) {
        
        // Node head = null;

        // head = insertAtStart(100, head);
        // head = insertAtStart(200, head);
        // head = insertAtStart(300, head);
        // head = insertAtStart(400, head);
        // head = insertAtStart(500, head);
        // head = insertAtStart(600, head);

        // head = insertAtEnd(1000, head);

        // insertAfterkey(3000, 300, head);

        // System.out.println();

        // printList(head);

        // System.out.println();

        // insertAfterkey(3000, 300, head);
        // printList(head);

        // System.out.println();

        // insertAfterkey(1000, 200, head);
        // printList(head);

        // insertBeforeKey(7000, 200, head, head);

        // --------------------- Deletion ---------------------------->

        allTestCase();

    }

}