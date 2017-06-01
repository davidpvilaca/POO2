/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio29CommandCanalTV;

/**
 *
 * @author davidpvilaca
 */
public class UpChannelCommand extends Command {

    public UpChannelCommand(ControlTV control) {
        super(control);
    }

    @Override
    public void execute() {
        this.control.upChannel();
    }
    
}
