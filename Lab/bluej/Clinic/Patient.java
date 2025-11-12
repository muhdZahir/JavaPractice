
/**
 * Write a description of class Patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient
{
    private String name;
    private String ward;
    private Medicine medic;
    
    public Patient()
    {
        name = " ";
        ward = " ";
        medic = new Medicine();
    }
    
    public void setPatient(String name, String ward, Medicine medic)
    {
        this.name = name;
        this.ward = ward;
        this.medic = medic;
    }
    
    public String getName() { return name; }
    public String getWard() { return ward; }
    public Medicine getMedic() {return medic; }
    
    public String toString()
    {
        return ("\nPatient Name: " +name+ "\nPatient Ward: " +ward+ "\nMedicine Details: " +medic.toString() );
    }
}
