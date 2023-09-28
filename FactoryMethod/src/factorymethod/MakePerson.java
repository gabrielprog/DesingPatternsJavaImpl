/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author gabras
 */
public class MakePerson implements FactoryPerson {
    
    private String name;
    
    public PersonFactory makePerson() {
     
        if(this.name.equals("Gabriel")){
            return new PersonGabriel();
        }else {
            return new PersonJuliano();
        }
        
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
