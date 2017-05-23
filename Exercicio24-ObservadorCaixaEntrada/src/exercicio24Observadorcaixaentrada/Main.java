/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio24Observadorcaixaentrada;

import exercicio24Observadorcaixaentrada.caixaDeEntrada.CaixaEntradaGrupo;

/**
 *
 * @author davidpvilaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CaixaEntradaGrupo caixa = new CaixaEntradaGrupo();
        caixa.setNovaMensagem("Mensagem 1");
        System.out.println("-=====================-");
        caixa.setNovaMensagem("Mensagem 2");
    }
    
}
