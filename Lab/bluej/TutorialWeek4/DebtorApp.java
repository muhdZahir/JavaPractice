
/**
 * Write a description of class debtor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class DebtorApp
{
    public static void main(String args[])
    {
        LinkedList debtorList = new LinkedList();
        
        Debtor debtor = new Debtor("Ahmad Sulung bin Razak", 5800.7, 30390.0, "2");
        debtorList.insertAtFront(debtor);
        debtor = new Debtor("Juliana bin Ahmad Kamil", 8880.8, 70000.0, "1");
        debtorList.insertAtFront(debtor);
        
        Scanner inputNum = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        String name, category;
        double salary, amount;
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter name:");
            name = inputText.nextLine();
            System.out.println("Enter salary: RM ");
            salary = inputNum.nextDouble();
            System.out.println("Enter amount of debt: RM ");
            amount = inputNum.nextDouble();
            System.out.println("Enter category: ");
            category = inputText.nextLine();
            
            debtor = new Debtor(name, salary, amount, category);
            debtorList.insertAtBack(debtor);
        }
        
        debtor = debtorList.getFirst();
        System.out.println("\nDetails of debtors with salary above RM 2000.00: ");
        while(debtor != null)
        {
            if(debtor.getSalary() > 2000.0)
            {
                System.out.println(debtor.toString());
            }
            debtor = debtorList.getNext();
        }
        
        System.out.println("\nTotal amount of loans for category 1 debtors: RM " +count1(debtorList));
        
        debtor = debtorList.getFirst();
        System.out.println("\nThe amount to be paid by each debtors: ");
        while(debtor != null)
        {
            System.out.println("\nName: " +debtor.getName());
            
            amount = debtor.getAmount();
            double amount_ToBe_paid = (amount * 0.15) + amount;
            System.out.println("Amount to be paid: RM " +amount_ToBe_paid);
            
            debtor = debtorList.getNext();
        }
    }
    
    public static double count1(LinkedList debtorList)
    {
        double total_amount = 0.0;
        Debtor debtor;
        
        debtor = debtorList.getFirst();
        while(debtor != null)
        {
            if(debtor.getCategory().equalsIgnoreCase("1"))
                total_amount += debtor.getAmount();
            debtor= debtorList.getNext();
        }
        return total_amount;
    }
}

class Debtor
{ 
    private String name; //debtor’s name
    private double salary; //debtor’s monthly salary
    private double amount; //loan amount
    private String category; //debtor’s employment type “1” or “2”
    
    public Debtor(String n, double s, double a, String c)
    {
        this.name = n;
        this.salary = s;
        this.amount = a;
        this.category = c;
    }
    
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    
    public String toString()
    {
        return "\nName: " +name+ "\nSalary: RM " +salary+ "\nAmount: RM " +amount+ "\nCategory: " +category;
    }
}

class Node
{ 
    Debtor element;
    Node next;
    
    public Node(Debtor element) 
    {
        this.element = element;
    }
}

class LinkedList
{ 
    private Node first, last, current;
    
    public LinkedList() 
    {
        first = last = current = null;
    }
    
    public void insertAtFront(Debtor element)
    {
        Node newNode = new Node(element);
        newNode.next = this.first;
        this.first = newNode;          
        if(this.last == null) 
        {
            this.last = this.first;
        }    
    }
    
    public void insertAtBack(Debtor element)
    {
        Node newNode = new Node(element);
        if(last == null)
        {
            first = last = newNode;
        }
        else
        {
            last.next = newNode;
            last = last.next;
        }
    }
    
    public Debtor getNext()
    {
        if(current == last)
        {
            return null;
        }
        else
        {
            current = current.next;
            return current.element;
        }
    }
    
    public Debtor getFirst()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            current = first;
            return current.element;
        }
    }
    
    public Debtor getLast()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            return last.element;
        }
    }
    
    public boolean isEmpty()
    {
        return(first == null);
    }
    
    public void clear()
    {
        this.first = this.current = this.last = null;
    }

    public boolean contains(Debtor element)
    {
        boolean isContain = false;
        this.current = this.first;
        
        while (this.current != null)
        {
            if (element.equals(this.current.element))
            {
                isContain = true;
                break;
            }
        }
 
        return isContain;
    }

    public Debtor removeFirst()
    {
        if (this.isEmpty()) 
        {
            return null;
        }
        else
        {
            this.current = this.first;
            this.first = this.first.next;            
            if (this.first == null)
                this.last = null;
            return current.element;
        }
    }
        
    public Debtor removeLast()
    {
        if (this.isEmpty()) 
            return null;
        else if (this.first == this.last)
        {
            this.current = this.first;
            this.first = this.last = null;           
            return current.element;            
        }
        else
        {
            this.current = this.first;
            while (this.current.next != last) {
                this.current = this.current.next;                
            }      
            Node temp = this.last;
            this.last = this.current;
            this.last.next = null;            
            return temp.element;
        }
    }
    
    public Debtor removeAfter(Debtor element)
    {        
        if (this.isEmpty())
        {
            return null;
        }
        else if (this.first == this.last)
        {
            this.current = this.first;
            this.first = this.last = null;           
            return current.element;            
        }
        else
        {
            Node previous = this.first;            
            while (previous.next != null)
            {
                if (element.equals(previous.element))
                {
                    break;
                }
                previous = previous.next;
            }            
            current = previous.next;
            previous.next = current.next;          
            return current.element;
        }
    }
    
    public String toString()
    {
        StringBuilder result = new StringBuilder("[");        
        if (this.isEmpty()) {
            result.append("The list is empty]");
        }
        else {
            this.current = this.first;
            while (this.current != null)
            {
                result.append(this.current.element);
                this.current = this.current.next;
                if (this.current != null)
                    result.append(", ");
                else
                    result.append("]");                
            }            
        }
        return result.toString();
    }
}