/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;

import bridge.engine.EngineEletric;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car corolla = new SedanCar(new EngineEletric());
        
        corolla.run();
        
    }
    
}
