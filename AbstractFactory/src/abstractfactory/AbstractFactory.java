/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author gabras
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PessoaFactory gabriel = new PessoaGabriel();
        Nome pessoaGabriel = gabriel.createNome();
        pessoaGabriel.setNome("Gabriel");
        
        System.out.println(pessoaGabriel.getNome());
    }
    
}
