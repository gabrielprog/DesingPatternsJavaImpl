/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediator;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MediatorCar mediatorCar = new ConcreteCarMediator();
        
        CarColleague car1 = new CarColleague("Corolla", mediatorCar);
        CarColleague car2 = new CarColleague("Honda civic", mediatorCar);
        CarColleague car3 = new CarColleague("Camaro", mediatorCar);
        
        car1.sendMessage("Alpha-11");
        car2.sendMessage("Beta-6");
        car3.sendMessage("PapaMike");
       
    }
    
}
