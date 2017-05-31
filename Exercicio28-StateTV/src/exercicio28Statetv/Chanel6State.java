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
public class Chanel6State extends ControlTvState {
    
    private final int channelNumber = 6;
    
    @Override
    public int channelNumber() {
        return this.channelNumber;
    }
 
}
