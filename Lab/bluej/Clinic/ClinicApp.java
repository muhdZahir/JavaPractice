
/**
 * Write a description of class ClinicApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class ClinicApp
{
    public static void main(String args[])
    {
        // a) Create 4 Patient object using an array
        Patient [] p = new Patient[4];
        
        Scanner input = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        
        int i;
        String name, ward, MedicCode, MedicType, MedicName;
        double MedicPrice;
        
        // b) Input all patient detail and his/her medicine detail by calling necessary method
        for(i = 0; i < 4; i++)
        {
            System.out.println("Enter the patient's name: ");
            name = inputText.nextLine();
            System.out.println("Enter the patient's ward: ");
            ward = inputText.nextLine();
            System.out.println("Enter the code of the medicine: ");
            MedicCode = inputText.nextLine();
            System.out.println("Enter the type of the medicine: ");
            MedicType = inputText.nextLine();
            System.out.println("Enter the name of the medicine: ");
            MedicName = inputText.nextLine();
            System.out.println("Enter the price of the medicine (RM): ");
            MedicPrice = inputNum.nextDouble();
            
            p[i] = new Patient();
            p[i].setPatient(name, ward, new Medicine(MedicCode,MedicType,MedicName,MedicPrice) );
        }
        
        // c)Display the details of patients in Wad 3C Melor
        for(i = 0; i < 4; i++)
        {
            if(p[i].getWard().equalsIgnoreCase("3C Melor"))
            {
                System.out.println("The details of the patient: \n" +p[i].toString());
            }
        }
        
        // d) Display the details of patient name Zulkifli(searching)
        for(i = 0; i < 4; i++)
        {
            if(p[i].getName().equalsIgnoreCase("Zulkifli"))
            {
                System.out.println("The details of the patient: \n" +p[i].toString());
            }
        }
        
        // e) Display the average price of medicine
        double sum = 0.0, avg;
        for(i = 0; i < 4; i++)
        {
            sum = sum + p[i].getMedic().getMedicPrice();
        }
        avg = sum/4;
        
        System.out.println("The average price of medicine: RM " +avg);
    }
}
