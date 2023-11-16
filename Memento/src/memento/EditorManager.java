/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabras
 */
public class EditorManager {
    
    private List<EditorMemento> instaceEditor;

    public EditorManager() {
        this.instaceEditor = new ArrayList<>();
    }
    
    public void save(EditorMemento editorMemento) {
        instaceEditor.add(editorMemento);
    }
    
    public EditorMemento getLastMemento() {
        if(instaceEditor.isEmpty())
            throw new RuntimeException("Not instance init");
        return instaceEditor.remove( instaceEditor.size() - 1 );
    }
}
