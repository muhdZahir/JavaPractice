/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class House extends Building
{
    private int houseNo;
    
    public House(int houseNo)
    {
        super("100 X 90", 100000);
        this.houseNo = houseNo;
    }
    
    public void displayHouseDetails()
    { 
        System.out.println("House no: " +houseNo);
        System.out.println("Size: " +size);
        System.out.println("Price: " +price );
    }
}
