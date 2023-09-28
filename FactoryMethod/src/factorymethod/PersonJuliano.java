/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author gabras
 */
public class PersonJuliano implements PersonFactory {
    
    private String name = "Juliano";

    public String getName() {
        return name;
    }

    @Override
    public String namePrint() {
        return this.name;
    }

}
