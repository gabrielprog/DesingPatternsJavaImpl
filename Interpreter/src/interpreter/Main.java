/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interpreter;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expression four = new NumberExpression(4);
        Expression five = new NumberExpression(5);
        
        Expression addExpression = new AdditionExpression(four, five);
        Expression subExpression = new SubtractionExpression(addExpression, five);
        
        System.out.println("return: " + subExpression.interpret());
    }
    
}
