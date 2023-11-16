/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatemethod;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoffeTemplateMethod coffe = new CoffeWithMilk();
        coffe.makeDrink();
        System.out.println("");
        coffe = new CoffePure();
        coffe.makeDrink();
    }
    
}
