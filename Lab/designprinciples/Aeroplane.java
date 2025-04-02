/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class Aeroplane extends Vehicle
{
    protected int numPassenger;
    
    public Aeroplane(int numPass)
    {
        super(1990,500000.0);
        numPassenger = numPass;
    }
    
    public void displayVehicleDetails()
    {
        System.out.println("Aeroplane Details: \n");
        System.out.println("Year Manufactured: " +manufacturedYear+ "\nPrice: RM " +price_unit+ "\nNumber of Passenger: " +numPassenger+ "\n");
    }
}