/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainofresposability;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChainWorkshopCar car = new ChainWorkshopCar();
        Car car1 = new Car("Corrolla");
        
        car.makeMainIntenance(car1);
    }
    
}
