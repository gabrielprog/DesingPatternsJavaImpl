/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author gabras
 */
public class EditorStorage {
    private String content;
    
    public void restoreFromMemento(EditorMemento mementoInstance) {
        content = mementoInstance.getContent();
    }
    
    public EditorMemento createEditorMemento() {
        return new EditorMemento(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
