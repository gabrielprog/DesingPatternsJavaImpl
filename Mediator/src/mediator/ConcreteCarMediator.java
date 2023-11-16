/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabras
 */
public class ConcreteCarMediator implements MediatorCar {
    
    private List<CarColleague> carColleagues;
    
    public ConcreteCarMediator() {
        carColleagues = new ArrayList<>();
    }

    @Override
    public void registerCar(CarColleague carColleague) {
        this.carColleagues.add(carColleague);
    }

    @Override
    public void notifyCar(CarColleague carColleague, String message) {
        // ISSO É UMA MÁ PATRICA, EU SEI
        System.out.println("Quem emitiu: " + carColleague.getName());
        
        for(CarColleague car : carColleagues) {
            if(car != carColleague) car.receiveMessage(message);
        }
    }
    
}
