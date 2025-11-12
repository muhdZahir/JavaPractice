
/*
Cinema Application
*/
import java.util.*;
public class CinemaApp
{
    public static void main(String[] args)
    {

        Scanner inputNum =  new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        LinkedList CinemaLL = new LinkedList();
        for (int i=0; i<3; i++)
        {
            System.out.println("Enter cinema code, i.e. Ha111, Ha112:"); 
            String cc = inputText.nextLine();
            System.out.println("Enter movie title:");
            String mTitle = inputText.nextLine();
            System.out.println("Enter price:");
            double p = inputNum.nextDouble();
            System.out.println("Enter mode payment(cash or credit card):");
            String mp = inputText.nextLine();
            System.out.println("Member or not(Y-yes,N-no):"); 
 
            char m = inputText.nextLine().toUpperCase().charAt(0);
            boolean isMember = false;
            if(m == 'Y')
                isMember = true;

            Cinema cinema = new Cinema(cc, mTitle, p, mp, isMember);
            CinemaLL.insertAtFront(cinema);
        }
        
        //display the count of customer in cinema code Ha111 using method detCountHa111()
        System.out.println("The number of customer in Ha111:"+detCountHa111(CinemaLL));
        
        //display the details of movie named "Enchanted" if it is exist and display 
        //an appropriate message if it is not exist
        boolean found=false;
        Cinema foundItem=null;;
        Cinema cinema = CinemaLL.getFirst();
        while(cinema != null)
        {
            if (cinema.getMovieTit1e().equalsIgnoreCase("Enchanted"))
            {   foundItem=cinema; 
                found=true;
            }  
            cinema = CinemaLL.getNext();
        }
        if(found==true)
            System.out.println(foundItem.toString());
        else
            System.out.println("Sorry, the movie is not exist.\n");
            
        //a) insert at the front of cinema linked list the given value;Cinema Code:Ha111,
        //Movie Title:Taubat di Hujung Nyawa, Ticket Price: RM 24.50, 
        //Mode Payment: credit card, Member:true
        cinema = new Cinema("Ha111", "Taubat di Hujung Nyawa", 24.50, "credit card", true);
        CinemaLL.insertAtFront(cinema);
        
        //b) input 2 more value into the linked list
        for (int i=0; i<2; i++)
        {
            System.out.println("Enter cinema code, i.e. Ha111, Ha112:"); 
            String cc = inputText.nextLine();
            System.out.println("Enter movie title:");
            String mTitle = inputText.nextLine();
            System.out.println("Enter price:");
            double p = inputNum.nextDouble();
            System.out.println("Enter mode payment(cash or credit card):");
            String mp = inputText.nextLine();
            System.out.println("Member or not(Y-yes,N-no):"); 
 
            char m = inputText.nextLine().toUpperCase().charAt(0);
            boolean isMember = false;
            if(m == 'Y')
                isMember = true;

            cinema = new Cinema(cc, mTitle, p, mp, isMember);
            CinemaLL.insertAtFront(cinema);
        }
        
        //c) display the count of data in the cinema linked list
        int count = 0;
        cinema = CinemaLL.getFirst();
        while(cinema != null)
        {
            count++;
            cinema = CinemaLL.getNext();
        }
        System.out.println("\nThe number of data in cinema linked list: " +count);
        
        //d) display the average price of the ticket
        double sum = 0.0, avg = 0.0;
        cinema = CinemaLL.getFirst();
        while(cinema != null)
        {
            sum += cinema.getPrice();
            cinema = CinemaLL.getNext();
        }
        avg = sum / count;
        System.out.println("\nThe average price of tickets: RM " +avg);
        
        //e) display members detail
        System.out.println("\nThe details of members: \n");
        cinema = CinemaLL.getFirst();
        while(cinema != null)
        {
            if(cinema.getMembership() == true)
            {
                System.out.println(cinema.toString()+ "\n");
            }
            cinema = CinemaLL.getNext();
        }
        
        //f) display the details movie
        System.out.println("\nThe details of the movies: \n");
        cinema = CinemaLL.getFirst();
        while(cinema != null)
        {
            System.out.println(cinema.toString()+ "\n");
            cinema = CinemaLL.getNext();
        }

    }
    
    public static int detCountHa111(LinkedList cinemaLL)
    {
        int countHa111=0;
        Cinema cinema;
        
        cinema = cinemaLL.getFirst();
        while(cinema!=null)
        {   if(cinema.getCode().equalsIgnoreCase("Ha111"))
                countHa111=countHa111+1;
            cinema=cinemaLL.getNext();
        }
        return countHa111;
    }
}

