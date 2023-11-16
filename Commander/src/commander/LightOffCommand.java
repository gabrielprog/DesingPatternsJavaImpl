/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commander;

/**
 *
 * @author gabras
 */
public class LightOffCommand implements SendCommand {
    
    private ReceivarLight light;

    public LightOffCommand(ReceivarLight light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        this.light.turnOff();
    }

    @Override
    public void undo() {
        this.light.turnOn();
    }
    
}
