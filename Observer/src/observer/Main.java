/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        FirerateObserver firerateObserver1 = new FirerateObserver("Display 01");
        FirerateObserver firerateObserver2 = new FirerateObserver("Display 02");
        SmartphoneObserver samsung = new SmartphoneObserver("M-20");
        
        subject.addObserver(firerateObserver1);
        subject.addObserver(firerateObserver2);
        subject.addObserver(samsung);
        
        subject.setFirerate(10);
    }
    
}
