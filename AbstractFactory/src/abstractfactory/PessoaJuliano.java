/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author gabras
 */
public class PessoaJuliano implements PessoaFactory {

    @Override
    public Nome createNome() {
        return new Nome();
    }

    @Override
    public Idade createIdade() {
        return new Idade();
    }

    
    
}
