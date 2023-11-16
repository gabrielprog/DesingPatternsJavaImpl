/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mediator;

/**
 *
 * @author gabras
 */
public interface MediatorCar {
    void registerCar(CarColleague carColleague);
    void notifyCar(CarColleague carColleague, String message);
}
