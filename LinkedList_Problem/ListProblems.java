package LinkedList_Problem;

public class ListProblems {

    static int getTheValueOfMiddleNode(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        if(head.next == null)
        {
            return head.data;
        }

        if(head.next.next == null)
        {
            return head.next.data;
        }

        Node currentHeadSlow = head;
        Node currentHeadFast = head;

        while(currentHeadSlow != null && currentHeadFast.next != null)
        {
            currentHeadSlow = currentHeadSlow.next;

            currentHeadFast = currentHeadFast.next.next;
        }

        return currentHeadSlow.data;

    }

    static int get5thEvenNumber(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        int result = 0;
        int count = 1;
        while (head != null) 
        {
            if(count == 5)
            {
                result = head.data;
            }

            count = count + 1;

            head = head.next;
        }

        return result;
    }

    static int gettheNumberReversed(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        int count = 0;

        while(head != null)
        {
            count = count + 1;
            head = head.next;
        }

        int [] newArray = new int [count];
        int newindex = 0;

        while(head != null)
        {
            newArray[newindex ++] = head.data;

            head = head.next;
        }

        

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

        Node sixthNode = new Node();

        sixthNode.data = 60;
        sixthNode.next = null;

        fifthNode.next = sixthNode;

        // final Node
        // list1 -> list2 -> list3 -> list4 -> list5 -> null

        // int result = getTheValueOfMiddleNode(head);
        // System.out.println("The Value Of the Middle Node : " + result);

        int resultV1 = get5thEvenNumber(head);
        System.out.println("The Fifth Even Number is : " + resultV1);

        int resultV2 = gettheNumberReversed(head);
    }

}