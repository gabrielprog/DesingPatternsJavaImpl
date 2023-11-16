/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author gabras
 */
abstract class CoffeTemplateMethod {
    
    public void makeDrink() {
        this.boilWater();
        this.serveInCup();
        this.addSugar();
        this.makeCoffe();
    }
    private void boilWater() {
        System.out.println("Fervendo água");
    }

    private void serveInCup() {
        System.out.println("Servindo na xícara");
    }
    abstract void makeCoffe();
    abstract void addSugar();
}
