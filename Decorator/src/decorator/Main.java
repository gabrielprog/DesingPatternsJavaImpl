/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coffe coffe = new CoffeSimple();
        System.out.println( "return: " + coffe.makeCoffe());
        
        coffe = new CoffeWithMilk(coffe);
        System.out.println( "return: " + coffe.makeCoffe());
    }
    
}
