/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio29CommandCanalTV;

import java.util.ArrayList;

/**
 *
 * @author davidpvilaca
 */
public class ControlTVListeners {
    private final ArrayList<Command> commandsHistory = new ArrayList();
    private Command upCommand;
    private Command downCommand;
    
    public ArrayList<Command> getCommandList() {
        return this.commandsHistory;
    }
    
    public void setCommands(Command up, Command down) {
        this.upCommand = up;
        this.downCommand = down;
    }
    
    public void listenUp() {
        this.commandsHistory.add(this.upCommand);
        this.upCommand.execute();
    }
    
    public void listenDown() {
        this.commandsHistory.add(this.upCommand);
        this.downCommand.execute();
    }
}
