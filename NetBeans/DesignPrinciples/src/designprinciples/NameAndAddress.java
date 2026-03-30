/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class NameAndAddress
{
    private String name;
    private String address;
    private int zipCode;
    
    public NameAndAddress(String nm, String add, int zip)//constructor with parameter
    {
        name = nm;
        address = add;
        zipCode = zip;
    }
    
    public void display()
    {
        System.out.println(name);
        System.out.println(address);
        System.out.println(zipCode);
    }
}