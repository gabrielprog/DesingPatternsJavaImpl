/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author gabras
 */
public class Attendant {
    
    private CoffeBreak coffeBreak;
    
    public Attendant() {
        this.coffeBreak = new CoffeBreak();
    }
    
    public void serveCoffe() {
        this.coffeBreak.makeCoffe();
        System.out.println("Servindo café");
    }
    
    public void serveTea() {
        this.coffeBreak.makeTea();
        System.out.println("Servindo chá");
    }
    
    public void serveChocolate() {
        this.coffeBreak.makeHotChocolate();
        System.out.println("Servindo chocolate");
    }
}
