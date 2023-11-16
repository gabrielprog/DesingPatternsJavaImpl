/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iterator;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VideoItem[] videoItems = new VideoItem[5];
        
        videoItems[0] = new VideoItem("Gabriel coder", 0);
        
        videoItems[1] = new VideoItem("Lucas coder", 1);
        
        videoItems[2] = new VideoItem("Mathias coder", 2);
        
        videoItems[3] = new VideoItem("Junior coder", 3);
        
        videoItems[4] = new VideoItem("Evellyn coder", 4);
        
        Iterator iteratorVideoItem = new VideoIterator(videoItems);
        
        while (iteratorVideoItem.hasNext()) {
            System.out.println("return: " + iteratorVideoItem.next());
        }
    }
    
}
