/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author gabras
 */
class SUVInfoVisitor implements CarVisitor {
    @Override
    public void visit(Sedan sedan) {
        // Não faz nada para Sedan
    }

    @Override
    public void visit(SUV suv) {
        System.out.println("Informações sobre um SUV.");
    }
}
