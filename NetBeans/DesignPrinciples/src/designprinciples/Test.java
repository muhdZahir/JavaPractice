/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class Test
{
    public static void main(String[] args)
    { 
        Circle circle = new Circle();
        System.out.println("Circle area: " +circle.findArea()); // calls findArea() in Circle
        
        Cylinder cylinder = new Cylinder(3.0,5.0);
        System.out.println("Cylinder area: "+cylinder.findArea()); // calls findArea() in Cylinder
        
        Vehicle ride1 = new Car(1.5);
        Vehicle ride2 = new Aeroplane(1000);
        
        ride1.displayVehicleDetails();
        ride2.displayVehicleDetails();
        
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        
        leaf.turn();
        page.turn();
        pancake.turn();
        
        School sch = new School("Muhammad Zahiruddin","Address",68100,522131);
        sch.display();
    }
}