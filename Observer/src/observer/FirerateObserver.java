/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author gabras
 */
public class FirerateObserver implements Observer {
    private String name;
    
    public FirerateObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int firerate) {
        System.out.println(name + " - Nova temperatura: " + firerate + " graus Celsius");
    }
    
}
