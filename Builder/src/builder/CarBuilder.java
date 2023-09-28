/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import builder.Car;

/**
 *
 * @author gabras
 */
public class CarBuilder {
    
    private Car carInstance;
    
    public CarBuilder() {
        carInstance = new Car();
    }
    
    public CarBuilder withColorOfCar(String color) {
        carInstance.colorOfCar = color;
        return this;
    }
    
    public CarBuilder withModelOfCar(String model) {
        carInstance.modelOfCar = model;
        return this;
    }
    
    public CarBuilder withMadeInYear(Integer year) { 
        carInstance.madeInYear = year;
        return this;
    }
    
    public Car build() { 
        return carInstance;
    }
    
}
