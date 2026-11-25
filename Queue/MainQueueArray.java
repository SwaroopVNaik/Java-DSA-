package Queue;

public class MainQueueArray {

    public static void main(String[] args) 
    {

        QueueArray Queue = new QueueArray(5);

        System.out.println("--------------");
        System.out.println("Initially");
        System.out.println("--------------");

        Queue.display(); // Queue is Empty

        System.out.println(Queue.isEmpty()); // True

        // Enqueue Operation : 

        System.out.println("--------------------");
        System.out.println("Enqueue Operations");
        System.out.println("--------------------");

        System.out.println();
        Queue.enqueue(10);
        Queue.enqueue(20);
        Queue.enqueue(30);
        Queue.enqueue(40);
        Queue.enqueue(50);
        System.out.println();

        Queue.display(); // display the elements

        System.out.println("-----------------");
        System.out.println("First Element");
        System.out.println("-----------------");

        System.out.println(Queue.first());  // display first element

        System.out.println("---------------");
        System.out.println("Last Element");
        System.out.println("---------------");

        System.out.println(Queue.last()); // display second element

        System.out.println("--------------------");
        System.out.println("Dequeue Operations");
        System.out.println("--------------------");

        System.out.println("Deleted ELement : " + Queue.dequeue());
        System.out.println("Deleted ELement : " + Queue.dequeue());
        System.out.println("Deleted ELement : " + Queue.dequeue());

        System.out.println("----------------------------------------");
        System.out.println("First After the Dequeue Operation");
        System.out.println("----------------------------------------");

        System.out.println(Queue.first());

        System.out.println("----------------------------------------");
        System.out.println("Last After the Dequeue Operation");
        System.out.println("----------------------------------------");

        System.out.println(Queue.last());

        System.out.println("Deleted ELement : " + Queue.dequeue());
        System.out.println("Deleted ELement : " + Queue.dequeue());

        System.out.println("----------------------------------------");
        System.out.println("Display After the Dequeue Operation");
        System.out.println("----------------------------------------");

        Queue.display();

        System.out.println("----------------------------------------");
        System.out.println("Empty After the Dequeue Operation");
        System.out.println("----------------------------------------");

        System.out.println(Queue.isEmpty());

        System.out.println("----------------------------------------------");
        System.out.println("One more Delete After the Dequeue Operation");
        System.out.println("----------------------------------------------");

        Queue.dequeue();
        Queue.dequeue();

        System.out.println("----------------------------------------------");
        System.out.println("First and Last After the Dequeue Operation");
        System.out.println("----------------------------------------------");

        System.out.println(Queue.first());
        System.out.println(Queue.last());

        System.out.println("----------------------------------------------");
        System.out.println("isEmpty and isFull After the Dequeue Operation");
        System.out.println("----------------------------------------------");

        System.out.println("isEmpty :" + Queue.isEmpty()); // true
        System.out.println("isFull : " + Queue.isFull()); // false
        
    }

}
