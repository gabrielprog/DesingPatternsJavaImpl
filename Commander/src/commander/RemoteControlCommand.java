/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commander;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabras
 */
public class RemoteControlCommand {

    private List<SendCommand> commandHistory = new ArrayList<>();

    public void executeCommand(SendCommand command) {
        command.execute();
        commandHistory.add(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            SendCommand lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }
}
