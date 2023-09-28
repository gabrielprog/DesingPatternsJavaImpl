/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author gabras
 */
public class MechanicEletricAdapter implements Mechanic {

    private CarEletric carEletric;
    
    public MechanicEletricAdapter(CarEletric carEletric) {
        this.carEletric = carEletric;
    }
    
    @Override
    public void onMotorCar() {
        this.carEletric.onMotorCar();
    }

    @Override
    public void run() {
        this.carEletric.run();
    }
    
}
