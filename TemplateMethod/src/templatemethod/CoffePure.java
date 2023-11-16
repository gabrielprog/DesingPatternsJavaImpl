/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author gabras
 */
public class CoffePure extends CoffeTemplateMethod {

    @Override
    void makeCoffe() {
        System.out.println("Fazendo café puro");
    }

    @Override
    void addSugar() {
        System.out.println("Adicionando açúcar");
    }
    
}
