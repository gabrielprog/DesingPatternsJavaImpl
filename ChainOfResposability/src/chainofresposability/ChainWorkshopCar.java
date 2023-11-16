/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresposability;

/**
 *
 * @author gabras
 */
public class ChainWorkshopCar {
    
    private HandlerCar handlerCar;
    private ConcreteHandlerCarOil carOil;
    
    public ChainWorkshopCar() {
        carOil = new ConcreteHandlerCarOil();
        handlerCar = carOil;
        
        carOil.setNext(new ConcreteHandlerCarTires());
    }
    
    public void makeMainIntenance(Car car) {
        handlerCar.makeMainIntenance(car);
    }
    
}
