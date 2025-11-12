
/**
 * Write a description of class ac here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Queue extends LinkedList 
{
    public Queue() {}
    
    public void enqueue(GoKart element)
    {
        insertAtBack(element);
    }
    
    public GoKart dequeue()
    {
        return removeFromFront();
    }
    
    public GoKart getFront()
    {
        return getFirst();
    }
    
    public GoKart getLast()
    {
        return getLast();
    }
}

