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

    static public void insertBeforeKey(int value, int key, Node PreviousNode, Node head)
    {
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

    public static void main(String[] args) {
        
        Node head = null;

        head = insertAtStart(100, head);
        head = insertAtStart(200, head);
        head = insertAtStart(300, head);
        head = insertAtStart(400, head);
        head = insertAtStart(500, head);
        head = insertAtStart(600, head);


        head = insertAtEnd(1000, head);

        insertAfterkey(3000, 300, head);

        printList(head);

        System.out.println();

        insertAfterkey(3000, 300, head);

        insertAfterkey(1000, 200, head);

        // insertBeforeKey(7000, 200, head, head);


        printList(head);


    }

}