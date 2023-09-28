/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author gabras
 */
public class Car implements CarPrototype {
    
    private int carSpeed;
    
    public Car(int carSpeed) {
        this.carSpeed = carSpeed;
    }
    
    @Override
    public CarPrototype clone() {
        return new Car(this.carSpeed);
    }

    @Override
    public void runCar() {
        System.out.println( "Car speed is: " + this.carSpeed );
    }
    
}
