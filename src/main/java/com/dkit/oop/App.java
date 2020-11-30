package com.dkit.oop;

import java.util.ArrayList;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name:
 * <p>
 * Your GitHub link:
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("Q1 - some simple tests");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130, " Mains Water");
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea());


        System.out.println("Q2 - tests");

        Property prop1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130, " Mains Water");
        Property prop2 = new Property(1, "John Hogan", "A92AB12", 450000, 120, " Electricity");
        Property prop3 = new Property(1, "Dez Grant", "A91AB12", 285000, 131, " Private Access");


        ArrayList<Property> properties = new ArrayList<>(3);
        properties.add(prop1);
        properties.add(prop2);
        properties.add(prop3);







        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

