/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author gabras
 */
public class ExampleBubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        for(int number : array)
            System.out.print(number);
        
        System.out.println("\nOrdenando com Bubble Sort");
    }
}
