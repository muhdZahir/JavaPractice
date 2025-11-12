public class myQueue //circular queue
{
    //data members
    private int front;
    private int tail;
    private int counter;
    private int maxSize;
    private int[] queue;
    
    //methods/operations
    public myQueue()
    {
        front = 0;
        tail = -1;
        counter = 0;
        maxSize = 10;
        queue = new int[maxSize];
    }
    
    //add element/data into queue (ENQUEUE)
    public void add(int num)
    {
        if(tail == (maxSize-1))
            tail = 0;
        else
            tail++;
        queue[tail] = num;
        counter++;
    }
    
    //remove element/data from queue (DEQUEUE)
    public int remove()
    {
        int temp;
        temp = queue[front];
        if(front == (maxSize-1))
            front = 0;
        else
            front++;
        counter--;
        return temp;
    }
    
    //check whether queue is empty or not
    public boolean empty()
    {
        if(counter == 0)
            return true;
        else
            return false;
    }
    
    //check whether queue is full or not
    public boolean full()
    {
        if(counter == maxSize)
            return true;
        else
            return false;
    }
}
