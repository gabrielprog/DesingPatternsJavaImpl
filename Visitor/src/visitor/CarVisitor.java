/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package visitor;

/**
 *
 * @author gabras
 */
public interface CarVisitor {
    void visit(Sedan sedan);
    void visit(SUV suv);
}
