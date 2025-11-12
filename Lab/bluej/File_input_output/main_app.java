import java.io.*;
import java.util.*;
public class main_app
{
    public static void main(String args[])throws IOException
    {
        try
        {
            FileReader fr = new FileReader("stud.dat");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("threePointerAbove.dat")));
            
            Student [] stud = new Student[10];
            
            String line = null;
            String name, matric_number;
            double cgpa;
            int count = 0, i = 0;
            
            line = br.readLine();
            while (line != null)
            {
                StringTokenizer st = new StringTokenizer(line,"*");
                name = st.nextToken();
                matric_number = st.nextToken();
                cgpa = Double.parseDouble(st.nextToken());
                
                stud[count] = new Student();
                stud[count].setStudent(name, matric_number, cgpa);
                
                count++;
                
                line = br.readLine();
            }
            
            System.out.println("\nValue in the stud.dat:");
            for(i = 0;i < count;i++)
            { 
                System.out.println(stud[i].toString());
            }
            
            int countStud = 0;
            for(i = 0; i < count; i++)
            {
                if(stud[i].getCGPA() > 3.0)
                    countStud++;
            }
            System.out.println("The number of students that get cgpa more than 3.0: " +countStud);
            
            pw.println("Students that get cgpa more than 3.0: ");
            for(i = 0; i < count; i++)
            {
                if(stud[i].getCGPA() > 3.0)
                     pw.println(stud[i].getName());
            }
            
            double lowestCGPA = stud[0].getCGPA();
            int index = 0;
            for(i = 0; i < count; i++)
            {
                if(stud[i].getCGPA() < lowestCGPA)
                {
                    lowestCGPA = stud[i].getCGPA();
                    index = i;
                }
            }
            System.out.println("Student who gets the lowest cgpa: \n" +stud[index].toString());
            
            br.close();
            pw.close();
        
        }
        
        catch(EOFException eof)
        { System.out.println("Problem: "+eof.getMessage()); }
        catch(FileNotFoundException e)
        { System.out.println("Problem: "+e.getMessage()); }
        catch(IOException ioe)
        { System.out.println("Problem: "+ioe.getMessage()); }
        finally
        { System.out.println("End of the program"); }
    }
}

