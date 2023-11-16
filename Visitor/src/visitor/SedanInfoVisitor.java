/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author gabras
 */
class SedanInfoVisitor implements CarVisitor {
    @Override
    public void visit(Sedan sedan) {
        System.out.println("Informações sobre um Sedan.");
    }

    @Override
    public void visit(SUV suv) {
        // Não faz nada para SUV
    }
}
