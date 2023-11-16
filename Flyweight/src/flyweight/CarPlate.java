/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

/**
 *
 * @author gabras
 */
public class CarPlate implements CarFlyweigh {
    
    private String model;
    private String brand;
    
    public CarPlate(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
    
    @Override
    public void plateCar(String plateId) {
        System.out.println(
                        "model: " + this.model 
                        + " brand: " + this.brand 
                        + " Placa do carro: " + plateId);
    }
    
}
