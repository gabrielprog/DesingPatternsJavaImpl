/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder;

/**
 *
 * @author gabras
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car corolla = new CarBuilder()
                .withColorOfCar("Azul")
                .withModelOfCar("Corolla")
                .withMadeInYear(2002)
                .build();
        System.out.println(corolla);
    }
    
}
