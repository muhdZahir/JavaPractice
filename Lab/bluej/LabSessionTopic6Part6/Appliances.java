
/**
 * Write a description of class Appliances here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Appliances
{
   private String name; //fan,microwave,blender
   private int watt;
   
   public Appliances(String name, int watt)
   {    this.name=name;
        this.watt=watt;
   }
   
   public void setName(String name){this.name=name;}
   public void setWatt(int watt){this.watt=watt;}
   
   public String getName(){return name;}
   public int getWatt(){return watt;}
   
   public String toString()
   {    return ("Name of appliances:"+name+"\nWatt:"+watt);}
   
}
