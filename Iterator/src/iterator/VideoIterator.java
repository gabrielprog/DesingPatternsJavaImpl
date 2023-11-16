/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

/**
 *
 * @author gabras
 */
public class VideoIterator implements Iterator {
    
    private VideoItem[] itens;
    private int indexCursor;

    public VideoIterator(VideoItem[] itens) {
        this.itens = itens;
    }
    
    @Override
    public Object next() {
        VideoItem videoItem = itens[indexCursor];
        indexCursor++;
        
        return videoItem;
    }

    @Override
    public boolean hasNext() {
        if(indexCursor >= itens.length || itens[indexCursor] == null) 
            return false;
        
        return true;
    }
    
}
