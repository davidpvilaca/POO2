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
public class ControlTV {
    private ArrayList<String> channels;
    private int channelIndex;
    private String currentChannel;

    public ControlTV(ArrayList<String> channels) {
        this.setChannels(channels);
        
    }
    
    public ArrayList getChannels() {
        return channels;
    }

    public void setChannels(ArrayList channels) {
        this.channels = channels;
        if (channels.size() > 0) {
            this.channelIndex = 0;
            this.currentChannel = this.channels.get(channelIndex);
        } else {
            this.channelIndex = -1;
            this.currentChannel = null;
        }
    }
    
    public void addChannel(String channel) {
        this.channels.add(channel);
    }
    
    public void upChannel() {
        if (this.channelIndex == -1 || this.channels.size() <= this.channelIndex) { return; }
        this.setCurrentChannel(++this.channelIndex);
    }
    
    public void downChannel() {
        if (this.channelIndex < 1) { return; }
        this.setCurrentChannel(--this.channelIndex);
    }
    
    private void setCurrentChannel(int index) {
        this.currentChannel = this.channels.get(index);
    }
    
    public String getCurrentChannel() {
        return this.currentChannel;
    }
    
}
