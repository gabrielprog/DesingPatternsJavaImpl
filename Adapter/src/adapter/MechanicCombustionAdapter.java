/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author gabras
 */
public class MechanicCombustionAdapter implements Mechanic {
    
    private CarCombustion carCombustion;
    
    public MechanicCombustionAdapter(CarCombustion carCombustion) {
        this.carCombustion = carCombustion;
    }
    
    @Override
    public void onMotorCar() {
        this.carCombustion.onMotorCar();
    }

    @Override
    public void run() {
        this.carCombustion.run();
    }
    
}
