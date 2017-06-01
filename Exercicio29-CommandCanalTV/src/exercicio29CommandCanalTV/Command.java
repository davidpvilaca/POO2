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
public abstract class Command {
    protected ControlTV control;

    public Command(ControlTV control) {
        this.control = control;
    }
    
    public abstract void execute();
}
