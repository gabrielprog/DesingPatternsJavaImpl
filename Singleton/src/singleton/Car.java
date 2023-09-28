/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author gabras
 */
public class Car {
    
    private static Car car;
    
    private Car() {
    }
    
    public static Car getInstance() {
        if(car == null) car = new Car();
        
        return car;
    }
    
    public static void print() {
        System.out.println("EXEMPLO< MAIS NUNCA È ACESSADO NOVO OBJETO");
    }
    
}
