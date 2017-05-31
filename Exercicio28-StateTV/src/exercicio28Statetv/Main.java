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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chanel4State channel4 = new Chanel4State();
        Chanel5State channel5 = new Chanel5State();
        Chanel6State channel6 = new Chanel6State();
        Chanel7State channel7 = new Chanel7State();
        
        channel4.setNextState(channel5);
        channel4.setPreviousState(null);
        channel5.setNextState(channel6);
        channel5.setPreviousState(channel4);
        channel6.setNextState(channel7);
        channel6.setPreviousState(channel5);
        channel7.setNextState(null);
        channel7.setPreviousState(channel6);
        
        Control control = new Control(channel4);
        
        control.printAtualChannel();
        
        System.out.println("Indo para o próximo canal...");
        control.nextChanel();
        control.printAtualChannel();
        
        System.out.println("Indo para o próximo canal: ");
        control.nextChanel();
        control.printAtualChannel();
        
        System.out.println("Indo para o canal anterior...");
        control.previousChannel();
        control.printAtualChannel();
        
        System.out.println("Indo para o primeiro canal...");
        control.homeChannel();
        control.printAtualChannel();
        
        System.out.println("Indo para o último canal...");
        control.endChannel();
        control.printAtualChannel();
        
        System.out.println("Indo direto para o canal 5...");
        control.setChannel(channel5);
        control.printAtualChannel();
        
        
    }
    
}
