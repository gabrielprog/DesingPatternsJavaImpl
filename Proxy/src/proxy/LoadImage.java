/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

/**
 *
 * @author gabras
 */
public class LoadImage implements Image {
    private String filename;
    
    public LoadImage(String filename) {
        this.filename = filename;
        this.loadFromDisk();
    }
    
    public void loadFromDisk() {
        System.out.println("Imagem carregada de: " + this.filename);
    }
    
    @Override
    public void display() {
        System.out.println("Imagem carrega: " + this.filename);
    }
    
}
