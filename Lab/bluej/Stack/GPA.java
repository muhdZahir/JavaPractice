/* Write a Java program to calculate the GPA results of 3 students.
 * Display the GPA of each student.
 * Demonstrate the use of an array object in your solution.*/
public class GPA
{
    public static void main(String args[])
    {
        double[] gpa = {35.9, 78.4, 91.6};
        double total = 0;
        
        System.out.println("Display all student's gpa.");
        for(int i = 0; i < gpa.length; i++)
        {
            int stud = i + 1;
            System.out.println("Student " +stud+ ": " +gpa[i]);
            total += gpa[i];
        }
        System.out.println("Total GPA of 3 students: " +total);
    }
}
