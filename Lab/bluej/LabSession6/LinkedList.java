
/**
 * Write a description of class vs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList
{
        private Node head,current,tail;
        
	public void insertAtBack(GoKart element)
	{
	   Node newNode = new Node(element);
            
           if (tail == null)
                head = tail = newNode;
           else
           {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        
	public GoKart removeFromFront()
	{
        	if (isEmpty())
        		return null;
                else
        	{
        		Node temp = head;
        		head = head.next;
        		if (head == null)
                	{ tail = null; }
                	
        		return temp.element;
                }
        }
        
	public boolean isEmpty()
	{
	    return (head == null);
	}
	
	public GoKart getFirst()
	{
	    if(isEmpty())
                return null;
            else
            {
                current = head;
                return current.element;
            }
	}
	
	public GoKart getLast()
	{
	    if (isEmpty())
	    {
	        return null;
	    }
	    else
	    {
	        return tail.element;
	    }
	}
}


