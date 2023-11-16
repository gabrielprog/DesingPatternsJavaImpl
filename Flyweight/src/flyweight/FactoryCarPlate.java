/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gabras
 */
public class FactoryCarPlate {
    
    private CarPlate carPlate;
    private Map<String, CarPlate> instanceFlyweigh = new HashMap<>();
    
    public CarPlate getInstanceCarPlate(String model, String brand) {
        String key = model + "_" + brand;
        
        if(instanceFlyweigh.containsKey(key))
            return instanceFlyweigh.get(key);
        
        carPlate = new CarPlate(model, brand);
        instanceFlyweigh.put(key, carPlate);
        
        return carPlate;
    }
}
