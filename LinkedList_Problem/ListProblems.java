package LinkedList_Problem;

public class ListProblems {

    static int getTheValueOfMiddleNode(Node head)
    {
        // if list is empty
        if(head == null)
        {
            return 0;
        }

        Node currentHeadSlow = head;
        Node currentHeadFast = head; 

        while(currentHeadFast != null && currentHeadFast.next != null)
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

        int evenValue = 0;
        int evenPosition = 0;
        while (head != null) 
        {
            if(head.data % 2 == 0)
            {
                evenValue = evenValue + 1;
            }

            evenPosition = evenPosition + 1;

            head = head.next;
        }

        return evenValue;
    }

    static int gettheNumberReversed(Node head)
    {
        if(head == null)
        {
            return 0;
        }

        int lastDigit = 0;

        int number = 0;

        int reverseNumber = 0;

        Node currentHead = head;

        while(currentHead != null)
        {
            number = (number * 10) + currentHead.data; 

            currentHead = currentHead.next;
        }

        while (number > 0) 
        {
            lastDigit = number % 10;

            reverseNumber = (reverseNumber * 10) + lastDigit;

            number = number / 10;
        }

        return reverseNumber;
    }

    static boolean isPalindrome(Node head)
    {
        if(head == null)
        {
            return false;
        }

        boolean isPalindrome = false;

        int number = 0;

        int storeValue = 0;

        int lastDigit = 0;

        int reverseNumber = 0;

        Node currentHead = head;

        while(currentHead != null)
        {
            number = (number * 10) + currentHead.data;
            storeValue = (storeValue * 10) + currentHead.data;
            currentHead = currentHead.next;
        }

        while(number > 0)
        {
            lastDigit = number % 10;

            reverseNumber = (reverseNumber * 10) + lastDigit;

            number = number / 10;
        }

        if(storeValue == reverseNumber)
        {
            isPalindrome = true;
        }
        else
        {
            isPalindrome = false;
        }

        return isPalindrome;

    }

    static boolean checkIfBothListareSame(Node head, Node head2)
    {

        if(head == null)
        {
            return false;
        }

        if(head2 == null)
        {
            return false;
        }

        Node currentHeadOne = head;
        Node currentHeadTwo = head;

        boolean isSame = true;

        while(currentHeadOne != null && currentHeadTwo !=  null)
        {
            if(currentHeadOne.data == currentHeadTwo.data)
            {
                isSame = true;
            }
            else
            {
                isSame = false;
            }

            currentHeadOne = currentHeadOne.next;

            currentHeadTwo = currentHeadTwo.next;
        }

        return isSame;

    }

    public static void main(String[] args) 
    {
        Node newNode = new Node();

        Node head = newNode;

        newNode.data = 1;
        newNode.next = null;

        // head -> null

        Node secondNode = new Node();

        secondNode.data = 2;
        secondNode.next = null;

        // Connection list1 -> list2 -> null
        newNode.next = secondNode;

        Node thirdNode = new Node();

        thirdNode.data = 3;
        thirdNode.next = null;

        // Connection list2 -> list3 -> null
        secondNode.next = thirdNode;

        Node fourthNode = new Node();

        fourthNode.data = 4;
        fourthNode.next = null;

        // Connection list3 -> list4 -> null
        thirdNode.next = fourthNode;

        Node fifthNode = new Node();

        fifthNode.data = 5;
        fifthNode.next = null;

        // connection list4 -> list5 -> null
        fourthNode.next = fifthNode;

        Node sixthNode = new Node();

        sixthNode.data = 6;
        sixthNode.next = null;

        fifthNode.next = sixthNode;

        // final Node
        // list1 -> list2 -> list3 -> list4 -> list5 -> null

        // second List
        
        Node NewNode2 = new Node();

        Node head2 = NewNode2;

        NewNode2.data = 1;
        NewNode2.next = null;

        // head -> null

        Node secondNode2 = new Node();

        secondNode2.data = 2;
        secondNode2.next = null;

        NewNode2.next = secondNode2;

        // 5 -> 4 -> null

        Node thirdNode2 = new Node();

        thirdNode2.data = 3;
        thirdNode2.next = null;

        secondNode2.next = thirdNode2;

        // 5 -> 4 -> 3 -> null

        Node fourthNode2 = new Node();

        fourthNode2.data = 4;
        fourthNode2.next = null;

        thirdNode2.next = fourthNode2;

        // 5 -> 4 -> 3 -> 2 -> null

        Node fifthNode2 = new Node();

        fifthNode2.data = 5;
        fifthNode2.next = null;

        fourthNode2.next = fifthNode2;

        Node sixthNode2 = new Node();

        sixthNode2.data = 6;
        sixthNode2.next = null;

        // small changes left (unexpected output)
        int result = getTheValueOfMiddleNode(head);
        System.out.println("The Value Of the Middle Node : " + result);

        // int resultV1 = get5thEvenNumber(head);
        // System.out.println("The Fifth Even Number is : " + resultV1);

        // int resultV2 = gettheNumberReversed(head);

        // System.out.println("\nThe Reverse Number : " + resultV2);

        // boolean resultV3 = isPalindrome(head);

        // System.out.println("\nIs it a palindrome List : " + resultV3);

        // boolean resultV4 = checkIfBothListareSame(head, head2);

        // System.out.println("\nBoth List are same : " + resultV4);

    }

}