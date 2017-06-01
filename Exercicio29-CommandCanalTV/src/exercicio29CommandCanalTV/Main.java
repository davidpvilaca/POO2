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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> channelsList = new ArrayList();
        channelsList.add("4 - Globo");
        channelsList.add("4.1 - Globo HD");
        channelsList.add("6.1 - Record HD");
        channelsList.add("7.1 - SBT HD");
        
        ControlTV control = new ControlTV(channelsList);
        
        ControlTVListeners listeners = new ControlTVListeners();
        listeners.setCommands(new UpChannelCommand(control), new DownChannelCommand(control));
        
        printAtualChannel(control); //print
        System.out.println("======SUBINDO CANAL======");
        listeners.listenUp();
        printAtualChannel(control); //print
        listeners.listenUp();
        printAtualChannel(control); //print
        System.out.println("======DIMINUINDO CANAL======");
        listeners.listenDown();
        printAtualChannel(control); //print
        listeners.listenDown();
        printAtualChannel(control); //print
    }
    
    public static void printAtualChannel(ControlTV control) {
        System.out.println("Canal atual: " + control.getCurrentChannel());
    }
    
}
