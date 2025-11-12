
/**
 * Write a description of class SUKA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class SUKA
{
    public static void main(String args[])
    {
        System.out.println("Aims      : S U K A");
        System.out.println("\nSequence:   A K S U");
        
        Node <String> head, tail, current;
        head = tail = current = null;
        
        Node <String> node = null;
        node = new Node<>("A");
        head = node;
        tail = node;
        
        node = new Node<>("K");
        head = node;
        node.next = tail;
        
        node = new Node<>("S");
        node.next = head;
        head = node;
        
        node = new Node<>("U");
        node.next = head.next;
        head.next = node;
        
        System.out.println("Output:");
        
        current = head;
        while(current != null)
        {
            String str = current.element;
            System.out.print(str + " ");
            current = current.next;
        }
    }
}
