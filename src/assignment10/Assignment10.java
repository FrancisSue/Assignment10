/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment10;

import citbyui.cit260.sue.views.Stuff;
import citbyui.cit260.sue.exceptions.MenuException;

/**
 *
 * @author Sue
 */
public class Assignment10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Stuff menu = new Stuff();
            try {

                menu.getInput();
                menu.display();

            } catch (MenuException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (Throwable ex) {
            System.err.println("Unexpected runtime error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            //Close input file
        }
    }

}
