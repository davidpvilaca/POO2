/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19Facadetelevisao;

/**
 *
 * @author davidpvilaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacadeTelevisao tv = new FacadeTelevisao();
        System.out.println("======LIGANDO TV======");
        tv.ligar();
        System.out.println("======ALTERANDO VOLUME DA TV======");
        tv.aumentarVolume();
        tv.diminuirVilume();
        System.out.println("======DESLIGANDO TV======");
        tv.desligar();
    }
    
}
