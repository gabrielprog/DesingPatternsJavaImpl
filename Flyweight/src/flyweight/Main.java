/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flyweight;

/**
 *
 * @author gabras
 */
public class Main {

    public static void main(String[] args) {
        FactoryCarPlate carPlate = new FactoryCarPlate();
        
        CarPlate car = carPlate.getInstanceCarPlate("Corolla", "Toyota");
        car.plateCar("AGB-345");
        car.plateCar("DSF-345");
    }
    
}
