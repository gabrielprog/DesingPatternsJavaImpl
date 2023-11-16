/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package state;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context context = new Context();
        
        StartState startState = new StartState();
        startState.changeState(context);
        System.out.println("Estado atual: " + context.getState());
        
        StopState stopState = new StopState();
        stopState.changeState(context);
        System.out.println("Estado atual: " + context.getState());
        
    }
    
}
