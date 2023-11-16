/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import composite.automaker.CarAutomaker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabras
 */
public class Composite implements CarAutomaker {
    
    private List<CarAutomaker> addPartsCar;
    
    public Composite() {
        addPartsCar = new ArrayList<>();
    }
    
    public void addPart(CarAutomaker part) {
        addPartsCar.add(part);
    }

    @Override
    public void assemble() {
        System.out.println("Montando carro: ");
        
        for(CarAutomaker partAutomaker : addPartsCar) {
            partAutomaker.assemble();
        }
        
    }
}
