/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author gabras
 */
public class SmartphoneObserver implements Observer {

    private String name;
    
    public SmartphoneObserver(String nameSmartphone) {
        this.name = nameSmartphone;
    }
    
    @Override
    public void update(int firerate) {
        System.out.println(name + " - Celular em nova temperatura: " + firerate + " graus Celsius");
    }
    
}
