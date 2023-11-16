/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

/**
 *
 * @author gabras
 */
public class LoadImageProxy implements Image {
    private LoadImage loadImage;
    private String filename;

    public LoadImageProxy(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void display() {
        if(this.loadImage == null) 
            this.loadImage = new LoadImage(filename);
        
        this.loadImage.display();
    }
    
}
