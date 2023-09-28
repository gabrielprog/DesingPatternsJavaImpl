/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gabras
 */
public class CarManagerPrototype {
    
    private Map<String, CarPrototype> carInstance;
    
    public CarManagerPrototype() {
        this.carInstance = new HashMap<>();
    }
    
    public void registerInstanceCar(String keyInstance, CarPrototype instance) {
        this.carInstance.put(keyInstance, instance);
    }
    
    public CarPrototype createCloneCar(String keyInstance) {
       CarPrototype cloneCar = this.carInstance.get(keyInstance);
       
       if(cloneCar == null) 
           throw new RuntimeException("Not found instance");
       
       return cloneCar.clone();
    }
}
