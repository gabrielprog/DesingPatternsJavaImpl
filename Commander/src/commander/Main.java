/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commander;

/**
 *
 * @author gabras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SendCommand lightOn = new LightOnCommand(new ReceivarLight());
        SendCommand lightOff = new LightOffCommand(new ReceivarLight());
        
        RemoteControlCommand controlCommand = new RemoteControlCommand();
        controlCommand.executeCommand(lightOn);
        controlCommand.executeCommand(lightOff);
        
        controlCommand.undoLastCommand();
        controlCommand.undoLastCommand();
    }
    
}
