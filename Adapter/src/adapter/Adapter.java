/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

/**
 *
 * @author gabras
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mechanic juninho = new MechanicCombustionAdapter(new CarCombustion());
        juninho.onMotorCar();
        
        Mechanic alfredo = new MechanicEletricAdapter(new CarEletric());
        alfredo.onMotorCar();
        alfredo.run();
    }
    
}
