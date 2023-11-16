/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author gabras
 */
public abstract class DecoratorOfCoffe implements Coffe {
    
    private Coffe coffe;
    
    public DecoratorOfCoffe(Coffe coffe) {
        this.coffe = coffe;
    }

    @Override
    public String makeCoffe() {
        return this.coffe.makeCoffe();
    }
    
}
