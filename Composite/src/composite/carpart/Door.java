/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.carpart;

import composite.automaker.CarAutomaker;

/**
 *
 * @author gabras
 */
public class Door implements CarAutomaker {
    @Override
    public void assemble() {
        System.out.println("Montando porta");
    }
}
