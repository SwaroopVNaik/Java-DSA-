package LinkedList_Problem;

public class List {

    static void printingNodes(Node head)
    {
        if(head == null)
        {
            System.out.println("The List is Empty : ");
            return;
        }

        System.out.println("\nPrinting all the Nodes : ");

        Node currentHead = head;
        while(currentHead != null)
        {
            System.out.print(currentHead.data + " -> ");
            currentHead = currentHead.next;
        }
        System.out.println("null");

        return;
    }

    static Node getNthNode(Node head, int n)
    {
        if(head == null)
        {
            return null;
        }

        if(n <= 0)
        {
            return null;
        }

        int count = 1;
        Node currentHead = head;

        while(count <= n)
        {
            if(currentHead != null)
            {
                currentHead = currentHead.next;
            }

            count = count + 1;
        }

        return currentHead;
    }

    static int getTheNumberOfNodes(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        int count = 0;
        Node currentHead = head;

        while(currentHead != null)
        {
            count = count + 1;
            currentHead = currentHead.next;
        }

        return count;

    }

    static int getTheSumOfList(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        int sum = 0;
        Node currentHead = head;

        while(currentHead != null)
        {
            sum += currentHead.data;
            currentHead = currentHead.next;
        }

        return sum;
    }

    static int getSumOfEvenPostions(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        int sum = 0;
        int count = 1;
        Node currentHead = head;

        while(currentHead != null)
        {
            if(count % 2 == 0)
            {
                sum += currentHead.data;
            }

            count = count + 1;

            currentHead = currentHead.next;
        }

        return sum;
    }

    static int getSumOfOddPositons(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        int count = 1;
        int sum = 0;
        Node currentHead = head;

        while(currentHead != null)
        {
            if(count % 2 != 0)
            {
                sum += currentHead.data;
            }

            count = count + 1;
            currentHead = currentHead.next;
        }

        return sum;
    }

    static int getDifferenceOfOddAndEven(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        int difference = 0;
        int evenSum = 0;
        int oddSum = 0;
        int count = 1;

        Node currentHead = head;

        while(currentHead != null)
        {
            if(count % 2 == 0)
            {
                evenSum += currentHead.data;
            }

            if(count % 2 != 0)
            {
                oddSum += currentHead.data;
            }

            count = count + 1;

            currentHead = currentHead.next;
        }

        if(evenSum > oddSum)
        {
            difference = evenSum - oddSum;
        }

        if(oddSum > evenSum)
        {
            difference = oddSum - evenSum;
        }

        return difference;
    }

    // Joing the nodes >>>

    // Checking the testcases of Nodes
    static void checkingIfNodesAreAvailable(Node head1, Node head2)
    {
        if(head1 != null && head2 == null)
        {
            goingTillLastNode(head1);
        }

        if(head1 == null && head2 != null)
        {
            goingTillLastNode(head2);
        }

        if(head1 != null && head2 != null)
        {
            joiningTwoNodes(head1, head2);
        }

        if(head1 == null || head2 == null)
        {
            return;
        }
    }

    // Joining the same node to itself to make it cicular if we don't get any node
    static void goingTillLastNode(Node head)
    {
        Node currentHead = head;

        while(currentHead.next != null)
        {
            currentHead = currentHead.next;
        }

        currentHead.next = currentHead;

    }

    static void joiningTwoNodes(Node head1, Node head2)
    {
        Node List1 = head1;
        Node List2 = head2;

        while(head1.next != null && head2.next != null)
        {
            head1 = head1.next;

            head2 = head2.next;
        }

        // conencting head1 to List2
        head1.next = List2;
        
        // Connecting head2 to List1
        head2.next = List1;
    }

    public static void main(String[] args) 
    {
        Node newNode = new Node();

        Node head = newNode;

        newNode.data = 10;
        newNode.next = null;

        // head -> null

        Node secondNode = new Node();

        secondNode.data = 20;
        secondNode.next = null;

        // Connection list1 -> list2 -> null
        newNode.next = secondNode;

        Node thirdNode = new Node();

        thirdNode.data = 30;
        thirdNode.next = null;

        // Connection list2 -> list3 -> null
        secondNode.next = thirdNode;

        Node fourthNode = new Node();

        fourthNode.data = 40;
        fourthNode.next = null;

        // Connection list3 -> list4 -> null
        thirdNode.next = fourthNode;

        Node fifthNode = new Node();

        fifthNode.data = 50;
        fifthNode.next = null;

        // connection list4 -> list5 -> null
        fourthNode.next = fifthNode;

        // final Node
        // list1 -> list2 -> list3 -> list4 -> list5 -> null

        // Creating another Linked List : 

        Node NewNode2 = new Node();

        Node head2 = NewNode2;

        NewNode2.data = 5;
        NewNode2.next = null;

        // head -> null

        Node secondNode2 = new Node();

        secondNode2.data = 4;
        secondNode2.next = null;

        NewNode2.next = secondNode2;

        // 5 -> 4 -> null

        Node thirdNode2 = new Node();

        thirdNode2.data = 3;
        thirdNode2.next = null;

        secondNode2.next = thirdNode2;

        // 5 -> 4 -> 3 -> null

        Node fourthNode2 = new Node();

        fourthNode2.data = 2;
        fourthNode2.next = null;

        thirdNode2.next = fourthNode2;

        // 5 -> 4 -> 3 -> 2 -> null

        Node fifthNode2 = new Node();

        fifthNode2.data = 1;
        fifthNode2.next = null;

        fourthNode2.next = fifthNode2;

        // Final Node

        // 5 -> 4 -> 3 -> 2 -> 1 -> null


        // ----------------------------------------------------------------------

        // 1) Printing all the nodes
        printingNodes(head);

        // 2) get Then nth element in nodes
        Node result = getNthNode(head, 3);
        System.out.println("\nThe nth Element is : " + result.data);

        // 3) get number of nodes in singly linked list
        int resultV1 = getTheNumberOfNodes(head);
        System.out.println("\nThe Number Of Elements in SLL : " + resultV1);

        // 4) get the sum of all the nodes
        int resultV2 = getTheSumOfList(head);
        System.out.println("\nThe Sum Of Nodes is : " + resultV2);

        // 5) Sum of even Postion Nodes
        int resultV3 = getSumOfEvenPostions(head);
        System.out.println("\nSum of Even Positions : " + resultV3);

        // 6) Sum of odd Positions
        int resultV4 = getSumOfOddPositons(head);
        System.out.println("\nSum Of Odd Positons :  " + resultV4);

        // 7) Difference of odd and even
        int resultV5 = getDifferenceOfOddAndEven(head);
        System.out.println("\nThe Difference of Odd and Even Sum :" + resultV5);

        // 8) Joining Two Singly Linked list Making it Circular

        // checking if correct Node is created
        printingNodes(head2);

        checkingIfNodesAreAvailable(head, head2);

        // testing if the list has become circular !
        // printingNodes(head2);

    }

} 
