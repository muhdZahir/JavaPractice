
/**
 * Write a description of class Lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Lecturer
{
    private String Name;
    private int StaffID;
    private int Grade;

    public Lecturer(String Name, int StaffID, int Grade)
    {
        this.Name = Name;
        this.StaffID = StaffID;
        this.Grade = Grade;
    }

    public String getName() { return Name; }
    public int getStaffID() { return StaffID; }
        public int getGrade() { return Grade; }

        public String toString()
        {
            return ("\nName: " +Name+ "\nStaff ID: " +StaffID+ "\nGrade: " +Grade);
        }
}

