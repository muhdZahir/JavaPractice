
/**
 * Write a description of class CarApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class CarApp
{
    public static void main(String args[])
    {
        Stack<Car> carSt = new Stack<Car>();
        Stack<Car> carTemp = new Stack<Car>();
        
        //a) Insert 5 car details into stack
        Scanner input = new Scanner(System.in);
        Car car;
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter car model: ");
            String model = input.next();
            System.out.println("Enter the year car manufactured: ");
            int year = input.nextInt();
            System.out.println("Enter car manufacturer: ");
            String manufacturer = input.next();
            System.out.println("Enter car price: RM ");
            double price = input.nextDouble();
            
            car = new Car(model, manufacturer, year, price);
            carSt.push(car);
        }
        
        //b) Display the list of models and prices of cars produced by Toyota
        System.out.println("\nList of models and prices of cars produced by Toyota: ");
        while(!carSt.isEmpty())
        {
            car = carSt.pop();
            if(car.getManufacturer().equalsIgnoreCase("Toyota"))
            {
                System.out.println("Model: " +car.getModel());
                System.out.println("Price: RM " +car.getPrice());
            }
            carTemp.push(car);
        }
        
        //c) Count the number of cars produced in 2020
        int count2020 = 0;
        while(!carTemp.isEmpty())
        {
            car = carTemp.pop();
            if(car.getYear() == 2020)
                count2020++;
            carSt.push(car);
        }
        System.out.println("\nThe number of cars produced in 2020: " +count2020);
    }
}
