
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Athlete
{
    private String name;
    private double weight;
    private double height;
    
    public Athlete()
    {
        name = " ";
        weight = 0.0;
        height = 0.0;
    }
    
    public void setAthlete(String name, double weight, double height)
    {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    public String getName()
    { return name; }
    
    public double getWeight()
    { return weight; }
    
    public double getHeight()
    { return height; }
    
    public double calcBMI(double weight, double height)
    {
        double BMI;
        BMI = weight / Math.pow(height,2);
        return BMI;
    }
    
    public String toString()
    {
        return ("\nName: " +name+ "\nWeight(kg): " +weight+ "\nHeight(m): " +height);
    }
}
