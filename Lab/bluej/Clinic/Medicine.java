
/**
 * Write a description of class Medicine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medicine
{
    private String MedicCode;
    private String MedicType;
    private String MedicName;
    private double MedicPrice;
    
    public Medicine()
    {
        MedicCode = " ";
        MedicType = " ";
        MedicName = " ";
        MedicPrice = 0.0;
    }
    
    public Medicine(String MedicCode, String MedicType, String MedicName, double MedicPrice)
    {
        this.MedicCode = MedicCode;
        this.MedicType = MedicType;
        this.MedicName = MedicName;
        this.MedicPrice = MedicPrice;
    }
    
    public void setMedic(String MedicCode, String MedicType, String MedicName, double MedicPrice)
    {
        this.MedicCode = MedicCode;
        this.MedicType = MedicType;
        this.MedicName = MedicName;
        this.MedicPrice = MedicPrice;
    }
    
    public String getMedicCode() { return MedicCode; }
    public String getMedicType() { return MedicType; }
    public String getMedicName() { return MedicName; }
    public double getMedicPrice() { return MedicPrice; }
    
    public String toString()
    {
        return ("\nMedicine Code: " +MedicCode+ "\nMedicine Type: " +MedicType+ "\nMedicine Name: " +MedicName+
        "\nMedicine Price: RM " +MedicPrice );
    }
}
