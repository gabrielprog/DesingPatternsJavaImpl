/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

import composite.carpart.*;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Composite compositeCar = new Composite();
        
        compositeCar.addPart(new Wheel());
        compositeCar.addPart(new Door());
        compositeCar.addPart(new Engine());
        
        compositeCar.assemble();
        
    }
    
}
