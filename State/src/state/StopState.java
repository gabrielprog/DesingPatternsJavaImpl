/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author gabras
 */
public class StopState implements State {

    @Override
    public void changeState(Context context) {
        System.out.println("Máquina de venda desligada.");
        context.setState(this);
    }
    
    @Override
    public String toString() {
        return "Stop State";
    }
    
}
