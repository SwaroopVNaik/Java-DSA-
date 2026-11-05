package Queue;

public class MyQueue 
{
    int [] values;
    int first = 0;
    int last = 0;
    int size = 0;
    int count = 0;

    public MyQueue(int size)
    {
        this.size = size;
        this.values = new int[size];
    }

    // Inserting Values
    public int enqueue(int value)
    {
        // queue is full
        if(this.count == this.size)
        {
            return -1;
        }

        // last has reached end, but count is less than the size
        if(this.last == this.size && this.first > 0)
        {
            // Loop for count times
            for(int loop = 0; loop <= this.count; count = count + 1)
            {
                this.values[loop] = this.values[this.first + loop];
            }
            this.first = 0;
            this.last = count;
        }

        this.values[this.last] = value;
        this.last++;
        this.count++;

        return 0;
    }

    // Removing Elements
    public int dequeue()
    {
        if(this.count == 0)
        {
            return -1;
        }

        int index = this.first;
        this.first++;
        this.count--;
        return this.values[index];
    }

    public boolean isEmpty()
    {
        boolean isEmptyStatus = false;
        if(this.count == 0)
        {
            isEmptyStatus = true;
        }
        else
        {
            isEmptyStatus = false;
        }

        return isEmptyStatus;
    }

    public int getCount()
    {
        return this.count;
    }

}