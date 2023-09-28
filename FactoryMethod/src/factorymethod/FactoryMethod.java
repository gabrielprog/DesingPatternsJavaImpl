/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod;

/**
 *
 * @author gabras
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MakePerson person = new MakePerson();
        person.setName("Qualquer coisa");
        PersonFactory gabriel = person.makePerson();
        
        System.out.println(gabriel.namePrint());
    }
    
}
