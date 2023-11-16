/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {5, 1, 4, 2, 8};
        
        ContextStrategy context = new ContextStrategy();
        
        context.setSortingStrategy(new ExampleBubbleSort());
        context.performSort(data);
        
        context.setSortingStrategy(new ExampleQuickSort());
        context.performSort(data);
    }
    
}
