/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototype;

/**
 *
 * @author gabras
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarManagerPrototype createCar = new CarManagerPrototype();
        
        createCar.registerInstanceCar("corolla", new Car(10));
        
        CarPrototype corolla = createCar.createCloneCar("corolla");
        CarPrototype corolla2 = createCar.createCloneCar("corolla");
        
        
        corolla.runCar();
        corolla2.runCar();
    }
    
}
