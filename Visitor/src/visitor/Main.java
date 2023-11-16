/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitor;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.accept(new SedanInfoVisitor());
        
        Car SUV = new SUV();
        SUV.accept(new SUVInfoVisitor());
    }
    
}
