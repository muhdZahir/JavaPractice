
/**
 * Write a description of class CLEVER here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CLEVER
{
    public static void main(String args[])
    {
        System.out.println("Aims         : C L E V E R");
        System.out.println("\nSequence     : V E C R E L");
        
        Node <String> head, tail, current;
        head = tail = current = null;
        Node <String> node = null;
        
        node = new Node<> ("V");
        head = node;
        tail = node;
        
        node = new Node<> ("E");
        node.next = head;
        head = node;
        
        node = new Node<> ("C");
        node.next = head;
        head = node;
        
        node = new Node<> ("R");
        tail.next = node;
        tail = node;
        
        node = new Node<> ("E");
        node.next = tail;
        head.next.next.next = node;
        
        node = new Node<> ("L");
        node.next = head.next;
        head.next = node;
        
        System.out.println("Output: ");
        
        current = head;
        while(current != null)
        {
            String str = current.element;
            System.out.print(str + " ");
            current = current.next;
        }
    }
}
