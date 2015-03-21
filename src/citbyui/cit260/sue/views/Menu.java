/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.sue.views;

/**
 *
 * @author Sue
 */
import citbyui.cit260.sue.enums.Animals;
import citbyui.cit260.sue.interfaces.DisplayInfo;
import citbyui.cit260.sue.interfaces.EnterInfo;
import java.util.Scanner;


public abstract class Menu implements DisplayInfo, EnterInfo{
    Animals[] animals = Animals.values();
    int num;
    
    @Override
    public void display(){
        System.out.println("The animal is: " + animals[num].name());
        System.out.println(animals[num].description);
         
    }
    @Override
    public void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number between 1 and 5");
        num = input.nextInt();
        num--;
    }


}
