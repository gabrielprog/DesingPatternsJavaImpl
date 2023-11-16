/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresposability;

/**
 *
 * @author gabras
 */
public class ConcreteHandlerCarTires implements HandlerCar {
    
    private HandlerCar next;

    public void setNext(HandlerCar next) {
        this.next = next;
    }

    @Override
    public void makeMainIntenance(Car car) {
        if(this.next == null)
            System.out.println("Trocando pneus do carro: " + car.getName());
        
        else next.makeMainIntenance(car);
    }
    
}
