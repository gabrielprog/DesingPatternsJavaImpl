/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author gabras
 */
public class Car {
    
    public String colorOfCar;
    public String modelOfCar;
    public Integer madeInYear;

    Car() {
    }
    
    public String getColorOfCar() {
        return colorOfCar;
    }

    public void setColorOfCar(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public Integer getMadeInYear() {
        return madeInYear;
    }

    public void setMadeInYear(Integer madeInYear) {
        this.madeInYear = madeInYear;
    }
    
    @Override
    public String toString() {
        return "Car{" + "colorOfCar=" + colorOfCar + ", modelOfCar=" + modelOfCar + ", madeInYear=" + madeInYear + '}';
    }
    
}
