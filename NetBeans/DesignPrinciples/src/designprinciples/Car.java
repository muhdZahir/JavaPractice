/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class Car extends Vehicle
{
    private double cc;
    
    public Car(double cc)
    {
        super(2006, 100000.0);
        this.cc = cc;
    }
    
    public void displayVehicleDetails()
    {
        System.out.println("Car Details: \n");
        System.out.println("Year Manufactured: " +manufacturedYear+ "\nPrice: RM " +price_unit+ "\nCC: " +cc+ "\n");
    }
}