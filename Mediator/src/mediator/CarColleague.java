/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

/**
 *
 * @author gabras
 */
public class CarColleague {
    private String name;
    private MediatorCar mediatorCar;

    public CarColleague(String name, MediatorCar mediatorCar) {
        this.name = name;
        this.mediatorCar = mediatorCar;
        this.mediatorCar.registerCar(this);
    }
    
    public void sendMessage(String message) {
        this.mediatorCar.notifyCar(this, message);
    }
    
    public void receiveMessage(String message){ 
        System.out.println(this.name + " recebeu a mensagem: " + message);
    }
    
    public String getName() {
        return name;
    }
}
