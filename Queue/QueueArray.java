package Queue;

public class QueueArray {

    // Blueprint of Queue
    int size;
    int front;
    int rear; 
    int [] queue;

    // initialization of Queue
    QueueArray(int size)
    {
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    // Enqueue()
    public void enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue Is Full");
            return;
        }
        else
        {
            rear++;
            queue[rear] = value;
            System.out.println("Value is Inserted");
        }
    }

    // Dequeue()
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        else
        {
            front++;
            int value = queue[front];
            return value;
        }
    }

    // isEmpty()
    public boolean isEmpty()
    {
        return front == rear;
    }

    // isfull()
    public boolean isFull()
    {
        return rear == size - 1;
    }

    // first()
    public int first()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty : ");
            return -1;
        }

        return queue[front + 1];
    }

    // last()
    public int last()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty : ");
            return -1;
        }
        
        return queue[rear];
    }

    // display()
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty : ");
            return;
        }

        System.out.println("Front");
        for(int i = front + 1; i <= rear; i++)
        {
            System.out.println(queue[i]);
            System.out.println("--------");
        }

        System.out.println();

    }

}
