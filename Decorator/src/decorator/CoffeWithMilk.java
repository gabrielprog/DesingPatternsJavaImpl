/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author gabras
 */
public class CoffeWithMilk extends DecoratorOfCoffe {

    public CoffeWithMilk(Coffe coffe) {
        super(coffe);
    }
    
    @Override
    public String makeCoffe() {
        return super.makeCoffe() + " com leite ";
    }
}
