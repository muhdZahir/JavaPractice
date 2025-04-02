/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public abstract class Vehicle
{
    protected int manufacturedYear;
    protected double price_unit;
    
    protected Vehicle(int mYear, double uPrice)
    {
        manufacturedYear = mYear;
        price_unit = uPrice;
    }
    
    public abstract void displayVehicleDetails();
}