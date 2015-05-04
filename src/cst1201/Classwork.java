/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

import java.util.Random;

/**
 *
 * @author class
 */
public class Classwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = rect1;

        rect2.setLength(5);
        rect1.setWidth(100);

        System.out.println(rect1.getLength()); //printed 5.0
        System.out.println(rect2.getLength()); //should print 5.0
        System.out.println(rect1.getWidth()); // prints 0.0
        System.out.println("The area of the rectangle is as follows: ");
        System.out.println(rect1.getArea());

        int width = 0;
        System.out.println(width); //prints 0

        Random rand = new Random();
        rand.nextInt();
        Random rand2 = rand;

        Rectangle rect3 = new Rectangle();
        System.out.println("This rectangle has a length of: "
                + rect3.getLength() + " and a width of " + rect3.getWidth());

        System.out.println("Calling the overloaded add methods: ");

        String combined = add("Hello", " there");
        System.out.println("The combined string is: " + combined);

    }

    private static String add(String s1, String s2) {
        System.out.println("In the string concatenation method");
        return s1 + s2;
    }

    private static int add(int i1, int i2) {
        System.out.println("In the integer addition method");
        return i1 + i2;

    }
}
