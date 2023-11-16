/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

import bridge.engine.EngineCar;

/**
 *
 * @author gabras
 */
public class SedanCar extends Car {
    
    public SedanCar(EngineCar engine) {
        super(engine);
        
    }
    
    @Override
    void run() {
        System.out.println("Carro correndo 100km/s");
        engineCar.onEngine();
    }
    
}
