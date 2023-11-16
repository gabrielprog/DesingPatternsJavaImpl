/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author gabras
 */
public class CoffeWithMilk extends CoffeTemplateMethod {

    @Override
    void makeCoffe() {
        System.out.println("Fazendo café com leite");
    }

    @Override
    void addSugar() {
        System.out.println("Adicionando leite e açúcar");
    }
    
}
