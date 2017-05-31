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
public class Control {
 
    private ControlTvState currentChannel;

    public Control(ControlTvState currentChannel) {
        this.currentChannel = currentChannel;
    }
    
    public ControlTvState getCurrentChannel() {
        return currentChannel;
    }
    
    public void nextChanel() {
        ControlTvState state = this.currentChannel.getNextState();
        this.currentChannel = state != null ? state : this.currentChannel;
    }
    
    public void previousChannel() {
        ControlTvState state = this.currentChannel.getPreviousState();
        this.currentChannel = state != null ? state : this.currentChannel;
    }
    
    public void homeChannel() {
        ControlTvState state = this.currentChannel;
        while (state.getPreviousState() != null) {
            state = state.getPreviousState();
        }
        this.currentChannel = state;
    }
    
    public void endChannel() {
        ControlTvState state = this.currentChannel;
        while (state.getNextState() != null) {
            state = state.getNextState();
        }
        this.currentChannel = state;
    }
    
    public void setChannel(ControlTvState channel) {
        this.currentChannel = channel;
    }
    
    public void printAtualChannel() {
        System.out.println("Canal atual: " + this.currentChannel.channelNumber());
    }

}
