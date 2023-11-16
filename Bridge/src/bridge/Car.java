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
abstract class Car{
    
    protected EngineCar engineCar;
    
    public Car() {}
    
    public Car(EngineCar engineCar) {
        this.engineCar = engineCar;
    }
    
    abstract void run();
    
}
