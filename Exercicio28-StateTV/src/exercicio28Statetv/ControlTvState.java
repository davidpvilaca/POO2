/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio28Statetv;

/**
 *
 * @author davidpvilaca
 */
public abstract class ControlTvState {

    private ControlTvState nextState;
    private ControlTvState previousState;

    public abstract int channelNumber();

    public ControlTvState getNextState() {
        return nextState;
    }

    public void setNextState(ControlTvState nextState) {
        this.nextState = nextState;
    }

    public ControlTvState getPreviousState() {
        return previousState;
    }

    public void setPreviousState(ControlTvState previousState) {
        this.previousState = previousState;
    }
}
