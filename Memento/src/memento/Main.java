/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memento;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorStorage editor = new EditorStorage();
        EditorManager history = new EditorManager();
        
        editor.setContent("Content saved 1 ");
        history.save(editor.createEditorMemento());
        System.out.println("Content current: " + editor.getContent());
        
        editor.setContent("Content saved 2");
        System.out.println("Content current: " + editor.getContent());
        
        editor.restoreFromMemento(history.getLastMemento());
        System.out.println("Content current: " + editor.getContent());
        
    }
    
}
