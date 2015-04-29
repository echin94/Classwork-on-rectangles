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
        rect1.setWidth(-100);
        
        
        System.out.println(rect1.getLength()); //printed 5.0
        System.out.println(rect2.getLength()); //should print 5.0
        System.out.println(rect1.getWidth()); // prints 100.0
        
        
        int width = 0;
        System.out.println(width); //prints 0
        
        Random rand = new Random();
        rand.nextInt();
    }
    
}
